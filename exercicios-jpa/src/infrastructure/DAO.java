package infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<T> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<T> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {

		}
	}
	
	public DAO () {
		this(null);
	}
	
	public DAO(Class<T> classe){
		em = emf.createEntityManager();
		this.classe = classe;
	}
	
	public DAO<T> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<T> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<T> incluir(T entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<T> incluirAtomico(T entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<T> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	public List<T> obterTodos(int quantidadeDeRegistros, int deslocamento) {
		if(classe == null) {
			throw new UnsupportedOperationException("Entidade nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<T> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidadeDeRegistros);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public T obterUm(Long id){
		return em.find(classe, id);
	}
	
	public void remover(Long id) {
		T encontrado = this.obterUm(id);
		
		if(encontrado != null) {
			this.abrirTransacao();
			em.remove(encontrado);
			this.fecharTransacao();
		}
	}
}

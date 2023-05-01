package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Maria Pereira"));
		System.out.println(dao.incluir(sql, "Guilherme Brand�o"));
		System.out.println(dao.incluir(sql, "Jo�o Batista"));
		System.out.println(dao.incluir(sql, "Eneias"));
		
		dao.close();
	}
}

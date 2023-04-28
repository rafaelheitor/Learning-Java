package excecao;

public class Aluno {

	public final String NOME;
	public final double NOTA;
	
	public Aluno(String nome, double nota){
		this.NOME = nome;
		this.NOTA = nota;
	}
	
	public String toString() {
		return String.format("%s tem nota %.2f", this.NOME, this.NOTA);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NOME == null) ? 0 : NOME.hashCode());
		long temp;
		temp = Double.doubleToLongBits(NOTA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (NOME == null) {
			if (other.NOME != null)
				return false;
		} else if (!NOME.equals(other.NOME))
			return false;
		if (Double.doubleToLongBits(NOTA) != Double.doubleToLongBits(other.NOTA))
			return false;
		return true;
	}
}

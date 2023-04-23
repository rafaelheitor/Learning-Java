package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;


	public Pessoa(String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return this.idade;
	}
	 
	public String getNomeCompleto() {
		return String.format("%s %s", this.nome, this.sobrenome);
	}
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <= 120) {			
			this.idade = idade;
		} 	
	}
	
	
	@Override
	public String toString() {
		return String.format("Olá meu nome é %s e tenho %d anos", 
				this.getNome(), this.getIdade());
	}
}

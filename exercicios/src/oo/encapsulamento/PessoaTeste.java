package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Nicolas", "Araujo", 31);
		pessoa1.setIdade(121);
		
		System.out.println(pessoa1);
		System.out.println(pessoa1.getNomeCompleto());
	}
}

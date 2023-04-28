package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", -7);
		
		try {
			Validar.aluno(aluno1);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {		
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}

package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
//		this.dia = 1;
//		this.mes = 1;
//		this.ano = 1970;
		
		this(1, 1, 1970);
	}
	String obterData() {
		String format = "%d/%d/%d";
		return String.format(format, this.dia, this.mes, this.ano); 
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterData());
	}
}

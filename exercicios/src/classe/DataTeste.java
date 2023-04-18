package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(10, 12, 1990);
		Data data2 = new Data();

		System.out.println(data1.obterData());
		System.out.println(data2.obterData());
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}
}

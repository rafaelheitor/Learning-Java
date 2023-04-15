package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		Byte byteExample = Byte.parseByte("123");
		Short shortExample = Short.parseShort("1200");
		Integer intExample = Integer.parseInt("2147483647");
		Long longExample = Long.parseLong("10L");
		Double doubleExample = Double.parseDouble("123.253");
		Float floatExample = Float.parseFloat("120.89F");
		Boolean isOnVacation = Boolean.parseBoolean("false");
		Character charExample = 'B';
		System.out.println(doubleExample);
		System.out.println(byteExample);
		System.out.println(shortExample);
		System.out.println(longExample);
		System.out.println(floatExample);
		System.out.println(isOnVacation);
		System.out.println(intExample);
		System.out.println(charExample);
		
	}
}

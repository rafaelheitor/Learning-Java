package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		//substitui caso o elemento já exista
		usuarios.put(1, "Rafael");
		usuarios.put(2, "Paulo");
		usuarios.put(3, "Joana");
		usuarios.put(4, "Matheus");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Paulo"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(2, "Paulo"));
		
		for(int key: usuarios.keySet()) {
			System.out.println(key);
		}
		
		for(String value: usuarios.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> user: usuarios.entrySet()) {
			System.out.print(user.getKey() + " >>> ");
			System.out.println(user.getValue());
		}
	}
}

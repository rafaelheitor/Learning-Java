package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {

	public final Set<Par<K, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(K chave, V valor) {
		if(chave == null) return;
		
		Par<K, V> novoPar = new Par<K, V>(chave, valor);
		
		if(this.itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(K chave) {
		if(chave == null) return null;
		
		Optional<Par<K, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}

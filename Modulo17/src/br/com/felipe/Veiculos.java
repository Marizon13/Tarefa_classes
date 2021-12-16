package br.com.felipe;

import java.util.Set;
import java.util.LinkedHashSet;


public class Veiculos<C extends Number, B> {
	
	private final Set<Aluguel<C, B>> veic = new LinkedHashSet<>();
	
	public void adicionar(C carro, B alug) {
		
		if(carro == null) return;
		
		Aluguel<C, B> novoAluguel = new Aluguel<C, B>(carro, alug);
		
		if(veic.contains(novoAluguel)) {
			veic.remove(novoAluguel);
			
		}
		
		veic.add(novoAluguel);
		
	}


	

}

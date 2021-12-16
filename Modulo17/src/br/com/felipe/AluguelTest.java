package br.com.felipe;

public class AluguelTest {
	public static void main(String[] args) {
		
		Veiculos<Integer, String> aluguelDeCarros = new Veiculos<>();
		
		aluguelDeCarros.adicionar(1, "Corolla");
		aluguelDeCarros.adicionar(2, "Civic");
		aluguelDeCarros.adicionar(3, "Hb20");
		aluguelDeCarros.adicionar(4, "Onix Plus");
		
		System.out.println(aluguelDeCarros);
			
	}

}

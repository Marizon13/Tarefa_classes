package br.com.felipe;

import java.util.List;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Ipessoa nomef = new PessoaFisica();
		nomef.nome( "João Paulo -");
		
		System.out.println(nomef.getTip());
		
		Ipessoa nomej = new PessoaJuridica();
		nomej.nome( "Pedro Henrique -");
		
		System.out.println(nomej.getTip());
		
	}
}

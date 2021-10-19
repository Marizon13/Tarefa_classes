package br.com.felipe;

public class CarrosManuais extends Fabrica {

	@Override
	Carro recuperarCarro(String notaSolicitada) {
		
			
			if ("A".equals(notaSolicitada)) {
				
				return new GolCarro(20, "meio tanque", "Vermelho");

		
	} else {
	}
	
		return new UnoCarro(15, "cheio", "Amarelo");
	}

}

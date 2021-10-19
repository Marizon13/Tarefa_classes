package br.com.felipe;

public class CarrosAutomatico extends Fabrica{

	@Override
	Carro recuperarCarro(String notaSolicitada) {
		
		if ("B".equals(notaSolicitada)) {
			
			return new SonataCarro(100, "cheio", "azul");
		
	} else {
		
	}
		
		return new AudioCarro(300, "cheio", "cinza");
	}

}

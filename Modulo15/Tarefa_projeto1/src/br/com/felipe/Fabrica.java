package br.com.felipe;

public abstract class Fabrica {
	
	
	 public Carro create(String notaSolicitada) {
		    Carro carro = recuperarCarro (notaSolicitada);
		    carro = prepareCar(carro);
	        return carro;
	        
	    }
	    private Carro prepareCar(Carro carro){
	    	carro.limpo();
	    	carro.verificaçãoMecanica();
	    	carro.combustivel();
	        return carro;
	    }
	    abstract Carro recuperarCarro(String notaSolicitada);
	

}
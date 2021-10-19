package br.com.felipe;

public abstract class Carro {
	
	private int horsePower;
    private String fonteCombustivel;
    private String cor;

    public Carro(int horsePower, String fonteCombustivel, String cor) {
        this.horsePower = horsePower;
        this.fonteCombustivel = fonteCombustivel;
        this.cor = cor;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println(" O carro está " + fonteCombustivel + " e ja foi ligado, e está pronto para utilizar " + horsePower + " cavalos de potência tem o carro" );
    }
    public void limpo(){
        System.out.println("O carro foi limpo e é da cor " + cor.toLowerCase() + " como brilha!!!!");
    }
    public void verificaçãoMecanica(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo está ok!");
    }
    public void combustivel(){
        System.out.println("O carro está sendo abastecido com " + fonteCombustivel.toLowerCase());
    }

	protected abstract boolean prepareCar();
}	



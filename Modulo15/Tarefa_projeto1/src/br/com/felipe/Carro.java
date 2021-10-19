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
        System.out.println(" O carro est� " + fonteCombustivel + " e ja foi ligado, e est� pronto para utilizar " + horsePower + " cavalos de pot�ncia tem o carro" );
    }
    public void limpo(){
        System.out.println("O carro foi limpo e � da cor " + cor.toLowerCase() + " como brilha!!!!");
    }
    public void verifica��oMecanica(){
        System.out.println("O carro foi verificado pelo mec�nico. Tudo est� ok!");
    }
    public void combustivel(){
        System.out.println("O carro est� sendo abastecido com " + fonteCombustivel.toLowerCase());
    }

	protected abstract boolean prepareCar();
}	



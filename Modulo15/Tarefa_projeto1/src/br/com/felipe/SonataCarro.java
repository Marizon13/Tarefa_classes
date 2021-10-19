package br.com.felipe;

public class SonataCarro extends Carro{

	public SonataCarro(int horsePower, String fonteCombustivel, String cor) {
		super(horsePower, fonteCombustivel, cor);
			}

	@Override
	protected boolean prepareCar() {
		// TODO Auto-generated method stub
		return false;
	}

}

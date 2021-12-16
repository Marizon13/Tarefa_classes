package br.com.felipe;

import java.util.Objects;

public class Aluguel<M, A> {

	private M veiculo;
	private A alugado;

	public Aluguel() {

	}

	public Aluguel(M veiculo, A alugado) {
		super();
		this.veiculo = veiculo;
		this.alugado = alugado;
	}

	public M getVeiculo() {
		return veiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(veiculo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel <?, ?>other = (Aluguel<?, ?>) obj;
		return Objects.equals(veiculo, other.veiculo);
	}

	public void setVeiculo(M veiculo) {
		this.veiculo = veiculo;
	}

	public A getAlugado() {
		return alugado;
	}

	public void setAlugado(A alugado) {
		this.alugado = alugado;
	}

}

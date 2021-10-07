package br.com.felipe;

public class PessoaJuridica implements Ipessoa {

	@Override
	public void nome(String texto) {
		
		 System.out.println("Nome pessoa Fisica: " + texto + " do Tipo de pessoa : " + getClass().getSimpleName());

	}

	@Override
	public String getTip() {
	
		return "Pessoa que possui Empresa";
	}

}

package br.com.felipe;

public class Demo {

	public static void main(String[] args) {
		
		
		Customizar cliente = new Customizar("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getPedidoNota());
        carro.startEngine();
    }

    private static Fabrica getFabrica(Customizar cliente) {
        if (cliente.contratoEmpresa()) {
            return new CarrosManuais();
        } else {
            return new CarrosAutomatico();
	
	
       }
    }
}

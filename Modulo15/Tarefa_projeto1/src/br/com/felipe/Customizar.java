package br.com.felipe;

public class Customizar {

	 private String PedidoNota;
	    private boolean contratoEmpresa;

	    public Customizar(String PedidoNota, boolean contratoEmpresa) {
	        this.PedidoNota = PedidoNota;
	        this.contratoEmpresa = contratoEmpresa;
	    }
	    public boolean contratoEmpresa() {
	        return contratoEmpresa;
	    }
	    public String getPedidoNota() {
	    	
	        return PedidoNota;
	    }
	}
	
	

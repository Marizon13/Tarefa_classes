public class Consulta {
	public static void main(String[] args) {

	//atendimento ao cliente
		
		String s = "Médico";
		s = s.toUpperCase();
		s = s.concat(": Dr.Welson");
		System.out.println(s);
		
		String x = "Enfermeira";
		x = x.toUpperCase();
		x = x.concat(": Maria");
		System.out.println(x);
		
		String y = "Paciente";
		y = y.toUpperCase();
		y = y.concat(": Rose da silva");
	    System.out.println(y);
	    
	    // DIA E HORA DA CONSULTA
	    
	    Date z = new Date();
		 System.out.println(z);
	}

}

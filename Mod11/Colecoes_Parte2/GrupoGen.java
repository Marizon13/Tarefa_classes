package ExercicioListas;

import java.util.ArrayList;
import java.util.List;

public class GrupoGen {
	
	public static void main(String[] args) {
		
		grupoMasculino();
		grupoFeminino();
				
	}
	
	private static void grupoMasculino() {
		
		System.out.println("** GRUPO MASCULINO **");
		
		List<String> lista1 = new ArrayList<String>();
		
		lista1.add("Marcio, Genero: Masculino");
		lista1.add("João, Genero: Masculino");
		lista1.add("Eduardo, Genero: Masculino");
		lista1.add("Bruno, Genero: Masculino");
		
		System.out.println(lista1);
		
	}
	
	private static void grupoFeminino() {
		
System.out.println("** GRUPO FEMININO **");
		
		List<String> lista2 = new ArrayList<String>();
		
		lista2.add("Maria, Genero: Feminino");
		lista2.add("Elisa, Genero: Feminino");
		lista2.add("Helena, Genero: Feminino");
		lista2.add("Suzana, Genero: Feminino");
		
		System.out.println(lista2);
		
		
		
	}

}

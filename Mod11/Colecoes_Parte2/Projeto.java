import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Projeto{

 public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
     ArrayList<String> usuarios = new ArrayList();
     ArrayList<String> usuarios2 = new ArrayList();
     
   
         for(int i = 0; i < 5; i++) {
    	     	   		
    	 System.out.println("Digite o Nome");
    	 String nome = scanner.nextLine();
    	 
    	 System.out.println("Digite o Sexo");
    	 String sexo = scanner.nextLine();
    	 
    	 
         
    	if (sexo.equals("F")) {
    		usuarios.add(nome);
	 
	    	
        	 
    	} else {
        
    		usuarios2.add(nome);

    	}
    		{

    		
    	    	System.out.println("Usuarios do Grupo Feminino" + usuarios);
    	    	System.out.println("Usuarios do Grupo Masculino" + usuarios2);
    		} }
    	

   	
         
}}
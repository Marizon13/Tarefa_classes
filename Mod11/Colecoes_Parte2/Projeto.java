
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Projeto {

 public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
     ArrayList<String> usuarios = new ArrayList();
     ArrayList<String> usuarios2 = new ArrayList();
     
     
     for(int i = 0; i < 3; i++) {
    	  
    	 
    	 System.out.println("Nome usuario masculino");
    	 String nome = scanner.nextLine();
    
    	
    	 System.out.println("Nome do usuario feminino");
    	 String nome2 = scanner.nextLine();
    
    	
    	 String u = new String();
    	 usuarios.add(nome);
    	 usuarios2.add(nome2);
    	
    	
    	
    	 
     }
     
    
	 System.out.println("Lista dos usuarios masculinos"  +  usuarios );

     System.out.println("Lista dos usuarios femininos"  +  usuarios2 );
 


}}
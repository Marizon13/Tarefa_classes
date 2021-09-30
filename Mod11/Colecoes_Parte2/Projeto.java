
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Projeto {

 public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
     ArrayList<String> usuarios = new ArrayList();
   
     for(int i = 0; i < 3; i++) {
    	 
    	 
    	 System.out.println("Nome usuario");
    	 String nome = scanner.nextLine();
    	 System.out.println("Genero M para masculino e F para feminino");
    	 String genero = scanner.nextLine();
    	 String u = new String();
    	 usuarios.add(nome);
    	 usuarios.add(genero);
    	
    	
    	
    	 
     }
     
     System.out.println("Lista dos usuarios e generos"  +  usuarios);
     
 


}}
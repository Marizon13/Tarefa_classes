
import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
		
	
		Scanner no1 = new Scanner(System.in);
		Scanner no2 = new Scanner (System.in);
		Scanner no3 = new Scanner (System.in);
		Scanner no4 = new Scanner (System.in);
		
		
		System.out.println(" Informe a primeira nota :");
		Float nota1 = no1.nextFloat();
		
		
		
		System.out.println(" Informe a segunda nota :");
		Float nota2 = no2.nextFloat();
		
		
		System.out.println(" Informe a terceira nota :");
		Float nota3 = no3.nextFloat();
		
		
		System.out.println(" Informe a quarta nota :");	
		Float nota4 = no4.nextFloat();
		
		
		Float resultado =(nota1 + nota2 + nota3 + nota4)/4;
		
		
		System.out.println(" A média da nota do aluno é : "+ resultado);
		
	
		
		
		if (resultado >= 7 && resultado <=10) { 
			System.out.println("Aprovado");
		}
		
		
		
		 else if (resultado >= 5 ) {
		System.out.println("Recuperação");
		
		}
		else { System.out.println("reprovado");
		
		}}}

		
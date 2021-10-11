import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Modulo12 {
	
	
	// 1 PARTE DO EXERCICIO

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome separado por , ");
		String nome = s.next();

		String[] separador = nome.split(",");
		Arrays.sort(separador);

		for (String i : separador) {

			System.out.println(i);

		}

		// 2 PARTE DO EXERCICIO

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> feminino = new ArrayList();
		ArrayList<String> masculino = new ArrayList();
		
		System.out.println("Digite o Nome-F para sexo Feminino ou Nome-M para sexo Masculino:");
		// EXEMPLO: Maria-F,João-M,Lucia-F,Marcio-M
		
		String nome1 = scanner.nextLine();

		String[] separadores = nome1.split(",");
		Arrays.sort(separadores);

		for (int i = 0; i < separadores.length; i++) {
			if (separadores[i].contains("-F")) {
				feminino.add(separadores[i]);
			} else {
				masculino.add(separadores[i]);
			}

		}

		System.out.println("Usuarios do Grupo Feminino" + feminino);
		System.out.println("Usuarios do Grupo Masculino" + masculino);

	}
}
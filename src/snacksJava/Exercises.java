package snacksJava;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		
		// SNACK 1 -> Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserire Numero ");
		
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + numero);
        } else {
            System.out.println("Il numero inserito è dispari, il successivo è: " + (numero + 1));
        }
        
        scanner.close();
		
		
	}
}

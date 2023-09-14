package snacksJava;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		
		// SNACK 1 -> Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo
		
		// Scanner scanner = new Scanner(System.in);
		
		// System.out.print("Inserire Numero ");
		
		// int numero = scanner.nextInt();
		
		// if (numero % 2 == 0) {
        //   System.out.println("Il numero inserito è pari: " + numero);
        // } else {
        //   System.out.println("Il numero inserito è dispari, il successivo è: " + (numero + 1));
        // }
        
        // scanner.close();
            
            
            
            
        // SNACK 2 -> Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, 
        // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		
			
			// array di stringhe contenenti nomi e cognomi casuali.
            
//            private static final String[] nomi = {
//            	    "Jay", "Daisy", "Tom", "Jordan", "Myrtle", "Nick", "George", "Meyer", "Lucille", "Pammy"
//            	};
//
//        	private static final String[] cognomi = {
//        	    "Gatsby", "Buchanan", "Wilson", "Carraway", "McKee", "Wolfsheim", "Fay", "Tobey", "Sloane", "Fitzgerald"
//        	};
        	
        
        	
        	
        	
        // SNACK 3 -> Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari
		
//		int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int sommaPosizioniDispari = 0;
//
//        for (int i = 0; i < numeri.length; i++) {
//            if (i % 2 != 0) { // Controlla se l'indice è dispari
//                sommaPosizioniDispari += numeri[i];
//            }
//        }
//
//        System.out.println("Array di numeri: " + java.util.Arrays.toString(numeri));
//        System.out.println("Somma degli elementi in posizione dispari: " + sommaPosizioniDispari);
		
		
		
		
		// SNACK 4 -> data in input una stringa, verificare se è palindroma oppure no
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        if (isPalindroma(input)) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
        
        scanner.close();
    }

	    // Metodo per verificare se una stringa è palindroma
	
	    private static boolean isPalindroma(String str) {
	    	
        // Rimuovi gli spazi e converte la stringa in minuscolo per una verifica senza distinzioni tra maiuscole e minuscole
	    	
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int lunghezza = str.length();
        
        for (int i = 0; i < lunghezza / 2; i++) {
            if (str.charAt(i) != str.charAt(lunghezza - 1 - i)) {
                return false;
            }
        }
        
        return true;

	}
}

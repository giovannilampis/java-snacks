package snacksJava;

import java.util.Scanner;

import java.util.Random;

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
            
//			String[] nomi = {
//			    "Jay", "Daisy", "Tom", "Jordan", "Myrtle", "Nick", "George", "Meyer", "Lucille", "Pammy"
//			};
//
//			String[] cognomi = {
//			    "Gatsby", "Buchanan", "Wilson", "Carraway", "McKee", "Wolfsheim", "Fay", "Tobey", "Sloane", "Fitzgerald"
//			};
//			
//			Random random = new Random();
//	
//
//			int indiceNomeRandom = random.nextInt(nomi.length);
//			
//			int indiceCognomeRandom = random.nextInt(cognomi.length);
//			
//			String nomeCasuale = nomi[indiceNomeRandom];
//			String cognomeCasuale = cognomi[indiceCognomeRandom];
//
//			System.out.println(nomeCasuale + " " + cognomeCasuale);


        	
        
        	
   
        	
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
		
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Inserisci una stringa: ");
//        String input = scanner.nextLine();
//        
//        if (isPalindroma(input)) {
//            System.out.println("La stringa è palindroma.");
//        } else {
//            System.out.println("La stringa non è palindroma.");
//        }
//        
//        scanner.close();
//        
//    	}

	    // Metodo per verificare se una stringa è palindroma
	
	    // private static boolean isPalindroma(String str) {
	    	
        // Rimuovi gli spazi e converte la stringa in minuscolo per una verifica senza distinzioni tra maiuscole e minuscole
	    	
//        str = str.replaceAll("\\s+", "").toLowerCase();
//        
//        int lunghezza = str.length();
//        
//        for (int i = 0; i < lunghezza / 2; i++) {
//            if (str.charAt(i) != str.charAt(lunghezza - 1 - i)) {
//                return false;
//            }
//        }
//        
//        return true;
		
		
		
		
		
		
		
		// SNACK 5 ->  Data una stringa in input, mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
		
//        Scanner scanner = new Scanner(System.in);
//        
//        while (true) {
//            System.out.print("Inserisci una stringa (o 0 per uscire): ");
//            String input = scanner.nextLine();
//            
//            if (input.equals("0")) {
                // Esci dal ciclo se l'utente inserisce "0"
//            	break; 
//            }
//            
//            int caratteriAlfabetici = 0;
//            int numeri = 0;
//            int simboliNonAlfanumerici = 0;
//            
//            for (char carattere : input.toCharArray()) {
//                if (Character.isLetter(carattere)) {
//                    caratteriAlfabetici++;
//                } else if (Character.isDigit(carattere)) {
//                    numeri++;
//                } else {
//                    simboliNonAlfanumerici++;
//                }
//            }
//            
//            System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
//            System.out.println("Numeri: " + numeri);
//            System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
//        }
//        
//        scanner.close();
		
		
		
		
		
		
		
		// SNACK 6 ->  Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.

		// Possibile usare solo : cicli, chartAt e if / switch
		
		
		
		
		
		
		
		// SNACK 7 -> Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
		
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Inserisci il numero di secondi: ");
//        int inputSecondi = scanner.nextInt();
        
        // Calcola le ore, i minuti e i secondi
//        int ore = inputSecondi / 3600;
//        int minuti = (inputSecondi % 3600) / 60;
//        int secondi = inputSecondi % 60;
        
        // Formatta la stringa risultante nel formato "hh:mm:ss"
//        String tempoFormat = String.format("%02d:%02d:%02d", ore, minuti, secondi);
//        
//        System.out.println("Tempo convertito: " + tempoFormat);
//        
//        scanner.close();
		
		
		
		
		
		
		// SNACK 8 -> Creare un array di 10 interi randomici compresi tra 100 e 150. Stampare tutti i valori 
		// contenuti nell'array (dopo averli inseriti). Stampare inoltre il valore minimo, massimo e la media
		
	
		        
//	   int[] numeri = new int[10];
	   
	   // Chiedi all'utente di inserire 10 valori compresi tra 100 e 150
	   
//        System.out.println("Inserisci 10 valori compresi tra 100 e 150: ");
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        for (int i = 0; i < numeri.length; i++) {
//        	
//            numeri[i] = scanner.nextInt();
//            
//            while (numeri[i] < 100 || numeri[i] > 150) {
//                System.out.println("Il valore inserito non è valido. Inserisci un valore compreso tra 100 e 150: ");
//                numeri[i] = scanner.nextInt();
//            }
//        }
		
		// scanner.close();
        
        // Stampa tutti i valori contenuti nell'array
        
//        System.out.println("Valori contenuti nell'array:");
//        for (int i = 0; i < numeri.length; i++) {
//            System.out.println(numeri[i]);
//        }
        
        // Calcola il valore minimo, massimo e la media
        
//        int minimo = numeri[0];
//        int massimo = numeri[0];
//        int somma = 0;
//        for (int i = 0; i < numeri.length; i++) {
//            if (numeri[i] < minimo) {
//                minimo = numeri[i];
//            }
//            if (numeri[i] > massimo) {
//                massimo = numeri[i];
//            }
//            somma += numeri[i];
//        }
//        double media = somma / numeri.length;

        // Stampa il valore minimo, massimo e la media
        
//        System.out.println("Valore minimo: " + minimo);
//        System.out.println("Valore massimo: " + massimo);
//        System.out.println("Media: " + String.format("%.2f", media));


		
		
		
		        
        // SNACK 9 -> chiedere all'utente numeri interi e calcolarne la somma, 
		// fino a che essa non superi il valore 1000
		
//		Scanner input = new Scanner(System.in);
//        int somma = 0;
//        
//        while (somma <= 1000) {
//            System.out.print("Inserisci un numero intero: ");
//            int numero = input.nextInt();

            // Aggiungi il numero alla somma
		
//            somma += numero;
            
            // Esci dal ciclo se la somma supera 1000
		
//            if (somma > 1000) {
//                break; 
//            }
//        }
//        
//        System.out.println("La somma dei numeri inseriti supera 1000 ed è pari a " + somma);
//        input.close();
		
		
		
		
		
		
		// SNACK 10 -> creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:

//		tutti gli elementi pari
//		tutti gli elementi dispari
//		tutti gli elementi in indice pari
//		tutti gli elementi in indice dispari
		
		
       	// Creo un array che conterrà 10 numeri interi
		
        int[] array = new int[10];
        Random rand = new Random();

        // Popolo l'array con numeri casuali compresi tra 100 e 1000
        
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(901) + 100; // Genera un numero tra 100 e 1000
        }
        
     // Stampa tutti gli elementi dell'array
        System.out.println("Tutti gli elementi:");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Stampa tutti gli elementi pari
        System.out.println("Tutti gli elementi pari:");
        for (int numero : array) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
        
     // Stampa tutti gli elementi dispari
        System.out.println("Tutti gli elementi dispari:");
        for (int numero : array) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        // Stampa tutti gli elementi in indice pari
        System.out.println("Tutti gli elementi in indice pari:");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Stampa tutti gli elementi in indice dispari
        System.out.println("Tutti gli elementi in indice dispari:");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


	}
}

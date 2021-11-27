//Classe BubbleSortSentinella
public class BubbleSortSentinella {

	//Metodo main
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {1, 2, 4, 3, 5, 6, 7};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo bubbleSortSentinella per ordinare l'array
		bubbleSortSentinella(array);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo di ordinamento bubbleSortSentinella
	//Input: array di valori int
	//Output: nessuno
	public static void bubbleSortSentinella(int[] arr) {

		//Ciclo esterno
		//Alla fine di ogni iterazione il valore più grande si troverà nell'ultima posizione dell'array
		for(int i=0; i<arr.length; i++) {

			//variabile "sentinella" che controlla se sono stati effettuati scambi
			//Assume il valore true se non sono stati effettuati scambi e quindi l'array risulta già ordinato, false altrimenti
			boolean isOrdinato = true;
			
			//Ciclo interno per effettuare gli scambi
			//Ad ogni iterazione viene scansionata la parte non ordinata dell'array,
			//a destra infatti si troveranno gli elementi più grandi già in maniera ordinata
			for(int j=0; j<arr.length-1-i; j++) {
				
				//confronto dei due elementi				
				if(arr[j] > arr[j+1]) {

					//scambio dei due elementi adiacenti

					int temp = arr[j];	//variabile temporanea per memorizzare uno dei due valori
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					//cambio la variabile "sentinella" a false poichè sono stati effettuati scambi e quindi l'array non era ordinato
					isOrdinato = false;
				}
			}

			//Controllo sulla variabile "isOrdinato"
			//Se non sono stati effettuati scambi allora l'array è già ordinato e la variabile "isOrdinato" è true
			if(isOrdinato) {
				
				//interrompo il ciclo esterno mediante il costrutto break poichè l'array risulta già ordinato
				break;

			}
		}
	}
}
//Classe BubbleSortOttimizzato
public class BubbleSortOttimizzato {

	//Metodo Main
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo bubbleSortOttimizzato per ordinare l'array
		bubbleSortOttimizzato(array);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo di ordinamento bubbleSortOttimizzato
	//Input: array di valori int
	//Output: nessuno
	public static void bubbleSortOttimizzato(int[] arr) {
		
		//Ciclo esterno
		//Alla fine di ogni iterazione il valore più grande si troverà nell'ultima posizione dell'array
		for(int i=0; i<arr.length; i++) {
			
			//Ciclo interno per effettuare gli scambi
			//Ad ogni iterazione viene scansionata la parte non ordinata dell'array,
			//a destra infatti si troveranno gli elementi più grandi già in maniera ordinata
			for(int j=0; j<arr.length-1-i; j++) {
				
				//confronto dei due elementi adiancenti
				if(arr[j] > arr[j+1]) {

					//scambio dei due elementi

					int temp = arr[j];	//variabile temporanea per memorizzare uno dei due valori
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
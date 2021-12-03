//Classe InsertionSort
public class InsertionSort {
	
	//Metodo main
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo insertionSort per ordinare l'array
		insertionSort(array);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo di ordinamento insertionSort
	//Input: array di valori int
	//Output: nessuno
	public static void insertionSort(int[] arr) {

		//Ciclo esterno
		//Esegue la scansione dell'array, visitando ogni elemento da ordinare
		//Parte dal secondo elemento dell''array
		for(int i=1; i<arr.length; i++) {

			//Elemento attuale da ordinare
			int chiave = arr[i];

			//Indice per il ciclo while
			int j = i-1;

			//Ciclo per inserire l'elemento attuale nella corretta posizione nella parte sinistra dell'array già ordinata
			while(j>=0 && arr[j] > chiave) {

				//Sposto gli elementi ordinati della parte sinistra di una posizione verso destra
				arr[j+1] = arr[j];

				//Aggiorno l'indice j, decrementandolo
				j = j-1;

			}

			//Inserisco la chiave nella sua posizione corretta in modo da mantenere ordinata la parte sinistra dell'array
			arr[j+1] = chiave;

		}

	}
}
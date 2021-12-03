//Classe SelectionSort
public class SelectionSort {
	
	//Metodo main
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo selectionSort per ordinare l'array
		selectionSort(array);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo di ordinamento selectionSort
	//Input: array di valori int
	//Output: nessuno
	public static void selectionSort(int[] arr) {

		int pos, temp;

		//Ciclo esterno
		//Ogni iterazione scansiona la parte destra dell'array ancora da ordinare
		//Alla fine di ogni iterazione gli elementi minori si troveranno ordinati nella parte sinistra
		for(int i=0; i<arr.length-1; i++) {

			//Prendo la posizione iniziale del ciclo come posizione temporanea del valore minimo
			pos = i;

			//Ciclo interno per trovare il valore minimo nella restante parte dell'array
			//Ad ogni iterazione vengono scansionati tutti gli elementi per trovare il più piccolo
			for(int j=i+1; j<arr.length; j++) {

				//confronti per trovare il valore minimo
				if(arr[j] < arr[pos]) {

					//aggiorno la posizione del nuovo valore minimo
					pos = j;

				}
			}

			//Effettuo lo scambio (con uso di una variabile temporanea)
			//Il valore minimo si troverà quindi a sinistra rispetto alla porzione di array analizzata
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;

		}

	}
}
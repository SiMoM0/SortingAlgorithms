class QuickSort {
	
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo selectionSort per ordinare l'array
		quickSort(array, 0, array.length-1);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo quickSort
	//Input: array di int, indice iniziale, indice finale
	public static void quickSort(int[] a, int low, int high) {

		if(low < high) {

			//indice per la suddivisione dell'array
			int pi = partition(a, low, high);

			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}

	public static int partition(int[] a, int low, int high) {

		int pivot = a[high];

		int i = low - 1;

		for(int j=low; j<=high; j++) {

			if(a[j] < pivot) {

				i++;
				swap(a, i, j);
			}
		}

		swap(a, i+1, high);

		return (i+1);
	}

	public static void swap(int[] arr, int i, int j) {

		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}

}
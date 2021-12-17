public class MergeSort {
	
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo selectionSort per ordinare l'array
		mergeSort(array, array.length);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	//Metodo mergeSort
	//Input: array di int, lunghezza dell'array
	public static void mergeSort(int[] a, int n) {

		if(n < 2) {
			return;
		}

		//Divido l'array in due parti
		int mid = 1 + (n-1)/2;
		int[] l = new int[mid];
		int[] r = new int[n-mid];

		for(int i=0; i<mid; i++) {
			l[i] = a[i];
			System.out.print(l[i]);
		}

		System.out.println();

		for(int j=mid; j<n; j++) {
			r[j-mid] = a[j];
			System.out.print(r[j-mid]);
		}

		System.out.println();

		//Passo ricorsivo
		mergeSort(l, mid);
		mergeSort(r, n-mid);
		
		merge(a, l, r, mid, n-mid);
	}

	//Metodo merge
	//Input: array iniziale, array di sinistra, array di destra, lunghezza array di sinistra e destra
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		System.out.println("Executing merge");

		int i=0, j=0, k=0;

		while(i < left && j < right) {
			if(l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}

		while(i < left) {
			a[k++] = l[i++];
		}

		while(i < right) {
			a[k++] = r[j++];
		}
	}

}
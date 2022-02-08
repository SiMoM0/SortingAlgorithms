public class HeapSort {
	
	public static void main(String[] args) {

		//Array iniziale di esempio
		int[] array = {6, 2, 4, 7, 3, 1, 5};

		//Stampa dell'array iniziale
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo


		//utilizzo del metodo selectionSort per ordinare l'array
		heapSort(array);


		//Stampa dell'array ora ordinato
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();	//a capo

	}

	public static void heapSort(int[] a) {

		int n = a.length;

		for(int i=(n/2)-1; i>=0; i--)
			heapify(a, n, i);

		for(int i=n-1; i>0; i--) {

			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapify(a, i, 0);
		}
	}

	public static void heapify(int[] a, int n, int i) {

		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;

		if(l < n && a[l] > a[largest])
			largest = l;

		if(r < n && a[r] > a[largest])
			largest = r;

		if(largest != i) {
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;

			heapify(a, n, largest);
		}
	}

}
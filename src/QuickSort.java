public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort qs = new QuickSort();
		String[] a = { "K", "C", "A", "I", "E", "L", "E", "P", "U", "T", "M", "Q", "R", "X", "O", "S" };
		System.out.println(qs.partition(a, 0, a.length - 1));
		for (String s : a) {
			System.out.print(s + " ");
		}
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Comparable v = a[lo];

		while (true) {

			// find item on lo to swap
			while (less(a[++i], v))
				if (i == hi)
					break;

			// find item on hi to swap
			while (less(v, a[--j]))
				if (j == lo)
					break; // redundant since a[lo] acts as sentinel

			// check if pointers cross
			if (i >= j)
				break;

			exch(a, i, j);
		}

		// put partitioning item v at a[j]
		exch(a, lo, j);

		// now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
		return j;
	}

	private static boolean less(Comparable a, Comparable b) {
		if (a.compareTo(b) < 0) {
			return true;
		} else {
			return false;
		}
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

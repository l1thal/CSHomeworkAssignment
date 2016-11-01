import java.util.*;//utilities
public class SortandMerge { //class
	public static void main(String[] args) { //main method
		Scanner input = new Scanner(System.in);//allow input


		//begin by calling the input and sorting method for the first array
		contributionFromTyler();
		int[] a = null; //initialize an array variable to be used, and later merged
		sort(a); //call the method

		//call the sorting method for second array
		System.out.println("Now do so a second time");
		System.out.println("");
		int[] b = null; //initialize an array variable to be used, and later merged
		sort(b); //call the method
		ContributionFromConner();
		//move on to the merger
		System.out.println("The merged lists are now: ");
		merge(a, b); //call the merge method

	}
	private static void contributionFromTyler() {
		System.out.println("Begin by defining two arrays");
	
	private static void ContributionFromConner() {
		System.out.prinln("Use the merge method to combine the arrays.")
	}
}
	//sorting method for input arrays
	public static void sort(int[] x){
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of your array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Sorted from smallest to largest:");
		for (int i = 0; i < n - 1; i++) 
		{
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);

	}
	//merge method for both arrays
	public static void merge(int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];
		int i = a.length - 1, j = b.length - 1, k = answer.length;

		while (k > 0)
			answer[--k] = 
			(j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];

	}

}
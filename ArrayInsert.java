import java.util.Scanner;

class ArrayInsert {
	static final Scanner sc = new Scanner(System.in);

	static void insert(int[] arr, int ind, int ele) {
		for (int i = arr.length - 1; i > ind; i--) {
			arr[i] = arr[i - 1];
		}
		arr[ind] = ele;
	}

	public static void main(String... args) {
		int[] arr = new int[6];
		System.out.println("Enter 5 elements in array: ");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the index to insert and element");
		int ind = sc.nextInt();
		System.out.println("Enter the element");
		int ele = sc.nextInt();
		insert(arr, ind, ele);
		System.out.println("The arrray elements after adding " + ele + " at the index " + ind + " is");
		for (int t : arr)
			System.out.println(t + " ");
	}
}
import java.util.Scanner;

class ArrayDelete {
    static final Scanner sc = new Scanner(System.in);

    static void insert(int[] arr, int ind) {
        for (int i = ind; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String... args) {
        int[] arr = new int[6];
        System.out.println("Enter 6 elements in array: ");
        for (int i = 0; i < 6; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the index to delete an element");
        int ind = sc.nextInt();
        System.out.println("The arrray elements after deleting " + arr[ind] + " is");
        insert(arr, ind);

        for (int t : arr)
            System.out.println(t + " ");
    }
}
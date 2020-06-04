import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements array 1: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter value of element " + (i+1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter number of elements array 2: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter value of element " + (i+1));
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[n1 + n2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i-n1];
        }
        System.out.println("New array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}

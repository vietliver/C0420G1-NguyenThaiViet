import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = scanner.nextInt();
        System.out.println("Enter column:");
        int column = scanner.nextInt();
        while (row != column) {
            System.out.println("Please reenter same values for row and column:");
            System.out.println("Enter row:");
            row = scanner.nextInt();
            System.out.println("Enter column:");
            column = scanner.nextInt();
        }
        float[][] array = new float[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value for element at index: " +  i + " " + j);
                array[i][j] = scanner.nextFloat();
            }
        }


       double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Sum = " + sum);
    }
}

import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = scanner.nextInt();
        System.out.println("Enter column:");
        int column = scanner.nextInt();
        float[][] array = new float[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value for element at index: " +  i + " " + j);
                array[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Enter the column you want to calculate sum:");
        int choice = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                if (j == choice) {
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
        System.out.println("Sum of column " + choice + " = " + sum);
    }
}

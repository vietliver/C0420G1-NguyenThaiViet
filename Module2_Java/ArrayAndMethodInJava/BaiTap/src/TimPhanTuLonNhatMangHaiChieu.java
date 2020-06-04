import java.util.Scanner;

public class TimPhanTuLonNhatMangHaiChieu {
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
        float max = array[0][0];
        int rowIndex = 0;
        int columnIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Maximum at index: " + rowIndex + " " + columnIndex);
    }
}

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 6; i++) {
            array[i] = i;
        }
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        System.out.println("Enter index:");
        int index = scanner.nextInt();

        if (index <= 1 || index >= (array.length - 1)) {
            System.out.println("Can not add number into array");
        } else {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = x;
            System.out.println("New array;");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }
    }
}

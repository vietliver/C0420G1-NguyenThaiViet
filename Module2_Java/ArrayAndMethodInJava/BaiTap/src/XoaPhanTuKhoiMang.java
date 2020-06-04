import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value of element " + (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter number to delete");
        int x = scanner.nextInt();
        int index = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = index; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            System.out.println("New array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Can not find the entered value");
        }
    }
}

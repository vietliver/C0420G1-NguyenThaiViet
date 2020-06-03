import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the botton-left square triangle");
        System.out.println("3. Print the top-left square triangle");
        System.out.println("4. Print the bottom-right triangle");
        System.out.println("5. Print the top-right square triangle");
        System.out.println("6. Print isosceles triangle");
        System.out.println("0. Exit");
        while(choice!= 0) {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the square triangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("Print the botton-left square triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Print the top-left square triangle");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Print the botton-right square triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= 1; j--) {
                            if (j > i) {
                                System.out.print("- ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println(" ");
                    }
                        break;
                case 5:
                    System.out.println("Print the top-right square triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j < i) {
                                System.out.print("- ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 7:
                    System.out.println("Print the isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j <= 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

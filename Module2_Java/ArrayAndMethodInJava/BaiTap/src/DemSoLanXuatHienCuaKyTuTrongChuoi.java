import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter a character:");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (character == input.charAt(i)) {
                count++;
            }
        }
        System.out.println("Ky tu: " + character + " lap lai " + count + " lan.");

    }
}

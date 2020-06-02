import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Nhap vao gia tri USD:");
        int usd = scanner.nextInt();
        System.out.println(usd + " USD = " + usd * rate + " VND");
    }
}

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        String result = "";
        while (n <= 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result += n + " ";
            }
            n++;
        }
        System.out.println("Prime number lists <100:");
        System.out.println(result);
    }
}


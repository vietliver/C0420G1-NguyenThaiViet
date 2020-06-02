
import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an interger number: ");
        int number = scanner.nextInt();
        String temp = "";
        char hundreds;
        char tens;
        char ones;
        if (number >= 0 && number < 20) {
            switch (number) {
                case 0:
                    temp = "zero";
                    break;
                case 1:
                    temp = "one";
                    break;
                case 2:
                    temp = "two";
                    break;
                case 3:
                    temp = "three";
                    break;
                case 4:
                    temp = "four";
                    break;
                case 5:
                    temp = "five";
                    break;
                case 6:
                    temp = "six";
                    break;
                case 7:
                    temp = "seven";
                    break;
                case 8:
                    temp = "eight";
                    break;
                case 9:
                    temp = "nine";
                    break;
                case 10:
                    temp = "ten";
                    break;
                case 11:
                    temp = "eleven";
                    break;
                case 12:
                    temp = "twelve";
                    break;
                case 13:
                    temp = "thirteen";
                    break;
                case 14:
                    temp = "fourteen";
                    break;
                case 15:
                    temp = "fifteen";
                    break;
                case 16:
                    temp = "sixteen";
                    break;
                case 17:
                    temp = "seventeen";
                    break;
                case 18:
                    temp = "eighteen";
                    break;
                case 19:
                    temp = "nineteen";
                    break;
            }
            System.out.println("Your entered number is: " + temp);
        } else if (number >= 20 && number < 100) {
            tens = Integer.toString(number).charAt(0);
            ones = Integer.toString(number).charAt(1);
            String temp1 = "";
            String temp2 = "";

            switch (String.valueOf(tens)) {
                case "2":
                    temp1 = "twenty";
                    break;
                case "3":
                    temp1 = "thirty";
                    break;
                case "4":
                    temp1 = "forty";
                    break;
                case "5":
                    temp1 = "fifty";
                    break;
                case "6":
                    temp1 = "sixty";
                    break;
                case "7":
                    temp1 = "seventy";
                    break;
                case "8":
                    temp1 = "eighty";
                    break;
                case "9":
                    temp1 = "ninety";
                    break;
            }
            switch (String.valueOf(ones)) {
                case "0":
                    temp2 = "";
                    break;
                case "1":
                    temp2 = "one";
                    break;
                case "2":
                    temp2 = "two";
                    break;
                case "3":
                    temp2 = "three";
                    break;
                case "4":
                    temp2 = "four";
                    break;
                case "5":
                    temp2 = "five";
                    break;
                case "6":
                    temp2 = "six";
                    break;
                case "7":
                    temp2 = "seven";
                    break;
                case "8":
                    temp2 = "eight";
                    break;
                case "9":
                    temp2 = "nine";
                    break;
            }
            System.out.println("Your entered number is: " + temp1 + " " +  temp2);
        } else if (number >= 100 && number < 1000) {
            hundreds = Integer.toString(number).charAt(0);
            tens = Integer.toString(number).charAt(1);
            ones = Integer.toString(number).charAt(2);
            String temp1 = "";
            String temp2 = "";
            String temp3 = "";

            switch (String.valueOf(tens)) {
                case "2":
                    temp1 = "twenty";
                    break;
                case "3":
                    temp1 = "thirty";
                    break;
                case "4":
                    temp1 = "forty";
                    break;
                case "5":
                    temp1 = "fifty";
                    break;
                case "6":
                    temp1 = "sixty";
                    break;
                case "7":
                    temp1 = "seventy";
                    break;
                case "8":
                    temp1 = "eighty";
                    break;
                case "9":
                    temp1 = "ninety";
                    break;
            }
            switch (String.valueOf(ones)) {
                case "0":
                    temp2 = "";
                    break;
                case "1":
                    temp2 = "one";
                    break;
                case "2":
                    temp2 = "two";
                    break;
                case "3":
                    temp2 = "three";
                    break;
                case "4":
                    temp2 = "four";
                    break;
                case "5":
                    temp2 = "five";
                    break;
                case "6":
                    temp2 = "six";
                    break;
                case "7":
                    temp2 = "seven";
                    break;
                case "8":
                    temp2 = "eight";
                    break;
                case "9":
                    temp2 = "nine";
                    break;
            }
            switch (String.valueOf(hundreds)) {
                case "1":
                    temp3 = "one";
                    break;
                case "2":
                    temp3 = "two";
                    break;
                case "3":
                    temp3 = "three";
                    break;
                case "4":
                    temp3 = "four";
                    break;
                case "5":
                    temp3 = "five";
                    break;
                case "6":
                    temp3 = "six";
                    break;
                case "7":
                    temp3 = "seven";
                    break;
                case "8":
                    temp3 = "eight";
                    break;
                case "9":
                    temp3 = "nine";
                    break;
            }
            System.out.println("Your entered number is: " + temp3 + " hundred and " + temp1 + " " +  temp2);
        } else {
            System.out.println("Out of ability");
        }
    }
}

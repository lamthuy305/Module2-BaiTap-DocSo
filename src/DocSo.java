import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        String soCanDoc = "";
        if (number < 10) {
            switch (number) {
                case 0:
                    soCanDoc = "Zero";
                    break;
                case 1:
                    soCanDoc = "One";
                    break;
                case 2:
                    soCanDoc = "Two";
                    break;
                case 3:
                    soCanDoc = "Three";
                    break;
                case 4:
                    soCanDoc = "Four";
                    break;
                case 5:
                    soCanDoc = "Five";
                    break;
                case 6:
                    soCanDoc = "Six";
                    break;
                case 7:
                    soCanDoc = "Seven";
                    break;
                case 8:
                    soCanDoc = "Eight";
                    break;
                case 9:
                    soCanDoc = "Nine";
                    break;
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    soCanDoc = "Ten";
                    break;
                case 11:
                    soCanDoc = "Eleven";
                    break;
                case 12:
                    soCanDoc = "Twelve ";
                    break;
                case 13:
                    soCanDoc = "Thirteen ";
                    break;
                case 14:
                    soCanDoc = "Fourteen";
                    break;
                case 15:
                    soCanDoc = "Fifteen ";
                    break;
                case 16:
                    soCanDoc = "Sixteen";
                    break;
                case 17:
                    soCanDoc = "Seventeen";
                    break;
                case 18:
                    soCanDoc = "Eighteen";
                    break;
                case 19:
                    soCanDoc = "Nineteen";
                    break;
            }
        }
        if (!soCanDoc.equals("")) {
            System.out.println("Đọc là: " + soCanDoc);
        } else {
            System.out.println("Không đọc được");
        }
    }
}

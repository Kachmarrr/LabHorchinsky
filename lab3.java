import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть восьмизначне десяткове число:  ");
        int num = sc.nextInt();

        if ((num < 10000000) || (num > 99999999)) {
            System.out.println("Введене число не є восьмизначним.");
            sc.close();
            return;
        }

        int[] digits = new int[8];
        int temp = num;
        for (int i = 7; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }


        int[][] resultArray = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0) {
                    resultArray[i][j] = digits[7 - i];
                } else {
                    resultArray[i][j] = digits[i];
                }
            }
        }

        System.out.println("Двовимірний масив: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

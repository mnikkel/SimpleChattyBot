import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int count = 0;

        for (int i = 0; i <= 1000 && count < 3; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                count += 1;
                System.out.println(i);
            }
        }


    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int x = scan.nextInt();
            if (x % 6 == 0) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
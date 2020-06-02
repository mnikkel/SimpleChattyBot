import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        if ((k % n == 0 || k % m == 0) && n * m >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
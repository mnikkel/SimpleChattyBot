import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long m = scan.nextLong();

        long factorial = 1;
        int n = 1;
        while (factorial <= m) {
            factorial *= n;
            n++;
        }
        System.out.println(n - 1);
    }
}
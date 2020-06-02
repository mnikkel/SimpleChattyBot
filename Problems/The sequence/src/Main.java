import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int max = 0;

        while(scan.hasNext()) {
            int x = scan.nextInt();
            if (x % 4 == 0 && x > max) {
                max = x;
            }
        }

        System.out.println(max);
    }
}
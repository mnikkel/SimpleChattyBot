import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int previous = scan.nextInt();
        int current = scan.nextInt();
        boolean asc = true;
        boolean desc = true;
        while (current != 0) {
            if (previous > current) {
                asc = false;
            } else if (previous < current) {
                desc = false;
            }
            if (!asc && !desc) {
                break;
            }
            previous = current;
            current = scan.nextInt();
        }

        if (asc || desc) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
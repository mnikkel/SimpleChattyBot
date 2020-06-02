import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        String yearType = "Regular";

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            yearType = "Leap";
        }

        System.out.println(yearType);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pbCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean weekendSuccess = weekend && (pbCups >= 15 && pbCups <= 25);
        boolean weekdaySuccess = !weekend && (pbCups >= 10 && pbCups <= 20);

        System.out.println(weekdaySuccess || weekendSuccess);
    }
}
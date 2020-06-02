import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String firstLetter = str.substring(0, 1);
        System.out.println(firstLetter.equalsIgnoreCase("J"));
    }
}
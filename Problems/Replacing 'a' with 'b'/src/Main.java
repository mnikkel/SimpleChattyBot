import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var str = scan.next();
        var replaced = str.replace('a', 'b');
        System.out.println(replaced);
    }
}
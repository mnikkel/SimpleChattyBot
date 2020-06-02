import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();
        int bridgeCount = scan.nextInt();
        boolean crash = false;

        for (int i = 0; i < bridgeCount; i++) {
            if (!(scan.nextInt() > height)) {
                System.out.println("Will crash on bridge " + (i + 1));
                crash = true;
                break;
            }
        }

        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int k;
            Scanner scanner = new Scanner(System.in);
            k = scanner.nextInt();
            if (k % 3 == 0) {
                System.out.println("GCV");
            } else if (k % 3 == 1) {
                System.out.println("VGC");
            } else if (k % 3 == 2) {
                System.out.println("CVG");
            }
            scanner.close();
        }
    }

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((n - i) < j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

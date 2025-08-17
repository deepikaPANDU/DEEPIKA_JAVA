import java.util.Scanner;
public class Neonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;
        while (sq != 0) {
            sum += sq % 10;
            sq = sq / 10;
        }
        if (sum == n) {
            System.out.println("neon number" + sum);
        } else {
            System.out.println("not neon number");
        }

    }
}
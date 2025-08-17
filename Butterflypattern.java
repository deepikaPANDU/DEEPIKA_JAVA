public class ButterflyPattern{
    public static void main(String args[]) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            int star = i;
            int space = 2 * (a - 1);
            for (int j = 1; j <= star; j++) {
                System.out.println("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = a; i >= i; i--) {
            int src = i;
            int space = 2 * (a - 1);
            for (int j = 1; j <= space; j++) {
                System.out.println("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
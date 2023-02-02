public class Main {
    public static void getDiamond(int n){
        for (int i = -n / 2; i <= n/2; i++) {
            for (int j = 0; j <  Math.abs(i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - 2*Math.abs(i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getDiamond(3);
    }
}

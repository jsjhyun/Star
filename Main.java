public class Main {
    public static void getIsoscelesTriangle(int n){
        for(int i = 0; i < n; i++) {
            for (int j = 1; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getIsoscelesTriangle(3);
    }
}
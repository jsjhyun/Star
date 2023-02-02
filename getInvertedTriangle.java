public class Main {
    public static void getInvertedTriangle(int n){
        for(int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getInvertedTriangle(5);
    }
}

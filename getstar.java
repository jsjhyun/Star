public class Main {
    public static void getstar(int n){ // static 메소드끼리 호출이 가능하다.
        for(int i = 0; i < n; i++)
            System.out.print("*");
    }
    public static void main(String[] args) {
        getstar(4);
    }
}

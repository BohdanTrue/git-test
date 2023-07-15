public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Сума а та b = " + sum(a,b));
        System.out.println("а помонжити на b = " + multiply(a,b));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}

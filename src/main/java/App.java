import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

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

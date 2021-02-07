import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outlights gaem = new outlights(5);
        gaem.random();
        System.out.println(gaem);

        while (true) {
            System.out.println("zadej X");
            int x = sc.nextInt();
            System.out.println("zadej Y");
            int y = sc.nextInt();
            gaem.onoff(x, y);
            System.out.println(gaem);
        }
    }
}

import java.util.Scanner;

public class Konwertowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź int:");
        int i = scanner.nextInt();
        System.out.println("Wprowadź double:");
        double d = scanner.nextDouble();
        System.out.println("Wprowadź char:");
        char c = scanner.next().charAt(0);
        System.out.println("Wprowadź boolean");
        boolean b = scanner.nextBoolean();

        System.out.println("Zmienna " + d + " typu double została przekształcona na typ int i wynosi " + (int)d);
        System.out.println("Zmienna " + i + " typu int została przekształcona na typ double i wynosi " + (double)i);
        System.out.println("Zmienna " + c + " typu char została przekształcona na typ int i wynosi " + (int)c);
        System.out.println("Zmienna " + b + " typu boolean została przekształcona na typ String i wynosi " + String.valueOf(b));

        KartyGraficzne nowaKarta = new KartyGraficzne("GeForce GTX 1660 SUPER", 6, 1169);
        nowaKarta.wyswietlInformacje();
    }
}
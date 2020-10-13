import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double result;

        try {
            System.out.println("Bitte geben Sie folgende Werte ein:");
            System.out.println("1. Wert");
            x = sc.nextDouble();

            System.out.println("2. Wert");
            y = sc.nextDouble();

            result = x + y;
            System.out.println("Das Ergebnis lautet: " + result);
        }
        catch (Exception e)
        {
            System.out.println("Ungültige Eingabe!!!");
            System.out.println("Bitte geben Sie nur Zahlen ein!!!");
        }
    }
}
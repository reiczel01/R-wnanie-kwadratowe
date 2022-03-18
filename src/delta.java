
import java.util.Scanner;
public class delta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double delta;
        double pierwiastek;
        boolean check = false;

        /* Wprowadzanie zmiennych i sprawdzanie typu */
        while(!check) {
            System.out.println("podaj a:");
            try {
                a = Double.parseDouble(input.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadziłeś nieprawidłowe znaki!!!");

            }
        }
        check = false;

        while(!check) {
            System.out.println("podaj b:");
            try {
                b = Double.parseDouble(input.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadziłeś nieprawidłowe znaki!!!");

            }
        }
        check = false;

        while(!check) {
            System.out.println("podaj c:");
            try {
                c = Double.parseDouble(input.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadziłeś nieprawidłowe znaki!!!");

            }
        }

        /* Oblicznie delty */
        delta = b*b-4*a*c;

        /* Sprawdzanie delty i wylicznie x */
        if (delta == 0)
        {
            System.out.println("delta = "+(-b/(2*a)));
        }
        pierwiastek = Math.sqrt(delta);
        if (delta > 0)
        {
            System.out.println("x1 =" + ((-b-pierwiastek)/(2*a)));
            System.out.println("x1 =" + ((-b+pierwiastek)/(2*a)));
        }
        if (delta < 0)
            System.out.println("Nie ma pierwiastków");
    }
}

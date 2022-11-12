import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Жашынызды киргизиниз:");
        int b = scanner.nextInt();
        old(b);
    }

    public static void old(int a) {
        if (a >= 8 && a <= 18) {
            System.out.println("Сиз мектеп окучусусуз.");
        } else if (a >= 18) {
            System.out.println("Сиз иштейсиз же студетсиз");
        } else if (a==5) {
            System.out.println("сиз садике барасыз");
    } else {
            System.out.println("сиз тороло элексиз");
        }
    }
}

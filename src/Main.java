//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz nazwę swojej klasy");
    String name = scanner.nextLine();
    System.out.println("Podaj poziom klasy: ");
    int level = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Witaj " + name + ". Za " + (5 - level) + " lata będę pisał maturę!");

    System.out.println("Co chcesz robić po zakończeniu szkoły średniej");
    String plan = scanner.nextLine();
    System.out.println(plan);
}


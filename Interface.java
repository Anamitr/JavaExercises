import java.util.Scanner;

public class Interface {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cat kot = new Cat();

        System.out.print("Podaj imiê kota: ");
        kot.setName(input.nextLine());

        System.out.print("Podaj, kto jest opiekunem kota: ");
        kot.setOwner(input.nextLine());

        System.out.println("Dziêkujê, teraz ju¿ wiem prawie wszystko o kocie!");
    }
}
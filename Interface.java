import java.util.Scanner;


public class Interface {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cat kot = new Cat(), kot2 = new Cat();
        kot.setName("Baltazar");
        kot2.setName("Nabuchodonozor");
        
        CatShelter kotowisko = new CatShelter();
        kotowisko.addCat(kot);
        kotowisko.addCat(kot2);
        System.out.println(kotowisko.getCatName(1));
        
        //System.out.println(kot.getBirthday() + "   " + kot.getWeight());

        System.out.println("Dziekuje, teraz juz wiem prawie wszystko o kocie!");
    }
}
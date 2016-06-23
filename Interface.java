import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Interface {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cat kot = new Cat();

/*        System.out.print("Podaj imiê kota: ");
        kot.setName(input.nextLine());

        System.out.print("Podaj kto jest opiekunem kota: ");
        kot.setOwner(input.nextLine());*/
        
        System.out.print("Podaj date urodzin kota: ");
        Pattern date = Pattern.compile("([0-9]{2}\\.){2}[0-2][0-9]{3}");//Pattern.compile("([1-9]{2}\\.){2}[0-2][1-9]{3}");
        Matcher macher = date.matcher(input.nextLine());  
        System.out.println(macher.matches());
        System.out.print("Podaj wage kota: ");
        try {
        	kot.setWeight(Float.parseFloat(input.nextLine()));
        } catch(NumberFormatException e) {
        	System.out.println("Error! NumberFormatException");
			System.exit(0);
        }
        
        //System.out.println(kot.getBirthday() + "   " + kot.getWeight());

        System.out.println("Dziêkujê, teraz ju¿ wiem prawie wszystko o kocie!");
    }
}
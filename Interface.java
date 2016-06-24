import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Interface {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    	List<Cat> catShelter = new ArrayList<Cat>();
    	while(true) {
    		System.out.println("--\tMenu\t--");
        	System.out.println("1. Add cat");
        	System.out.println("2. Display all");
        	System.out.println("3. Exit");
        	Integer action;
        	try {
        		action = input.nextInt();
        	} catch(InputMismatchException e) {
        		System.out.println("Wrong command");
        		action = 0;
        		input.nextLine();
        	}        	
        	
        	switch (action) {
        	case 1:
        		Cat cat = new Cat();
        		cat.setName("Mruczyk");
        		catShelter.add(cat);
        		break;
        	case 2:
        		int id = -1;
        		do {
        			System.out.println("Type cat id:");        		
            		try {
            			id = input.nextInt();
                	} catch(InputMismatchException e) {
                		System.out.println("Wrong id");
                		input.nextLine();
                	}
        		} while (id < 0 || id >= catShelter.size());
        		System.out.println("Imie kota o id " + id + " to " + catShelter.get(id).getName());        		
        		break;
        	case 3: System.exit(0);
        	}
    	}
    	
    	
/*        Cat kot = new Cat(), kot2 = new Cat();
        kot.setName("Baltazar");
        kot2.setName("Nabuchodonozor");
        
        CatShelter catShelter = new CatShelter();
        catShelter.addCat(kot);
        catShelter.addCat(kot2);
        System.out.println(catShelter.getCatName(1));
        
        //System.out.println(kot.getBirthday() + "   " + kot.getWeight());

        System.out.println("Dziekuje, teraz juz wiem prawie wszystko o kocie!");*/
    }
    
    static void cls() {
		System.out.print("");
	}
}
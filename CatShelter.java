import java.util.ArrayList;
import java.util.List;

public class CatShelter {
	List<Cat> catList;
	CatShelter() {
		catList = new ArrayList<Cat>();
	}
	public void addCat(Cat cat) {
		catList.add(cat);
	}
	public String getCatName(int i) {
		return catList.get(i).getName();
	}
}
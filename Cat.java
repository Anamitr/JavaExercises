import java.util.Date;

public class Cat {
	String name, owner;
	Date birthday;
	Float weight;	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthDay) {
		this.birthday = birthDay;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
}
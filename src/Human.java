
public class Human {
	
	String name;
	
	int age;
	
	public Human(String nameArg, int ageArg){
		name = nameArg; // this.name
		age = ageArg; // this.age
	}
	
    public String toString() {
    	return name + " е на " + age + " години. ";
    }	
}

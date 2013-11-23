import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!");
		int myInt = scan.nextInt();
		System.out.println(myInt);
		Tasks.task1();
		double m[] = {23.4, 34.6, 45.7};
		Tasks.task2(m);
		scan.close();
		Human stoyan = new Human("Stoyan", 50); 
		System.out.println(stoyan.age + stoyan.name);
		System.out.println(stoyan.toString());
		
		Student stoyanStudent = new Student("Stoyan", 50, "12345678");
		System.out.println(stoyanStudent.toString());
	}

}
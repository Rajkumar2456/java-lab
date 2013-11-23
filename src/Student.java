
public class Student extends Human {
	String fnumber;
	
	public Student(String name, int age, String fnumber){
		// С ключовата дума super се обръщаме към родителския клас.
		// В случая - към родителския конструктор.
		super(name, age);
		
		// this e обръщение/референция към текущия клас
		// на атрибута "фн" задаваме стойността на параметъра фн
		// използваме пълното име на атрибута (this.фн),
		// защото под името фн е видима последно дефинираната променлива - параметъра фн.
		this.fnumber = fnumber;
	}
	
	public String toString()
	{
		// Ако има еднакви имена на атрибути и методи на класа, 
		// за да се обърнем към родителски метод използваме super
		return super.toString() + " Той е студент с фн: " + fnumber;
	}
	
}

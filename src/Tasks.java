
public class Tasks {
	
	public static void task1(){
		System.out.println("Hello world");
	}
	
	public static void task2(double m[]) { // double []m m[] or double[] m
		double sum = 0; // в тази променлива ще записваме сумата
		for (int i = 0; i < m.length; i++)
			sum += m[i]; // прибавяме стойността на i-ия елемент към suma

		double rezult = sum / m.length;

		System.out.println("Средно аритметичната сума е: " + rezult);

	}
}

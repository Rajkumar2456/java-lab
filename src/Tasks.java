
public class Tasks {
	
	public static void task1(){
		System.out.println("Hello world");
	}
	
	public static void task2(double m[]) { // double []m m[] or double[] m
		double sum = 0; // � ���� ���������� �� ��������� ������
		for (int i = 0; i < m.length; i++)
			sum += m[i]; // ��������� ���������� �� i-�� ������� ��� suma

		double rezult = sum / m.length;

		System.out.println("������ ������������� ���� �: " + rezult);

	}
}

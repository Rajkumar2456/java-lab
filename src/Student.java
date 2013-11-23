
public class Student extends Human {
	String fnumber;
	
	public Student(String name, int age, String fnumber){
		// � ��������� ���� super �� �������� ��� ����������� ����.
		// � ������ - ��� ����������� �����������.
		super(name, age);
		
		// this e ���������/���������� ��� ������� ����
		// �� �������� "��" �������� ���������� �� ���������� ��
		// ���������� ������� ��� �� �������� (this.��),
		// ������ ��� ����� �� � ������ �������� ������������ ���������� - ���������� ��.
		this.fnumber = fnumber;
	}
	
	public String toString()
	{
		// ��� ��� ������� ����� �� �������� � ������ �� �����, 
		// �� �� �� ������� ��� ���������� ����� ���������� super
		return super.toString() + " ��� � ������� � ��: " + fnumber;
	}
	
}

package Lab23.Num1;
import java.lang.Math.*;

public class Example3 {
	public static void main(String[] args) {
		Example1 myVal;
		myVal = () -> 98.6;
		System.out.println("���������� �������� "+myVal.Example1());
		Example2 myPval = (n) -> 1.0/n;
		System.out.println("�������� �������� 4 ����� " + myPval.getValue(4.0));
		System.out.println("�������� �������� 8 ����� " + myPval.getValue(8.0));
		myVal = () -> 5.0; //������������ �������� ������ ���� double
//		myPval = () -> Math.random(); //��������� ������� ����� � ����� ���������� double, � �� ��� ����������.
	}
}

package Lab23.Num3;

public class Example3 {
	public static void main(String[] args) {
		Example1 isIn = (a,b) -> a.indexOf(b) != -1;
		String str = "��� ����";
		System.out.println("����������� ������: "+ str);
		if(isIn.test(str, "���"))
			System.out.println("'���' �������");
		else System.out.println("'���' �� �������");
		if(isIn.test(str, "xyz"))
			System.out.println("'xyz' �������");
		else System.out.println("'xyz' �� �������");
	}
}
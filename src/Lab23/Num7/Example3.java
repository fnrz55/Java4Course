package Lab23.Num7;

public class Example3 {
	public static void main(String[] args) {
		int num = 10;
		Example1 myLambda = (n) -> {
			int v = n;
//			int v = num + n;
//			num++;  //������ ��������� �� ����� �������� ����������, �.�. �������� final. ����� ��������� ������� ����� ���������� num
			return v;
		};
		System.out.println(myLambda.func(8));
		num = 9;
	}

}

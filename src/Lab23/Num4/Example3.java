package Lab23.Num4;

public class Example3 {
	public static void main(String[] args) {
		Example1 smallestF = (n) -> {
			int result = 1;
			n = n < 0 ? -n : n;
			for(int i = 2; i <= n/i; i++){
				if((n%i)==0) {
					result = i;
					break;
				}
			}
			return result;
		};
		System.out.println("���������� ��������� 12 �������� "+ smallestF.func(12));
		System.out.println("���������� ��������� 11 �������� "+ smallestF.func(11));
	}

}

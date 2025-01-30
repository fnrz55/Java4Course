package Lab23.Num10;

public class Example2 {
	public static void main(String[] args) {
		boolean result;
		Example3 myNum = new Example3(12);
		Example3 myNum2 = new Example3(16);
		
		Example1 ip = myNum::isFactor;
		result = ip.test(3);
		
		if(result) System.out.println("3 является делителем " + myNum.getNum());
		
		ip = myNum2::isFactor;
		result = ip.test(3);
		if(!result) System.out.println("3 не является делителем "+ myNum2.getNum());
	}

}

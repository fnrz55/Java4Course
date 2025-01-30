package Lab23.Num11;

public class Example3 {
	private int[] array1;
	Example3(){
		array1 = new int[10];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = i+1;
		}
}
	void getArray1() {
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
}

}

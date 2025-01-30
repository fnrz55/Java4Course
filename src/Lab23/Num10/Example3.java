package Lab23.Num10;

public class Example3 {
	private int v;
	Example3(int x) {v = x;}
	int getNum() {return v;}
	boolean isFactor (int n) {
		return (v % n) == 0;
	}
}

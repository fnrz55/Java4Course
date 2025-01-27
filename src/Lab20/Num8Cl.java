package Lab20;

public class Num8Cl {
    private int sum;
    synchronized int sumArray(int nums[]){
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("������� ����� ��� " + Thread.currentThread().getName() + "= " + sum);
        }
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println("������� ����� �������������");
        }
        return sum;
    }
}

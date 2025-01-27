package Lab20;

public class Num9Cl {
private int sum;
int sumArray(int nums[]){
    sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        System.out.println("Текущее значение для " + Thread.currentThread().getName() + "= " + sum);
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
    }
    return sum;
}
}

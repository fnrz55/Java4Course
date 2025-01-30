package Lab23.Num13;

public class Z6 {
    public static void main(String[] args) {
        boolean result;
        int num1 = 18, num2 = 21;
        Example3 myNum = new Example3(12);
        Example3 myNum2 = new Example3(16);
        
        Ex1_z6 ip = myNum::isFactor;
        result = ip.test(3);
        if(result) System.out.println("3 является делителем "+ myNum.getNum());
        
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 не является делителем "+ myNum2.getNum());
        
        ip = myNum::hasCommonFactor;
        result = ip.test(num1);
        if(result) System.out.println(num1 + " и 12 имеют минимальный общий делитель " + myNum.getDivider(num1));
        else System.out.println(num1 + " и 12 не имеют общий делитель");

        ip = myNum2::hasCommonFactor;
        result = ip.test(num2); 
        if(result) System.out.println(num2 + " и 16 имеют минимальный общий делитель "+ myNum2.getDivider(num2));
        else System.out.println(num2 + " и 16 не имеют общий делитель");
    }
}
package Lab23.Num13;

public class Example3 {
    private int v;
    
    Example3(int x) {v = x;}
    
    int getNum() {return v;}
    
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
    
    boolean hasCommonFactor(int n) {
        int min = Math.min(v, n); 
        for (int i = 2; i <= min; i++) { 
            if (v % i == 0 && n % i == 0) {
                return true; 
            }
        }
        return false;
    }
    
    int getDivider(int n) {
        int min = Math.min(v, n); 
        for (int i = 2; i <= min; i++) { 
            if (v % i == 0 && n % i == 0) {
                return i; 
            }
        }
        return -1;
    }
    
}
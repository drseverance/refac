public class Main
{
    
    public static void main(String [] args) {
        System.out.println(fac(5));
         System.out.println(reFac(5));
    }
    
    static long fac(int n){
        long fact = n;
        for(int i =n; i>1; i--){
            fact = fact * (i-1);
        }
        return fact;
    }
    
    static long reFac(int n){
        long fact = n;
        if (n > 1) {
            fact = reFac(n-1) * n;
        }
        return fact;
    }
}

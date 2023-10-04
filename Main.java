public class Main 
{
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.adder(1,1.1));
        System.out.println(c.adder(1.1,1.1));

    }
}

class Cal{
    int adder(int a, int b){
        return a + b;
    }
    
    int adder (int a, int b, int c){
        return a + b + c;
    }
    
    double adder (double a, double b){
        System.out.println("It's me!");
        return a + b;
    }
    
    double adder (int a, double b){
        return a + b;
    }
    
}
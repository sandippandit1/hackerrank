import java.util.Scanner;

public class static_initializer9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int b = sc.nextInt();
            int h = sc.nextInt();
            
            sc.close();
            
            if(b <=0 || h <=0) {
               throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            
            System.out.println(b * h);
            
                
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

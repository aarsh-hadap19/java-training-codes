
import java.util.Scanner;
public class Print_Test_Cases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=1;i <= 10000;i++){
            int n=sc.nextInt();
            if(n==0){
                System.exit(0);
            }
            System.out.println("Case "+i+": "+n);
        }
    }
}

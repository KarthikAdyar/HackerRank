import java.util.*;

public class Kangaroo{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int x1=in.nextInt();
        int v1=in.nextInt();
        int x2=in.nextInt();
        int v2=in.nextInt();
        while(x1<=x2){

            if (x1 == x2) {
                System.out.println("YES");
               break;
            }
        
            x1 +=v1;
            x2 +=v2;
          } if(x1!=x2){
               System.out.println("NO");
          }
            
        
     }
}

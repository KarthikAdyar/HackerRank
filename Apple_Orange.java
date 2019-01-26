import java.util.*;

public class AppOra{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int t=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int m=in.nextInt();
        int n=in.nextInt();
        int apple=0;
    
        for(int i=0;i<m;i++){
             int arr=in.nextInt()+a;
        
            if(arr>=s && arr<=t){
                apple++;
            }
        }
        int orange=0;
        for(int i=0;i<n;i++){
            int arr=in.nextInt()+b;

            if(arr>=s && arr<=t){
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}

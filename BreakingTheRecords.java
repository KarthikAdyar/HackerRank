import java.util.*;

public class Records{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int scores[]=new int[n+1];
        for(int i=0;i<n;i++){
            scores[i]=in.nextInt();
        }
        int mncount=0,mxcount=0;
       int  min = scores[0];
        int max = scores[0];
        for(int i=1;i<n;i++){
           if(scores[i]>max){
               max=scores[i];
               mxcount++;
           }
           else if(scores[i]<min){
               min=scores[i];
               mncount++;
           }
             
        }
        System.out.println(mxcount + " "+mncount);
       
       
       
    }
}

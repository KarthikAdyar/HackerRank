import java.util.*;

public class Grades{
    void grades(int a){
        if(a<38){
            System.out.println(a);
        }
        else if((a%5)==0){
            System.out.println(a);
        }
        else if((a+2)%5==0){
            System.out.println(a+2);
        }
        else if((a+2)%5==1){
            System.out.println(a+1);
        }
        else{
            System.out.println(a);
        }
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int grades[]=new int[n+1];
        for(int i=0;i<n;i++){
            grades[i]=in.nextInt();
        }
        Grades g=new Grades();
        for(int i=0;i<n;i++){
            g.grades(grades[i]);
        }
    }
}

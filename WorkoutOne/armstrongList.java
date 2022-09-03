import java.util.*;
class armstrongList{
    public static void main(String args[]){
        int a=0,b=0;
       Scanner s=new Scanner(System.in);
            System.out.println("enter the first number");
            a=s.nextInt();
            System.out.println("enter the limit number");
            b=s.nextInt();
        for(int i=a;i<=b;i++){
        int c,rev,sum=0;
        c=i;
        while( c!=0){
            rev=c%10;
            sum=sum+(rev*rev*rev);
            c=c/10;
        }
        if(sum==i){
            System.out.println(""+i+"is armstrong number");
        }
      }
   }
}
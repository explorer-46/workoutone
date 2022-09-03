import java.util.*;
class largeThree{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      int large=0,a=0,b=0,c=0;
      System.out.println("enter the first number:");
      a=s.nextInt();
      System.out.println("enter the second number:");
      b=s.nextInt();
      System.out.println("enter the third number:");
      c=s.nextInt();
      large=a;
      if(large<b)
      large=b;
      if(large<c)
      large=c;
      System.out.println(large+"is largest");
    }
}
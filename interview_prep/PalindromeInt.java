import java.util.*;
class PalindromeInt {
    public static  boolean isPalindrome(int x) {
      //default value is false
        boolean result = false;
      //reverse is used for checking with original
        int reverse=0;
      //if input is an negative and we take temporary varialble to perform operations
        int temp=Math.abs(x);
      //if it is negative then result is false
      if(x<0)result=false;
      //logic 
      while(temp!=0){
        reverse=(reverse*10)+(temp%10);
        temp=temp/10;
      }
      if(reverse==x){
        result=true;
      }
    
    return result;
    }
  //main method
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean res=isPalindrome(n);
    System.out.println(res);
    
}
}
  

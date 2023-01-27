import java.util.*;

class SumOfDigit{
  public static void main(String args[]){
    SumOfDigit obj = new SumOfDigit();
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    System.out.println("Answer : " + obj.sumOfDigit(n));
  }

  public int sumOfDigit(int n){
    if(n==0||n==1){
      return n;
    }
    if(n<0){
      return -1;
    }

    return n%10 + sumOfDigit(n/10);
  }
}
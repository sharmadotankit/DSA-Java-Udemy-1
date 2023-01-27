import java.util.*;

class Fibonacci{
  public static void main(String args[]){
    Fibonacci obj = new Fibonacci();
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number of elements : ");
    int n = sc.nextInt();
    System.out.println("Answer : " + obj.fibonacci(n));
  }

  public int fibonacci(int n){
    if(n<0){
      return -1;
    } 
    if(n==0|| n==1){
      return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    Factorial recursiveFactorial = new Factorial();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to find factorial : ");
    int n = sc.nextInt();
    int ans = recursiveFactorial.factorial(n);
    System.out.println("Answer : "+ ans);
  }

  public int factorial(int n){
    if(n==1 || n==0){
      return 1;
    }
    if(n<0){
      return -1;
    }
    
    return n*factorial(n-1);
  }
}
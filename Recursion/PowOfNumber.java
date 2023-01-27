import java.util.*;

class PowOfNumber{
  public static void main(String args[]){
    PowOfNumber obj = new PowOfNumber();
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    System.out.println("Enter power : ");
    int p = sc.nextInt();
    System.out.println("Answer : " + obj.powOfNumber(n,p));
  }

  public int powOfNumber(int n,int p){
    if(p<0){
      return -1;
    }
    if(p==0){
      return 1;
    }
    return n*(powOfNumber(n, p-1));
  }
}
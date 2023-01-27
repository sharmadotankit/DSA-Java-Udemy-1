import java.util.*;

// Euclidean algorithm is used for finding GCD
/*
gcd(48,18)
Step 1 : 48/18 = 2 remainder 12
Step 2 : 18/12 = 1 remainder 6
Step 3 : 12/6 = 2 remainder 0
GCD = 6
*/
class GCD{
  public static void main(String args[]){
    GCD obj = new GCD();
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number 1 : ");
    int n1 = sc.nextInt();
    System.out.println("Enter number 2 : ");
    int n2 = sc.nextInt();
    
    System.out.println("Answer : " + obj.gcd(n1,n2));
  }

  public int gcd(int n1,int n2){
    if(n1<0 || n2<0){
      return -1;
    }
    
    if(n2==0){
      return n1;
    }

    return gcd(n2,n1%n2);
  }
}
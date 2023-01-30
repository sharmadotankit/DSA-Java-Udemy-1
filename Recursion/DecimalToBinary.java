import java.util.Scanner;

class DecimalToBinary {
  public static void main(String[] args) {
    DecimalToBinary recursiveBinary = new DecimalToBinary();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to find decimalToBinary : ");
    int n = sc.nextInt();
    int ans = recursiveBinary.decimalToBinary(n);
    System.out.println("Answer : "+ ans);
  }

  public int decimalToBinary(int n){
    if(n==0){
      return n;
    }

    return n%2+ 10*decimalToBinary(n/2);
  }
}
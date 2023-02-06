/**
 * ProductOfArray
 */
public class ProductOfArray {
  public static void main(String args[]){
    int[] arr = new int[]{1,2,3,4,5};
    int ans = productofArray(arr, 5);
    System.out.println("Answer"+ ans);
  }

  public static int productofArray(int A[], int N) {

    if (N <= 0) {
      return 1;
    }

    return A[N - 1] * productofArray(A, N - 1);
  }

}
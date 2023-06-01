import java.util.*;

public class Exercise {
  public boolean permutation(int[] array1, int[] array2) {
    // TODO
    if (array2.length != array1.length) {
      return false;
    }

    HashSet<Integer> ansSet = new HashSet();
    for (int i = 0; i < array1.length; i++) {
      ansSet.add(array1[i]);
    }
    for (int i = 0; i < array2.length; i++) {
      if (ansSet.contains(array2[i])) {
        continue;
      } else {
        return false;
      }
    }

    return true;
  }

}
public class ArrayOps {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int largest(int[] arr) {
      int largest = 0;
      for (int i : arr) {
        if (i > largest) {
          largest = i;
        }
      }
      return largest;
    }

    public static void main(String[] args) {

    }
}

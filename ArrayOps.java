public class ArrayOps {
  public static String arrToString(int[] arr) {
      String str = "{";
      for (int i = 0; i < arr.length; i++) {
          str = str + arr[i];
          if (i < arr.length - 1) {
              str = str + ", ";
          }
      }
      return str + "}";
  }
  public static int sum(int[] arr) {
      int sum = 0;
      for (int i : arr) {
          sum += i;
      }
      return sum;
  }

  public static int sum(int[][] arr) {
    int sum = 0;
    for (int[] i : arr) {
      sum += sum(i);
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int largest = arr[0];
    for (int i : arr) {
      if (i > largest) {
        largest = i;
      }
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = sum(matrix[i]);
    }
    return arr;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = largest(matrix[i]);
    }
    return arr;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] arr = new int[matrix[0].length];
    int[] col = new int[matrix.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        col[j] = matrix[j][i];
      }
      arr[i] = sum(col);
    }
    return arr;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] arr = sumRows(matrix);
    for (int i : arr) {
      if (i != arr[0]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

  }
}

public class Tester {
    public static void main(String[] args) {
        System.out.println(ArrayOps.sum(new int[] { 1, 2, 3 }));
        System.out.println(ArrayOps.sum(new int[] { 234, -3, 46 }));
        System.out.println(ArrayOps.sum(new int[] { }));

        System.out.println(ArrayOps.largest(new int[] {1, 2, 3}));
        System.out.println(ArrayOps.largest(new int[] { 234, -3, 46}));
        System.out.println(ArrayOps.largest(new int[] {4, 4}));
    }
}

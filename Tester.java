

public class Tester {
    public static void main(String[] args) {
        System.out.println(ArrayOps.sum(new int[] { 1, 2, 3 }));
        System.out.println(ArrayOps.sum(new int[] { 234, -3, 46 }));
        System.out.println(ArrayOps.sum(new int[] { }));

        System.out.println(ArrayOps.largest(new int[] {1, 2, 3}));
        System.out.println(ArrayOps.largest(new int[] { 234, -3, 46}));
        System.out.println(ArrayOps.largest(new int[] {4, 4}));

        System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(new int[][] { {1, 2, 3}, {234, -3, 46}, {} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(new int[][] { {4, 4} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(new int[][] { {} })));

        System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(new int[][] { {1, 2, 3}, {234, -3, 46}, {78} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(new int[][] { {4, 4} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(new int[][] { {-2, -5}, {2}, {234, 235, 823, -23} })));

        System.out.println(ArrayOps.sum(new int[][] { {1, 2, 3}, {234, -3, 46}, {} }));
        System.out.println(ArrayOps.sum(new int[][] { {-2, -5} }));
        System.out.println(ArrayOps.sum(new int[][] { {} }));

        System.out.println(ArrayOps.arrToString(ArrayOps.sumCols(new int[][] { {1, 2, 3}, {234, -3, 46}, {78, 0, -49} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.sumCols(new int[][] { {4, 4} })));
        System.out.println(ArrayOps.arrToString(ArrayOps.sumCols(new int[][] { {-2, -5}, {28, 823}, {234, -23} })));

        System.out.println(ArrayOps.isRowMagic(new int[][] { {1, 2, 3}, {234, -3, 46}, {} }));
        System.out.println(ArrayOps.isRowMagic(new int[][] { {-2, -5}, {-7, 0} }));
        System.out.println(ArrayOps.isRowMagic(new int[][] { {} }));

        System.out.println(ArrayOps.isColMagic(new int[][] { {1, 2, 3}, {234, -3, 46}, {78, 0, 49} }));
        System.out.println(ArrayOps.isColMagic(new int[][] { {-2, 4}, {12, 6} }));
        System.out.println(ArrayOps.isColMagic(new int[][] { {3} }));

        int[][]E = { {  2,  4, 2 }, {  2, 2, 2 } };
        System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
        System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
        int[][]F = { {  -3,  24, 5 }, {  2, 3, 4 } };
        System.out.println(ArrayOps.isLocationMagic(F, 0, 1));
        System.out.println(ArrayOps.isLocationMagic(F, 1, 2));
    }
}

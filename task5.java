import java.util.Arrays;
public class task5 {
    public static void clearNE(int[][] m) {
        if (m == null) {
            throw new NullPointerException("Матриця null");
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                throw new NullPointerException("Рядок null");
            }
            for (int j = 0; j < m[i].length; j++) {
                if (j >= i) {
                    m[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        clearNE(mat);
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
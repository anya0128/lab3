import java.util.Arrays;
public class task9 {
    public static int[] toArray(int[][] m) {
        if (m == null) {
            throw new NullPointerException("Матриця null");
        }
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                throw new NullPointerException("Рядок null");
            }
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0) {
                    count++;
                }
            }
        }
        int[] res = new int[count * 3];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0) {
                    res[k++] = i;
                    res[k++] = j;
                    res[k++] = m[i][j];
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {0, 5, 0},
            {2, 0, 0},
            {0, 0, 9}
        };
        int[] ans = toArray(mat);
        System.out.println("Масив: " + Arrays.toString(ans));
    }
}

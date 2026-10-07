public class task23 {
    public static int countZeros(int[] a) {
        if (a == null) {
            throw new NullPointerException("Масив не існує");
        }
        int k = 0;
        for (int x : a) {
            if (x == 0) {
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 5, 0, -3, 0};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {0, 0};
        System.out.println("Тест 1 (нулів має бути 3): " + countZeros(arr1));
        System.out.println("Тест 2 (нулів має бути 0): " + countZeros(arr2));
        System.out.println("Тест 3 (нулів має бути 2): " + countZeros(arr3));
        try {
            countZeros(null);
        } catch (NullPointerException e) {
            System.out.println("Помилка: передано null");
        }
    }
}
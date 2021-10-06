public class Scanline {
    public static void main(String[] args) {
        int[] arr = {-92,89,-59,40,13,40, 3,-51,98,-52,-98,71};
        System.out.println(Scanline.scanline(arr));
    }

    public static int scanline(int[] array) {
        int max = 0;

        int sum = 0;
        for (int i:array) {
            sum += i;
            if (sum>max) max=sum;
        }

        sum = max;
        for (int i:array) {
            sum -= i;
            if (sum>max) max=sum;
        }

        return max;
    }
}
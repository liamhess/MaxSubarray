public class BruteForce2 {

	public static void main(String[] args) {
		int[] arr = {-92,89,-59,40,13,40, 3,-51,98,-52,-98,71};

		System.out.println(BruteForce2.algo(arr));
	}

    public static int algo(int[] array) {

		int max = 0;
		
		for (int i=0; i<array.length; i++) {
			int sum = 0;
			for (int n=i; n<array.length; n++) {
				sum += array[n];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
    }
}
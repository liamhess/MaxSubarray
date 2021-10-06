public class BruteForce {

	public static void main(String[] args) {
		int[] arr = {-92,89,-59,40,13,40, 3,-51,98,-52,-98,71};

		System.out.println(BruteForce.algo(arr));
	}

    public static int algo(int[] array) {

		int max = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int n=i; n<array.length; n++) {
				int sum = 0;
				for (int j=i; j<=n; j++) sum+=array[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
    }
}
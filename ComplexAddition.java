public class ComplexAddition {
	public static void main(String[] args) {
		int[] a = {5, 1, 3};
		int[] b = {9, 7, 7, 7};

		int maxLength = Math.max(a.length, b.length);
		int[] result = new int[maxLength + 1];
		int carry = 0;

		int i = 0, j = 0, k = 0;


		while (i < a.length || j < b.length || carry != 0) {
			int sum = carry;

			if (i < a.length) {
				sum += a[i];
				i++;
			}

			if (j < b.length) {
				sum += b[j];
				j++;
			}

			result[k] = sum % 10;
			carry = sum / 10;
			k++;
		}


		System.out.print("Result: ");
		for (int m = 0; m < result.length; m++) {
			System.out.print(result[m]);
		}
	}
}
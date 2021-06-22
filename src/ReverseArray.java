
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7,8 };
		arr1 = reverseArrayWithOneArray(arr1);
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
	}

	private static int[] reverseArray(int[] array) {

		int[] arr2 = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			arr2[array.length - 1 - i] = array[i];
		}
		return arr2;
	}

	private static int[] reverseArrayWithOneArray(int[] array) {
			
		for (int i = 0; i <array.length/2; i++) {
			int x=array[i];
			int y=array[array.length-1-i];
			array[array.length-1-i]=x;
			array[i]=y;
		}
		return array;
	}

}

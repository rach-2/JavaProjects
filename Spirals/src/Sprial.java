
public class Sprial {

	public static void main(String[] args) {

		int number = 3;
		int a = 1;
		int counter = 0;

		int[][] spiral = new int[3][3];

		for (int i = 0; i < spiral.length - 1; i++) {

			for (int j = 0; j < spiral.length - 1; j++) 
			{
				counter++;
				spiral[i][j] = a * counter;

			}

		}

		for (int i = 0; i < spiral.length - 1; i++) {

			for (int j = 0; j < spiral.length - 1; j++) {
				System.out.println(spiral[i][j]);

			}

		}

		// while (a < 9) {
		//
		// int counter = 0;
		//
		// for (int i = 0; i < spiral.length - 1; i++) {
		// counter++;
		// a++;
		// System.out.print(1 * counter);
		//
		// }
		//
		// for (int j = 0; j < spiral.length - 1; j++) {
		// counter++;
		// a++;
		// System.out.println(1 * counter);
		//
		// }
		//
		// }

	}

}

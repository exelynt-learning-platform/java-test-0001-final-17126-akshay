
//    *
//   * *
//  *   *
// *     *
//*       *
// *     *
//  *   *
//   * *
//    *

package Patterns;

import java.util.Scanner;

public class PatternStar_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number For Pattern ");
		int n = sc.nextInt();

		int st = 1;
		int sp = n;

		for (int i = 1; i <= n * 2 - 1; i++) { // i<=9

			if (i <= n) {
				st = i * 2 - 1; //
				sp--; // 4
				int count = 1;
				for (int j = 1; j <= sp; j++) // Print Space
					System.out.print("  ");

				for (int j = 1; j <= st; j++, count++) {// Print Star
					if (count == 1 || count == st)
						System.out.print("* ");
					else
						System.out.print("  ");
				}

				System.out.println();

			}else {
				sp++;
				st = st-2;
				
				int count = 1; // for making space under the pattern
				for (int j = 1; j <= sp; j++) // Print Space
					System.out.print("  ");

				for (int j = 1; j <= st; j++, count++) {// Print Star
					if (count == 1 || count == st)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
				
			}

		}

	}

}

package assignment;

import java.util.Scanner;

/**
 * Develop a solution for validating and converting date values to a specific format.
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class Assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Print Header
		System.out.println("---------------------------------");
		System.out.println("- Welcome to RRC Date Formatter -");
		System.out.println("---------------------------------\n");

		// Day input
		System.out.print("Please enter a valid Day (1-31): ");
		int iDay = sc.nextInt();

		// Month input
		System.out.print("Please enter a valid Month (1-12): ");
		int iMonth = sc.nextInt();

		// Year input
		System.out.print("Please enter a valid Year (1582-9999): ");
		int iYear = sc.nextInt();

		// Print a blank line
		System.out.println("");

		// Validate day
		if (iDay < 1 || iDay > 31) {
			System.out.println("[" + iDay + "] is an invalid day value.\n");
			System.exit(0);
		}

		// Validate month
		if (iMonth < 1 || iMonth > 12) {
			System.out.println("[" + iMonth + "] is an invalid month value.\n");
			System.exit(0);
		}

		// Validate year
		if (iYear < 1582 || iYear > 9999) {
			System.out.println("[" + iYear + "] is an invalid year value.\n");
			System.exit(0);
		}

		// Validate day for leap year.
		if (iMonth == 2) {
			if (((iYear % 4 == 0) && (iYear % 100 != 0)) || 
			((iYear % 4 == 0) && (iYear % 100 == 0) && (iYear % 400 == 0))) {
				if (iDay > 29) {
					System.out.println("[" + iDay + "] is an invalid day value for the month specified.\n");
					System.exit(0);
				} 
			} else {
				if (iDay == 29) {
					System.out.println("[" + iDay + "] is an invalid day value for the month specified.\n");
					System.out.println("February only has 29 days on a leap year.\n");
					System.exit(0);
				}
				if (iDay > 28) {
					System.out.println("[" + iDay + "] is an invalid day value for the month specified.\n");
					System.exit(0);
				}
			}
		}// end Validate day for leap year.

		// Convert numeric month to month's name
		String oMonth = "";
		switch (iMonth) {
			case 1:
				oMonth = oMonth.concat("January");
				break;
			case 2:
				oMonth = oMonth.concat("February");
				break;
			case 3:
				oMonth = oMonth.concat("March");
				break;
			case 4:
				oMonth = oMonth.concat("April");
				break;
			case 5:
				oMonth = oMonth.concat("May");
				break;
			case 6:
				oMonth = oMonth.concat("June");
				break;
			case 7:
				oMonth = oMonth.concat("July");
				break;
			case 8:
				oMonth = oMonth.concat("August");
				break;
			case 9:
				oMonth = oMonth.concat("September");
				break;
			case 10:
				oMonth = oMonth.concat("October");
				break;
			case 11:
				oMonth = oMonth.concat("November");
				break;
			case 12:
				oMonth = oMonth.concat("December");
				break;
		}

		// Validate day for months with 30 days
		if (iMonth == 4 || iMonth == 6 || iMonth == 9 || iMonth == 11) {
			if (iDay > 30) {
				System.out.println("[" + iDay + "] is an invalid day value for the month specified.");
				System.out.println("The month [" + oMonth + "] has only 30 days. \n");
				System.exit(0);
			}
		}

		// Print valid date response.
		System.out.println(oMonth + " " + iDay + ", " + iYear + "\n");

		sc.close();
		
	}
}

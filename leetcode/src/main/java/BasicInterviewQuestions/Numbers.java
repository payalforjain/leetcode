package BasicInterviewQuestions;

public class Numbers {

	public static void concatenateNumbers(long x, long y) {
		long temp = y;
		do {
			temp = temp / 10;
			x = x * 10;
		} while (temp > 0);
		System.out.println(x + y);
	}

	/* Prints multiplication table in Java */

	public static void printMultiplicationTable(int n) {

		for (int c = 1; c <= 10; c++)
			System.out.println(n + "*" + c + " = " + (n * c));
	}



	// Write a method to convert an integer into a roman numeral string

	/*
	 * checking if number is power of 2 using bit shift operator in java e.g. 4
	 * in binary format is "0000 0000 0000 0000 0000 0000 0000 0100"; and -4 is
	 * "1111 1111 1111 1111 1111 1111 1111 1100"; and 4&-4 will be
	 * "0000 0000 0000 0000 0000 0000 0000 0100"
	 */
	private static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number: " + number);
		}
		if ((number & -number) == number) {
			return true;
		}
		return false;
	}

	/*
	 * checking if number is power of 2 using brute force starts with 1,
	 * multiplying with 2 it will eventually be same as original number
	 */
	private static boolean powerOfTwo(int number) {
		int square = 1;
		while (number >= square) {
			if (number == square) {
				return true;
			}
			square = square * 2;
		}
		return false;
	}

	/*
	 * find if an integer number is power of 2 or not using bit shift operator
	 */

	private static boolean checkPowerOfTwo(int number) {
		if (number <= 0) {
			return false;
		}

		return ((number & (number - 1)) == 0);
	}

	public static void StringToIntExample() {
		String s = "100";

		try {
			// the String to int conversion happens here
			int i = Integer.parseInt(s.trim());

			// print out the value after the conversion
			System.out.println("int i = " + i);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
	}

	public static int StringToInt(String input) {
		char[] a = input.toCharArray();
		int perass = (int) '0';
		int result = 0;
		for (char temp : a) {
			int tempascii = (int) temp;
			result = (result * 10) + (tempascii - perass);
		}
		return result;
	}

	public static void StringToFloatExampleViceVersa() {
		String strFloat = "100.1";
		float fValue = Float.valueOf(strFloat);
		System.out.printf("String %s is parse to float %f in Java using valueOf %n", strFloat, fValue);

		// Converting String to Float using Float.parsetFloat() method
		String strFloat2 = "150.15";
		float fValue2 = Float.parseFloat(strFloat2);
		System.out.printf("String %s is converted to float %f in Java using parseFloat %n", strFloat2, fValue2);

		// Parse String to Float Object in Java
		String strFloat3 = "-200.2F";
		Float fValue3 = new Float(strFloat3);
		System.out.printf("String %s is converted to float object %f in Java using" + " Float constructor %n",
				strFloat3, fValue3);

		// Second part - Converting float values to String in Java
		// Converting float data type to String in Java using + operator
		// concatenation
		float fValue4 = 657.2f; // remember f suffix, floating points defaults
		// to double in Java
		String strFloat4 = "" + fValue4;
		System.out.printf("float %f is converted to String %s in Java using" + " concatenation %n", fValue4, strFloat4);

		// Parsing float to String in Java using Float toString method
		Float fValue5 = new Float(786.86f);
		String strFloat5 = fValue5.toString();
		System.out.printf("Float %f is changed to String object %s in Java using" + " toString %n", fValue5, strFloat5);

		// Converting String object to float primitive in Java - valueOf example
		float fValue6 = 919.23f;
		String strFloat6 = String.valueOf(fValue6);
		System.out.printf("float %f is converted to String %s by using valueOf" + " in Java %n", fValue6, strFloat6);

		float f1 = 414.23f;
		float f2 = Float.valueOf("414.23f");

		String s1 = "414.23f";
		String s2 = String.valueOf(f1);

		boolean result1 = (f1 == f2);
		boolean result2 = s1.equals(s2);
		System.out.printf("Comparing floating point numbers %f and %f as float" + " returns %b %n", f1, f2, result1);
		System.out.printf("Comparing floating point numbers %s and %s as String" + " returns %b %n", s1, s2, result2);

	}

	public static void StringToFloat() {
		try {
			String string = "foo";
			float f = Float.parseFloat(string);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
	}

	// 1) Remove repeating characters from a string. Eg: "Green Apple" O/p: Grn
	// Apl No extra memory allowed

	// You have got a range of numbers between 1 to N.You need to write a
	// program to find out the duplicate number.

	public static int missingNumber(int[] n) {
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}

		int entire = ((n.length + 1) * (n.length + 2)) / 2;
		return entire - sum;
	}

	public void printBinaryFormat(int number) {
		int binary[] = new int[25];
		int index = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static int getNumberSum(int number) {

		int sum = 0;

		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);
			getNumberSum(number / 10);
		}
		return sum;
	}

	public static boolean isArmstrongNumber(int number) {

		int sum = 0;
		int actual = number;
		// int noOfDigits = String.valueOf(number).length();
		int noOfDigits = 3;
		while (number > 0) {

			int temp = number % 10;
			int dif = (int) Math.pow(temp, noOfDigits);
			sum = sum + dif;
			number = number / 10;

		}

		// System.out.println(sum);
		return actual == sum ? true : false;
	}

	public static int binaryToDecimal(int num) {
		int i = 0;
		int sum = 0;
		while (num > 0) {
			int temp = 0;

			if (num % 10 > 0) {
				temp = ((int) Math.pow(2, i));
			}
			i++;
			sum = sum + temp;

			num = num / 10;
		}

		return sum;
	}

	public static boolean isBinaryNumber(int num) {

		boolean val = true;
		while (num > 0) {
			int temp = num % 10;

			if (temp > 1) {
				val = false;
			}

			num = num / 10;
		}

		return val;
	}

	/*
	 * * This method uses bitwise AND (&) operator to check if a number is *
	 * even or odd in Java
	 */ public static void isOddOrEven(int number) {
		 if ((number & 1) == 0) {
			 System.out.println("Using bitwise operator: " + number + " is Even number");
		 } else {
			 System.out.println("Using bitwise operator: " + number + " is Odd number");
		 }
	 }

	 // divide a number by 2 without using / operator

	 public static double divide(double a, double b) {
		 if (b == 0) {
			 throw new ArithmeticException("Division by 0 is undefined: " + a + "/" + b);
		 }
		 int sign = 1;
		 if (a < 0) {
			 a = -a;
			 sign = -sign;
		 }
		 if (b < 0) {
			 b = -b;
			 sign = -sign;
		 }
		 double result = 0;
		 while (a >= 0) {
			 a -= b;
			 result++;
		 }
		 return (result - 1) * sign;
	 }

	 public static double multiply(double a, double b) {
		 if (b == 0 || a == 0) {
			 return 0;
		 }
		 int sign = 1;
		 if (a < 0) {
			 a = -a;
			 sign = -sign;
		 }
		 if (b < 0) {
			 b = -b;
			 sign = -sign;
		 }
		 double result = 0;

		 for (int i = 1; i <= b; i++) {
			 result = result + a;
		 }

		 return result * sign;
	 }

	 public static void recursivefun(int n) {

		 if (n <= 10) {

			 System.out.println(n);
			 recursivefun(n + 1);
		 }
	 }

/*
1) Calculate the angle made by hour hand with respect to 12:00 in h hours and m minutes.
			2) Calculate the angle made by minute hand with respect to 12:00 in h hours and m minutes.
			3) The difference between two angles is the angle between two hands.
*/
static int calcAngle(double h, double m)
{
	// validate the input
	if (h <0 || m < 0 || h >12 || m > 60)
		System.out.println("Wrong input");

	if (h == 12)
		h = 0;
	if (m == 60)
		m = 0;

	// Calculate the angles moved by hour and minute hands
	// with reference to 12:00
	int hour_angle = (int)(0.5 * (h*60 + m));
	int minute_angle = (int)(6*m);

	// Find the difference between two angles
	int angle = Math.abs(hour_angle - minute_angle);

	// smaller angle of two possible angles
	angle = Math.min(360-angle, angle);

	return angle;
}

	// Driver program
	public static void main (String[] args)
	{
		System.out.println(calcAngle(9, 60)+" degree");
		System.out.println(calcAngle(3, 30)+" degree");
	}


}

import java.util.Scanner;
public class fizzBuzz {
	/**
	* Does whatever is desired.
	*/
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How many FizzBuzz numbers would you like to find?");
		int x = kb.nextInt();
		System.out.println(getFB1(x));
		printFB(getFB2(x));
	}
	/**
	 * Returns the inputted number of FizzBuzz numbers as a String.
	 * <p>
	 * This method returns a String with the specified FizzBuzz numbers, but it includes all of the 
	 * formatting such as commas and spaces that may make it more difficult to test, since another 
	 * implementation of fizzBuzz may have different formatting.
	 * @param  input  the number of FizzBuzz numbers to be added
	 * @return        the String containing FizzBuzz numbers with a comma and a space separating each
	 */
	public static String getFB1(int input) {
		String fbNumbers = "";
		for (int i = 1; i <= input; i++) {
			if (i%15 == 0) fbNumbers = fbNumbers + "FizzBuzz, ";
			else if (i%3 == 0) fbNumbers = fbNumbers + "Fizz, ";
			else if (i%5 == 0) fbNumbers = fbNumbers + "Buzz, ";
			else fbNumbers = fbNumbers + i + ", ";
		}
		return fbNumbers;
	}
	/**
	 * Returns a String array with the inputted number of FizzBuzz numbers.
	 * <p>
	 * This method returns an array with specified FizzBuzz numbers, and it doesn't include any
	 * formatting as they are all individual elements in the array. This makes it easier to test 
	 * the method because the elements in the array can be compared to the elements of another 
	 * implementation of fizzBuzz without the formatting getting in the way.
	 * @param  input  the number of FizzBuzz numbers to be added
	 * @return        the array of the specified number of FizzBuzz numbers
	 */
	public static String[] getFB2(int input) {
		String[] fbNumbers = new String[input];
		for (int i = 1; i <= input; i++) {
			if (i%15 == 0) fbNumbers[i-1] = "FizzBuzz";
			else if (i%3 == 0) fbNumbers[i-1] = "Fizz";
			else if (i%5 == 0) fbNumbers[i-1] = "Buzz";
			else fbNumbers[i-1] = Integer.toString(i);
		}
		return fbNumbers;
	}
	/**
	 * Prints every element in an array of Strings.
	 * <p>
	 * @param  arr  the array of Strings to be printed
	 */
	public static void printFB(String[] arr) {
		for (String element : arr) {
			System.out.print(element + ", ");
		}
	}
	

}

/**
 * Q1: recursive method that computes x^n for positive integers x, n
 */
public static int powerN (int x, int n) {
   if (n == 0)
      return 1;
   else
      return  x * powerN(x, n - 1);
}

//powerN(2, 4) = 2 * powerN(2, 3)
//              = 2 * 2 * powerN(2, 2)
//              = 2 * 2 * 2 * powerN(2, 1)
//              = 2 * 2 * 2 * 2 * powerN(2, 0)
//              = 2 * 2 * 2 * 2 * 1
//              = 16




/**
 *  Q2: recursive method that computes the following series
 *      S = 1 + 1/2 + 1/3 + ...+1/ n
 */

public static double harmonicSum(int n) {
   if (n == 1)
      return 1;
   else
      return 1.0/n + harmonicSum(n - 1);
}


//harmonicSum(4) = 1/4 + harmonicSum(3)
//                = 1/4 + 1/3 + harmonicSum(2)
//                = 1/4 + 1/3 + 1/2 + harmonicSum(1)
//                = 1/4 + 1/3 + 1/2 + 1
//                = 2.08333333333



/**
 *  Q3: recursive method that displays an int value reversely
 *      on the console
 */
public static void reverseNumber(int value){
   if ((value % 10) == value) {
      System.out.print(value);
   }
   else {
      System.out.print(value % 10);
      reverseNumber(value/10);
   }
}

// The method uses a recursive approach to print the digits of the input value in reverse order. 
// It first checks if the input value value is a single-digit number by checking if (value % 10) == value. If it is, the method prints the value on the console.

// If the input value value has more than one digit, the method computes the remainder of the input value divided by 10, which gives the last digit of the number. 
// It then prints this digit on the console and calls itself with the argument value/10, which removes the last digit of the number. 
// This process is repeated recursively until the input value becomes a single-digit number, at which point the first condition is met and the method prints the final digit on the console.


//reverseNumber(1234) = 4
//                    = 3
//                    = 2
//                    = 1




/**
 * Q4: recursive method that returns true if the String contains the char,
 *     otherwise returns false
 */
public static boolean contains(char c, String s){
   if (s == null || s.isEmpty())
      return false;
   else
      return s.charAt(0) == c || contains(c, s.substring(1));
}


// The method uses a recursive approach to check if the first character of the input string is equal to the input character c. 
// If the first character is equal to c, the method returns true. If the input string is empty or null, the method returns false.

// If the first character of the input string is not equal to the input character c, the method calls itself recursively with the substring of the input string starting from the second character. 
// This process is repeated recursively until either the input string is empty or the first character of the input string is equal to the input character c.

// For example, if we call contains('o', "Hello, World!"), the method will return true, because the character 'o' is present in the string "Hello, World!".
// If we call contains('x', "Hello, World!"), the method will return false, because the character 'x' is not present in the string "Hello, World!".


// The number 1 in the recursive call represents the index of the second character in the substring. This is because we want to check if the input character c is present in the substring starting from the second character, not including the first character. 
// Therefore, we pass the substring of the input string starting from the second character, which is obtained using the substring(1) method.


/**
 * Q5: recursive method that returns the number of occurences of char c in
 *   
 */
public static int numOccurences(char c, String s) {
   if (s == null || s.isEmpty())
      return 0;
   else
      return  (s.charAt(0) == c? 1 : 0) + numOccurences(c, s.substring(1));
}


// The method uses a recursive approach to count the number of occurrences of the input character c in the input string s. If the input string is empty or null, the method returns 0.

// If the input string is not empty or null, the method checks if the first character of the input string is equal to the input character c. 
// If the first character is equal to c, the method adds 1 to the count of occurrences. If not, the method adds 0 to the count of occurrences.

// The method then makes a recursive call to itself with the substring of the input string starting from the second character. 
// The result of the recursive call is added to the count of occurrences obtained in the previous step. This process is repeated recursively until either the input string is empty or null.

// For example, if we call numOccurences('o', "Hello, World!"), the method will return 2, because the character 'o' occurs twice in the string "Hello, World!".

// If we call numOccurences('x', "Hello, World!"), the method will return 0, because the character 'x' is not present in the string "Hello, World!".

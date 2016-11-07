package se.keroprog.algorithmclass.palindrome;

/**
 * Recursive method checking if a String input is a Palindrome.
 * Made for my class in Algorithms and Data Structures.
 * Created by Kristoffer on 2016-11-03.
 */
public class Palindrome {

    /*
            Method isPalindromeRecursive has the time complexity O(Log(n)) for n number of factorial calls
            The memory allocation is O(n) for n number of method calls on the heap, there are also two
            variable assignments that are each also O(n) per method iteration. Total Memory is still O(n).
     */

    public static boolean isPalindrome(String s){

        // removing all spaces and setting all letters to lower case
        return isPalindromeRecursive((s.toLowerCase().replaceAll("\\s", "")));

    }


    public static boolean isPalindromeRecursive(String s){

        // assigning a boolean value that is to be returned by every instance, set to true,
        // will be changed to false if the condition is not met for any of the iterations.
        boolean result = true; // <--- variable assigned

        //printout for test
        System.out.println("Checking if \"" + s + "\" is a Palindrome");

        //the method's stop condition is set, that is reaching the middle of the String
        if(s.length() > 1){

            // prints out the characters to be compared
            System.out.println("comparing first character: " + s.charAt(0) +
                    ", to last character: " + s.charAt(s.length()-1));

            // compares the first and the last character in the entered string
            if (s.endsWith(String.valueOf(s.charAt(0)))){

                // output for test, letting it be known that the method is called recursively
                System.out.println("comparison successful, calling method recursively with: \""
                        + s.substring(1, s.length()-1) + "\"");

                // calls the method recursively without the first and the last character
                // and sets result to its return value
                System.out.println();
                result = isPalindromeRecursive(s.substring(1, s.length()-1));

            }else {

                //if the first and last characters are not the same, prints out a message and
                // stops the recursion by setting result to false
                System.out.println("comparison failed, " + s + " is not a Palindrome. Exiting method.");
                result = false;  // <--- variable assigned only in case of recursion break
            }
        }else {

            // If the Recursion has gone through all the letters to the middle one,
            // that is, the length of the input String is now 1 or 0, without failure,
            // the String is a Palindrome and a confirmation text is printed out;
            System.out.println("The entered String is a Palindrome");
        }

        System.out.println("\nexit: " + s);
        // returns the result boolean
        return result;
    }
}

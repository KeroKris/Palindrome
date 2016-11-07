package se.keroprog.algorithmclass.palindrome;

public class Main {

    public static void main(String[] args) {

        String[] inputArray = {"madam", "oTt O ", "AlLa", "Aila", "",
                "Ni talar bra latin", "Ni dalar bra latin", "1 2 3 2 1"};


        for (String s :
                inputArray) {

            System.out.println("\n===============NEW TEST===============\n");
            System.out.println("\nReturn value: " + Palindrome.isPalindrome(s));
        }
    }
}

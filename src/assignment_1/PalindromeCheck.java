package assignment_1;

public class PalindromeCheck {
    public static void main(String[] args) {

        String text = "kayak";
        System.out.println(isPalindrome(text));

    }


    //method checks if given string is a palindrome and returns a boolean value
    static boolean isPalindrome(String text) {
        String upperText1 = text.toUpperCase();
        StringBuffer reversedText = new StringBuffer(upperText1).reverse();

        for (int i = 0; i < upperText1.length(); i++) {
            if (upperText1.charAt(i) != reversedText.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}

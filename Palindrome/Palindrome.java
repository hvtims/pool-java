public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reveresed =  new StringBuilder(s).reverse().toString();
        if (reveresed.equals(s)){
            return true;
        }
        return false;
    }
}
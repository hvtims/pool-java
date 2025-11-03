public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reveresed =  new StringBuilder(s).reverse().toString();
        if (reveresed.toLowerCase().equals(s.toLowerCase())){
            return true;
        }
        return false;
    }
}
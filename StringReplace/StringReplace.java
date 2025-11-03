public class StringReplace {

    public static String replace(String s, char target, char replacement) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                res = res.concat(String.valueOf(replacement));
            } else {
                res = res.concat(String.valueOf(s.charAt(i)));
            }
        }
        return res;
    }

    public static String replace(String s, String target, String replacement) {
        return s.replace(target, replacement);
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        Pattern pattern = Pattern.compile("(\\d+)(cm|€)(?=\\s|$)");
        Matcher matcher = pattern.matcher(s);
        String replaced = matcher.replaceAll("$1");
        return replaced;
    }
    
 public static String obfuscateEmail(String s) {
        String[] parts = s.split("@");
        if (parts.length != 2) {
            return s;  
        }
        String username = parts[0];
        String domain = parts[1];

        username = obfuscateUsername(username);

        domain = obfuscateDomain(domain);

        return username + "@" + domain;
    }

    private static String obfuscateUsername(String username) {
        boolean checkFlag = false;
        if (username.matches(".*[-._].*")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c == '-' || c == '.' || c == '_') {
                    sb.append(c);
                    checkFlag = true;
                } else if (checkFlag) {
                    sb.append('*');
                } else {
                    sb.append(c);
                }

            }
            return sb.toString();
        } else {
            if (username.length() > 3) {
                return username.substring(0,3) + "*".repeat(username.length() - 3);
            }
            return username;
        }
    }

    private static String obfuscateDomain(String domain) {
        String[] domainParts = domain.split("\\.");
        int n = domainParts.length;

        boolean isCommonTLD = false;
        if (n >= 1) {
            String tld = domainParts[n - 1].toLowerCase();
            isCommonTLD = tld.equals("com") || tld.equals("org") || tld.equals("net");
        }

        if (n == 3) {
            domainParts[0] = maskString(domainParts[0]);
            domainParts[2] = maskString(domainParts[2]);
        } else if (n == 2) {
            domainParts[0] = maskString(domainParts[0]);
            if (!isCommonTLD) {
                domainParts[1] = maskString(domainParts[1]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                domainParts[i] = maskString(domainParts[i]);
            }
        }

        return String.join(".", domainParts);
    }

    private static String maskString(String s) {
        return "*".repeat(s.length());
    }
}
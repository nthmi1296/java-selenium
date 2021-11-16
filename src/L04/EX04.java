package L04;

public class EX04 {
    /**
     * String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
     */

    public static void main(String[] args) {
        String url = "https://google.com";
        String str1 = "https";
        String domain1 = ".com";
        String domain2 = ".net";

        System.out.println("URL " + url);

        if (url.contains(str1)) {
            System.out.println("HyperText Transfer Protocol Secure");
        } else {
            System.out.println("HyperText Transfer Protocol");
        }
        if (url.contains(domain1)) {
            System.out.println("Domain: " + domain1);
        } else if (url.contains(domain2)) {
            System.out.println("Domain: " + domain2);
        } else {
            System.out.println("Undefined domain");
        }
    }
}

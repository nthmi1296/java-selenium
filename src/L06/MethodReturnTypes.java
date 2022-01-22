package L06;

public class MethodReturnTypes {

    /**
     * 1. Enter domainName
     * 2. SSL
     * 3. domain (.net, .com)
     *
     */

    public static void main(String[] args) {
        buildPageURL(true, "sdetpro", "com");
        printSth(null);
    }

    public static String buildPageURL(boolean isSSL, String domainName, String domain){
        String urlPrefix = "http";
        if (isSSL) urlPrefix = "https";

        return urlPrefix.concat("://").concat(domainName).concat(".").concat(domain);
    }

    public static void printSth(String msg){
        if (null == msg)
            return;
        else
            System.out.println(msg);

        System.out.println("Hello...");
    }
}

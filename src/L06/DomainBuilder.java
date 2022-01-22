package L06;

public class DomainBuilder {

    // Single Responsibility
    public static String buildUrl(String domainName, SslType sslType, DomainType domainType) {
        String urlPrefix = "";
        String finalDomainType = "";

        urlPrefix = getUrlPrefix(sslType);
        finalDomainType = getDomainType(domainType);

        return urlPrefix.concat("://").concat(domainName).concat(finalDomainType);
    }

    private static String getUrlPrefix(SslType sslType) {
        String urlPrefix = "";
        switch (sslType) {
            case TRUE:
                urlPrefix = "https";
                break;
            case FALSE:
                urlPrefix = "http";
            default:
                System.out.println("SSL type is incorrect!");
        }
        return urlPrefix;
    }

    private static String getDomainType(DomainType domainType) {
        String finalDomainType = "";
        switch (domainType) {
            case COM:
                finalDomainType = ".com";
                break;
            case NET:
                finalDomainType = ".net";
                break;
            case AI:
                finalDomainType = ".ai";
                break;
            case IO:
                finalDomainType = ".io";
                break;
            case APP:
                finalDomainType = ".app";
                break;
            default:
                System.out.println("Domain type is incorrect!");
        }
        return finalDomainType;
    }

    public static void main(String[] args) {
        System.out.println(DomainBuilder.buildUrl("sdetpro", SslType.TRUE, DomainType.COM));
    }
}

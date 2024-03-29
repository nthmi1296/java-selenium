package L11;

public class TestLoginFlow {

    public static void main(String[] args) {
        testExternalLoginPage();
        System.out.println("------------------------------------------------");
        testInternalLoginPage();
    }

    public static void testExternalLoginPage() {
        LoginFlow loginFlow = new LoginFlow();
        loginFlow.login(new ExternalLoginPage());
    }

    public static void testInternalLoginPage() {
        LoginFlow loginFlow = new LoginFlow();
        loginFlow.login(new InternalLoginPage());
    }

}

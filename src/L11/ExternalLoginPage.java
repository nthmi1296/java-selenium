package L11;

public class ExternalLoginPage extends LoginPage{

    @Override
    protected String usernameSel() {
        return "ExternalLoginPage | usernameSel";
    }

    @Override
    protected String passwordSel() {
        return "ExternalLoginPage | passwordSel";
    }

    @Override
    protected String loginBtnSel() {
        return "ExternalLoginPage | loginBtnSel";
    }
}

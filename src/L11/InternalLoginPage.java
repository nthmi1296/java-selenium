package L11;

public class InternalLoginPage extends LoginPage{

    @Override
    protected String usernameSel() {
        return "InternalLoginPage | usernameSel";
    }

    @Override
    protected String passwordSel() {
        return "InternalLoginPage | passwordSel";
    }

    @Override
    protected String loginBtnSel() {
        return "InternalLoginPage | loginBtnSel";
    }
}

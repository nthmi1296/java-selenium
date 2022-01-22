package L11;

public abstract class LoginPage {
    public void login(){
        System.out.println("Username Sel: "+usernameSel());
        System.out.println("Password Sel: "+passwordSel());
        System.out.println("Login Btn Sel: "+loginBtnSel());
    }

    protected abstract String usernameSel();
    protected abstract String passwordSel();
    protected abstract String loginBtnSel();
}

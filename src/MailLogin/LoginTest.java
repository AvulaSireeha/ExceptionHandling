package MailLogin;

public class LoginTest {
    public static void main(String[] args) {


        Gmail gmail = new Gmail("sireesha@123", "Siri@234");
        LoginProcess loginProcess = new LoginProcess();
      boolean loginStatus=  loginProcess.login(gmail);
        System.out.println("login success"+loginStatus);
    }
}
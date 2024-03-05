package MailLogin;

public class LoginProcess {
    public boolean login(Gmail gmail){
        String localMailId="sireesha@123";
        String localPassWord="Siri@234";
        if(localMailId.equals(gmail.getMailId())&&localPassWord.equals(gmail.getPassWord())){
            System.out.println("login Successfully");
            return true;
        }else {
            System.out.println("login failed");
            return false;
        }

    }
}

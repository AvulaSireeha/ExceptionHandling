package MailLogin;

public class Gmail {
    private String mailId;
    private String passWord;
    public Gmail(String mailId,String passWord){
        this.mailId=mailId;
        this.passWord=passWord;

    }
    public String getMailId(){
        return mailId;
    }
    public String getPassWord(){
        return passWord;
    }
}

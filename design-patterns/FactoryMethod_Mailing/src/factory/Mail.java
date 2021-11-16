package factory;

public abstract class Mail {

    void sendMail() {
        MailerTransport theTransport = createTransport();
        theTransport.mail();
    }

    abstract MailerTransport createTransport();
}

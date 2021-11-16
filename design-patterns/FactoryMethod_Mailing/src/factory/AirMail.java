package factory;

public class AirMail extends Mail {

    @Override
    MailerTransport createTransport() {
        return new Plane();
    }
}

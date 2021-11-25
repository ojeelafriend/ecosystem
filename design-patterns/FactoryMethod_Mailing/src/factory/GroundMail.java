package factory;

public class GroundMail extends Mail {

    @Override
    MailerTransport createTransport() {
        return new Truck();
    }
}

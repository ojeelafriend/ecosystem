package factory;

public class Plane implements MailerTransport {

    @Override
    public void mail() {
        System.out.println("I'm flying to send you your package!  * Says the plane * ");
    }
}

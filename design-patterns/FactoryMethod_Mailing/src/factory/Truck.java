package factory;

public class Truck implements MailerTransport {

    @Override
    public void mail() {
        System.out.println("Honk! I'm sending you your package by ground  * Says the truck * ");
    }
}

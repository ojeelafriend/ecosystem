package factory;

public class Main {

    private static Mail theMail;

    public static void main(String[] args) {
        // Change the following String parameter value to "Ground"/"Air"
        initializeMail("Ground");
        theMail.sendMail();
    }

    private static void initializeMail(String transportType) {
        if (transportType.equals("Ground")) {
            theMail = new GroundMail();
        } else if (transportType.equals("Air")) {
            theMail = new AirMail();
        }
    }
}

package users;

public class Sender extends UserId  implements User {

    @Override
    public void update() {
        System.out.println("Sender got the message");
    }
}

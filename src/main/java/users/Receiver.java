package users;

public class Receiver extends UserId implements User{
    @Override
    public void update() {
        System.out.println("Receiver got the msg");
    }
}

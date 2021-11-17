package users;


import lombok.Getter;

public class UserId {
    private static int id;
    @Getter
    private int currentUserId;

    public static int getNextId() {
        return ++ id;
    }

    public UserId() {
        currentUserId = getNextId();
    }
}

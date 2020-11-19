import java.util.ArrayList;
import java.util.List;

public class Model {


    private final List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

}

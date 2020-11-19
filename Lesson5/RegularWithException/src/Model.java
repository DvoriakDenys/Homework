import java.util.ArrayList;
import java.util.List;

public class Model {


    private final List<User> userList = new ArrayList<>();

    /**
     * Method gets the value of users
     *
     * @return - list of users
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * Method add user to user's list
     *
     * @param user - New value for the user
     */
    public void addUser(User user) {
        this.userList.add(user);
    }

}

import java.util.List;

public class View {
    public final String FIRST_NAME = "Write your first name in Ukrainian";
    public final String LOGIN = "Write your login";
    public final String PHONE_NUMBER = "Write your phone number, for example +(380) ## ### ## ##";
    public final String WRONG_INPUT = "You entered wrong value";
    public final String EMAIL = "Write your e-mail";
    public final String USER_ADDED = "User was successfully added \n";
    public final String USER_INFORMATION = "Information about user ";
    public final String ADD_ANOTHER_USER = "If you want to add another user, enter word 'yes'";
    public final String DUPLICATE_LOGIN = "This login is already taken, please write another login";
    /**
     * The method shows instructions for filling the user in the e-book
     * @param message - instruction for person
     */
    public void showMessage(String message) {
        System.out.println(message);
    }

    /**
     * The method shows information about all users
     * @param users - list of users
     */
    public void showInfoUsers(List<User> users) {
        for (User user : users) {
            System.out.println(USER_INFORMATION + user.toString());
        }
    }
}

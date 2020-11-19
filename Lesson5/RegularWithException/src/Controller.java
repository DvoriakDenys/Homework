import java.util.List;
import java.util.Scanner;

public class Controller {
    private final View view;
    private final Model model;
    private final Scanner scanner;

    /**
     * The constructor sets an instance of the classes Model, View
     *
     * @param view  -  {@link View} instance of the View class
     * @param model - instance {@link Model} of the Model class
     */
    public Controller(View view, Model model, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    /**
     * Work method
     */
    public void run() {
        processNextUser();
        view.showInfoUsers(model.getUserList());
    }

    /**
     * Check if the person entered correct value
     *
     * @param string regular expression
     * @return correct value
     */
    private String processValue(String string) {
        String value = scanner.nextLine();
        while (true) {
            if (value.matches(string)) {
                break;
            }
            view.showMessage(view.WRONG_INPUT);
            value = scanner.nextLine();
        }
        return value;
    }

    /**
     * check if the person want to enter new user, it yes put it into the list otherwise exit from loop
     */
    private void processNextUser() {

        for (int i = 1; ; i++) {

            model.addUser(buildUser(i));
            view.showMessage(view.ADD_ANOTHER_USER);

            if (!scanner.nextLine().equals("yes")) {
                break;
            }
        }
    }


    /**
     * @return New value for the user
     */
    private User buildUser(int generatedUserId) {
        User user = new User();
        user.setId(generatedUserId);

        view.showMessage(view.FIRST_NAME);
        user.setName(processValue(Regular.REGEX_FIRST_NAME));

        view.showMessage(view.EMAIL);
        user.setEmail(processValue(Regular.REGEX_EMAIL));

        view.showMessage(view.PHONE_NUMBER);
        user.setPhoneNumber(processValue(Regular.REGEX_PHONE_NUMBER));

        view.showMessage(view.LOGIN);
        user.setLogin(processValue(Regular.REGEX_LOGIN));
        duplicateLogin(model.getUserList(), user);

        view.showMessage(view.USER_ADDED);

        return user;
    }


    /**
     * @param list
     * @param user
     */
    public void duplicateLogin(List<User> list, User user) {
        for (User users : list) {
            while (true) {
                if (user.getLogin().equals(users.getLogin())) {
                    try {
//                        throw new ClassException("Dublicate login, please change the login");
                        throw new ClassException("Dublicate login");
                    } catch (Exception e) {
                        e.printStackTrace();
                        view.showMessage(view.DUPLICATE_LOGIN);
                        user.setLogin(processValue(Regular.REGEX_LOGIN));
                    }
                } else break;
            }
        }

    }

}

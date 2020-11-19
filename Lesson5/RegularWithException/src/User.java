public class User {
    private int id;
    private String name;
    private String email;
    private String login;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method generates a sentence from the obtained data
     *
     * @return user's data
     */
    @Override
    public String toString() {
        return String.format("Id%s: Name: %s, Email: %s, Login: %s, Phone number: %s;", getId(), getName(), getEmail(),
                getLogin(), getPhoneNumber());
    }
}

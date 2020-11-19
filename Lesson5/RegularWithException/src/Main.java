import java.util.Scanner;

public class Main {
    /**
     * The main method of the program
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new Model(), new Scanner(System.in));
        controller.run();
    }
}

import java.util.Scanner;

public class Controller {
    private final static String FIRST_WORD = "Hello";
    private final static String SECOND_WORD = "world";

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void run() {

        final Scanner scanner = new Scanner(System.in);

        view.showMessage(view.INPUT_FIRST_WORD);
        model.setFirstWord(validateInputWord(FIRST_WORD, scanner));

        view.showMessage(view.INPUT_SECOND_WORD);
        model.setSecondWord(validateInputWord(SECOND_WORD, scanner));


        view.showMessage(view.OUTPUT_RESULT + model);
    }

    private String validateInputWord(final String word, final Scanner scanner) {

        String inputWords = scanner.nextLine();

        while (true) {

            if (word.equals(inputWords)) {
                break;
            }

            view.showMessage(view.WRONG_INPUT_WORD);
            inputWords = scanner.nextLine();
        }
        return inputWords;
    }
}

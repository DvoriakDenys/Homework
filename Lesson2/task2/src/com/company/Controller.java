package com.company;

import com.company.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private final int MAX_RANGE = 100;
    private final int MIN_RANGE = 0;

    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        final Scanner scanner = new Scanner(System.in);
        final int randomNumber = generateRandomNumber();
        final List<Integer> numberHistory = new ArrayList<>();
        view.showHelloMessage();
        System.out.println(randomNumber);

        while (true) {
            int enteredNumber = scanner.nextInt();
            numberHistory.add(enteredNumber);

            if (validateNumber(enteredNumber, randomNumber)) {
                view.showStatistic(numberHistory);
                break;
            }
        }
    }

    public int generateRandomNumber() {
        return MIN_RANGE + (int) (Math.random() * MAX_RANGE);
    }

    public boolean validateNumber(final int enteredNumber, final int randomNumber) {
        boolean isValid;

        if (enteredNumber > MAX_RANGE || enteredNumber < MIN_RANGE) {
            view.showNumberOutOfRangeMessage();
            isValid = false;
        } else {
            isValid = validateNumberIsMatch(enteredNumber, randomNumber);
        }

        return isValid;
    }

    private boolean validateNumberIsMatch(final int enteredNumber, final int randomNumber) {
        boolean isMatch = false;
        if (enteredNumber == randomNumber) {
            view.showWinMessage();
            isMatch = true;
        } else if (enteredNumber > randomNumber) {
            view.showNumberIsGraterMessage();
        } else {
            view.showNumberIsLessMessage();
        }

        return isMatch;
    }
}
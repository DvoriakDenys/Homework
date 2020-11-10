package com.company.view;

import com.company.constant.ViewMessages;

import java.util.List;

public class View {

    public void showHelloMessage() {
        System.out.println(ViewMessages.HELLO_MESSAGE);
    }

    public void showWinMessage() {
        System.out.println(ViewMessages.WIN_MESSAGE);
    }

    public void showNumberIsGraterMessage() {
        System.out.println(ViewMessages.NUMBER_IS_GRATER);
    }

    public void showNumberIsLessMessage() {
        System.out.println(ViewMessages.NUMBER_IS_LESS);
    }

    public void showNumberOutOfRangeMessage() {
        System.out.println(ViewMessages.ENTERED_NUMBER_OUT_OF_RANGE);
    }

    public void showStatistic(final List<Integer> numberHistoryList) {
        final String message = String.format("You entered number %s times, number history is: %s",
                numberHistoryList.size(), numberHistoryList);
        System.out.println(message);
    }
}

package com.company;

import com.company.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View());
        controller.run();

    }

}

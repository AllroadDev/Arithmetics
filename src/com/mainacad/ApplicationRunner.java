package com.mainacad;

import com.mainacad.service.NumberService;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        int number1 = Integer.parseInt("12345");
        int number2 = Integer.parseInt("123");

        LOGGER.info("\n" + NumberService.getMultiplicationDescription(number1 ,number2));



    }


}

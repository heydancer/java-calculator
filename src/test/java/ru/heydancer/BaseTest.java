package ru.heydancer;

import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    public static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }
}

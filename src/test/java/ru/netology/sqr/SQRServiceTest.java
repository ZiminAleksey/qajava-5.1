package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/parametrizedData.csv"})
    public void test(int x, int y, int expected) {
        SQRService method = new SQRService();

        int actual = method.squaring(x, y);
        Assertions.assertEquals(expected, actual);
    }
}

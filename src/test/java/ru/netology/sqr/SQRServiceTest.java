package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void counterOfSqrNumbInRange() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.counterOfSqrNumbInRange(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void counterOfSqrNumbInRangeOnBorderValues() {
        SQRService sqrService = new SQRService();

        int expected = 2;
        int actual = sqrService.counterOfSqrNumbInRange(100, 125);
        assertEquals(expected, actual);
    }
    @Test
    void counterOfSqrNumbInRangeOneNumb() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int actual = sqrService.counterOfSqrNumbInRange(130, 145);
        assertEquals(expected, actual);
    }
    @Test
    void counterOfSqrNumbInRangeNoNumb() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int actual = sqrService.counterOfSqrNumbInRange(130, 140);
        assertEquals(expected, actual);
    }
    @Test
    void counterOfSqrNumbInRangeAllNumb() {
        SQRService sqrService = new SQRService();

        int expected = 90;
        int actual = sqrService.counterOfSqrNumbInRange(10, 99999);
        assertEquals(expected, actual);
    }

    @Test
    void counterOfSqrNumbInRangeNoNumbMoreLimit() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int actual = sqrService.counterOfSqrNumbInRange(9802, 100000);
        assertEquals(expected, actual);
    }


}
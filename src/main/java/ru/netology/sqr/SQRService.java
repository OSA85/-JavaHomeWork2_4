package ru.netology.sqr;

public class SQRService {
     public int counterOfSqrNumbInRange (int minNumb, int maxNumb) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            int sqrNumb = i * i;
            if (sqrNumb >= minNumb && sqrNumb <= maxNumb) {
                counter = counter + 1;

            }

        }
        return counter;
    }
}


package com.hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ConsoleReaderAdapter extends ConsoleReader{

    public boolean contains(String answer) {
        // Declaring the accepted answers
        String[] acceptedAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        // Instantiating the list using Arrays.asList()
        List<String> answerList = Arrays.asList(acceptedAnswers);

        return answerList.contains(answer);

    }

}
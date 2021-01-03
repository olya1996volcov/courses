package ru.otus.spring.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.domain.Question;

import java.util.Scanner;

@Service
public class CheckAnswerImpl implements CheckAnswer {
    @Override
    public int checkUserAnswer(Question question) {
        int userEnteredAnswer = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                userEnteredAnswer = Integer.valueOf(scanner.nextLine());
                if (question.getRightById(userEnteredAnswer)) {
                    return 1;
                } else {
                    return 0;
                }
            } catch (Exception e) {
                System.out.println("Please, write number of answer (1-" + question.getAnswers().size() + ")");
            }
        }

    }
}

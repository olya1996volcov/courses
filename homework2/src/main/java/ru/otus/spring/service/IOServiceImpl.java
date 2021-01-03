package ru.otus.spring.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.domain.Question;
import ru.otus.spring.domain.TestUserResult;
import ru.otus.spring.domain.User;

import java.util.List;

@Service
public class IOServiceImpl implements IOService {
    private final Reader reader;
    private final ReadUserData userData;
    private final CheckAnswer checkAnswer;

    IOServiceImpl(Reader reader, ReadUserData userData, CheckAnswer checkAnswer) {
        this.reader = reader;
        this.userData = userData;
        this.checkAnswer = checkAnswer;
    }

    @Override
    public TestUserResult printQuestions() {
        int result = 0;
        User user = userData.readUserName();
        List<Question> questionList = reader.readQuestions();
        for (Question q : questionList) {
            System.out.println(q.toString());
            result += checkAnswer.checkUserAnswer(q);
        }
        return new TestUserResult(user, result);

    }

    @Override
    public void testUser() {
        TestUserResult testUserResult = printQuestions();
        System.out.println("User " + testUserResult.getUser().getName() + " " + testUserResult.getUser().getSurname() +
                " gives " + testUserResult.getTestResult() + " correct answers out of 5");
    }
}

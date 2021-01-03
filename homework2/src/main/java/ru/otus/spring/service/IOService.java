package ru.otus.spring.service;

import ru.otus.spring.domain.TestUserResult;

public interface IOService {
    TestUserResult printQuestions();
    void testUser();
}

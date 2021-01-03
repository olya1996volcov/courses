package ru.otus.spring.service;

import ru.otus.spring.domain.Question;

public interface CheckAnswer {
    int checkUserAnswer(Question question);
}

package ru.otus.spring.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<Answer> answers;

    public Question() {
        question = null;
        answers = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public boolean getRightById(int id){
        Answer answer = answers.get(id - 1);
        return answer.isRight();
    }

    @Override
    public String toString() {
        return  question + "\n" + answersSting();
    }

    private String answersSting() {
        StringBuilder str = new StringBuilder();
        for (Answer a : answers) {
            str.append(a.toString());
        }
        return str.toString();
    }
}

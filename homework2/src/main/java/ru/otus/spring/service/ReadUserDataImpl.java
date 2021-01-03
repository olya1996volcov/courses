package ru.otus.spring.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.domain.User;

import java.util.Scanner;

@Service
public class ReadUserDataImpl implements ReadUserData{

    @Override
    public User readUserName() {
        System.out.println("Enter your name and surname, please");
        Scanner scanner = new Scanner(System.in);
        String[] userName = scanner.nextLine().split("\\s+");
        return new User(userName[0], userName[1]);
    }
}

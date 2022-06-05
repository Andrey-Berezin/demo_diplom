package com.example.demo_diplom.rest.exception_handling;

//Класс исключений при невозможности получить работника из базы
public class NoSuchUserException extends RuntimeException {

    public NoSuchUserException(String message) {
        super(message);
    }
}

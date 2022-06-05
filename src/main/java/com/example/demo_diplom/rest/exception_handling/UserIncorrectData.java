package com.example.demo_diplom.rest.exception_handling;

//Класс, конвертирубщийся в json при выбросе исключений NuSuchEmployeeException
public class UserIncorrectData {
    private String info;

    public UserIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

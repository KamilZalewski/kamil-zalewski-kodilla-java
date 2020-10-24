package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {

    private final String username;
    private int updateCount;

    public KodillaMentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentsHomework studentsHomework) {
        System.out.println(username + ": New messages in topic " + studentsHomework.getStudentsName() + "\n" +
                " (total: " + studentsHomework.getTaskList().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}

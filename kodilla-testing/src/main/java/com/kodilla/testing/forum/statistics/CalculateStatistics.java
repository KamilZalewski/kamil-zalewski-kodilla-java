package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageOfPostPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers != 0) {
            averageOfPostPerUser = numberOfPosts / (double) numberOfUsers;
        } else {
            averageOfPostPerUser = 0;
        }
        if (numberOfUsers != 0) {
            averageOfCommentsPerUser = numberOfComments / (double) numberOfUsers;
        } else {
            averageOfCommentsPerUser = 0;
        }
        if (numberOfPosts != 0) {
            averageOfCommentsPerPost = numberOfComments / (double)numberOfPosts;
        }else {
            averageOfCommentsPerPost = 0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageOfPostPerUser() {
        return averageOfPostPerUser;
    }

    public double getAverageOfCommentsPerUser() {
        return averageOfCommentsPerUser;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }
}
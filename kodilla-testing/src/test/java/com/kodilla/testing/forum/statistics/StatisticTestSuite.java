package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {

    @Test
    public void testCalculateAdvStatistics_Oposts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(15);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(30);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(15, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(0, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(30, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(0, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(2, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_1000posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(100, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(10, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0.1, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_0comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(0, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(100, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_commentsSmallerThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(100, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(10, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0.1, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_CommentsBiggerThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(100, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(10, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(100, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(10, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_0users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(0);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(0, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0.1, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_100users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = generateUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(10, calculateStatistics.getAverageOfPostPerUser(), 0.001);
        Assert.assertEquals(1, calculateStatistics.getAverageOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0.1, calculateStatistics.getAverageOfCommentsPerPost(), 0.001);
    }

    private List<String> generateUsers(int howMany) {
        List<String> users = new ArrayList<>();
        for (int n = 0; n < howMany; n++)
            users.add("user" + n);
        return users;
    }
}

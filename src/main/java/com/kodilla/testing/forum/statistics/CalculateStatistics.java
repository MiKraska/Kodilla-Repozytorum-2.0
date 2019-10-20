package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    
    public double averagePostssperUser(int numberofUsers, int numberofPosts){
        return numberofUsers / numberofPosts;
    }
    public double averageCommentsperUser(int numberofComments, int numberofUsers){
        return numberofComments / numberofUsers;
    }
    public double averageCommentsperPost(int numberofComments, int numberofPosts){
        return numberofComments / numberofPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        int numberUsers = statistics.usersNames().size();
        int numberPosts = statistics.postsCount();
        int numberComments = statistics.commentsCount();
        double avCP = averageCommentsperPost(statistics.commentsCount(),statistics.postsCount());
        double avCU = averageCommentsperUser(statistics.commentsCount(),statistics.usersNames().size());
        double avPU = averagePostssperUser(statistics.usersNames().size(),statistics.postsCount());
    }
}

package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private double usersNumber = 0.0;
    private double postsNumber = 0.0;
    private double commentsNumber = 0;
    private double avgPostPerUser = 0.0;
    private double avgCommentPerUser = 0.0;
    private double avgCommentPerPost = 0.0;

    public CalculateStatistics(Statistics statistics) {
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculateAvgStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber != 0.0 && postsNumber != 0.0) {
            avgPostPerUser = postsNumber / usersNumber;
        } else {
            avgPostPerUser = 0.0;
        }
        if (usersNumber != 0.0 && commentsNumber != 0.0) {
            avgCommentPerUser = commentsNumber / usersNumber;
        } else {
            avgCommentPerUser = 0.0;
        }
        if (postsNumber != 0.0 && commentsNumber != 0.0) {
            avgCommentPerPost = commentsNumber / postsNumber;
        } else {
            avgCommentPerPost = 0.0;
        }
    }

    public void ShowStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Posts number: " + postsNumber);
        System.out.println("Comments number: " + commentsNumber);
        System.out.println("Average number of posts per user: " + avgPostPerUser);
        System.out.println("Average number of comments per user: " + avgCommentPerUser);
        System.out.println("Average number of comments per post: " + avgCommentPerPost);
    }
}

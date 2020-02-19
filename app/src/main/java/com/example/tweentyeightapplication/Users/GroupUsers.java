package com.example.tweentyeightapplication.Users;

public class GroupUsers {
    private int groupProfileImage;
     private String groupsStoryText;

    public GroupUsers(int profileImage, String storyText) {
        this.groupProfileImage = profileImage;
         this.groupsStoryText = storyText;
    }

    public int getGroupProfileImage() {
        return groupProfileImage;
    }


    public String getStoryText() {
        return groupsStoryText;
    }
}

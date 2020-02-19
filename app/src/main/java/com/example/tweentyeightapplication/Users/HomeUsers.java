package com.example.tweentyeightapplication.Users;

public class HomeUsers {
    private int profileImage;
    private int circleImageLogo;
    private String storyText;

    public HomeUsers(int profileImage, int circleImageLogo, String storyText) {
        this.profileImage = profileImage;
        this.circleImageLogo = circleImageLogo;
        this.storyText = storyText;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public int getCircleImageLogo() {
        return circleImageLogo;
    }

    public String getStoryText() {
        return storyText;
    }
}

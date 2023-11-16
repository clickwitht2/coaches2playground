package com.t2graphy.coaches.clubs;


public class ClubsData {
    Integer clubsImage;
    String clubsName;
    String clubHeadCoaches;
    String totalStudentTrained;

    String activeStudentsAtClub;
    String clubFacility;
    String clubsIntroGIFPath;

    public ClubsData(Integer clubsImage, String clubsName, String clubHeadCoaches, String totalStudentTrained,
                     String activeStudentsAtClub, String clubFacility,
                     String clubsIntroGIFPath) {
        this.clubsImage = clubsImage;
        this.clubsName = clubsName;
        this.clubHeadCoaches = clubHeadCoaches;
        this.totalStudentTrained = totalStudentTrained;
        this.activeStudentsAtClub = activeStudentsAtClub;
        this.clubFacility = clubFacility;
        this.clubsIntroGIFPath = clubsIntroGIFPath;
    }
}
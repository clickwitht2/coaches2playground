package com.t2graphy.root.coaches.model;


public class CoachesData {
    public Integer coachImage;
    public String coachName;
    public String coachSpeciality;
    Float rating;

    public String coachPersonalExperienceDetail;
    public String coachTopFiveEvents;
    String coachIntroGIFPath;

    public CoachesData(Integer coachImage, String coachName, String coachSpeciality, Float rating,
                       String coachPersonalExperienceDetail, String coachTopFiveEvents,
                       String coachIntroGIFPath) {
        this.coachImage = coachImage;
        this.coachName = coachName;
        this.coachSpeciality = coachSpeciality;
        this.rating = rating;
        this.coachPersonalExperienceDetail = coachPersonalExperienceDetail;
        this.coachTopFiveEvents = coachTopFiveEvents;
        this.coachIntroGIFPath = coachIntroGIFPath;
    }
}
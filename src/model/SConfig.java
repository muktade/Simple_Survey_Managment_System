
package model;

import java.util.Date;

public class SConfig {
    private int id;
//    private int scId;
    private int surveyId; 
    private int sMarks;
    private Date sDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getScId() {
//        return scId;
//    }
//
//    public void setScId(int scId) {
//        this.scId = scId;
//    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getsMarks() {
        return sMarks;
    }

    public void setsMarks(int sMarks) {
        this.sMarks = sMarks;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }
    
}

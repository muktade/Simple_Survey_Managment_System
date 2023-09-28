/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Question {
    private int id;
//    private int questionId;
    private int qPosition;
    private String qText;    
    private int surveyId; 
    private String qAns;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getQuestionId() {
//        return questionId;
//    }
//
//    public void setQuestionId(int questionId) {
//        this.questionId = questionId;
//    }

    public int getqPosition() {
        return qPosition;
    }

    public void setqPosition(int qPosition) {
        this.qPosition = qPosition;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getqAns() {
        return qAns;
    }

    public void setqAns(String qAns) {
        this.qAns = qAns;
    }
    
}

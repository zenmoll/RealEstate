package com.qf.pojo;


import java.util.Date;

public class RealEstate {
    private Integer id;
    private String projectName;
    private String propertyOwner;
    private String identityCard;
    private String housingTypes;
    private Integer usableArea;
    private Date  constructionTime;

    public RealEstate() {
    }

    public RealEstate(Integer id, String projectName, String propertyOwner, String identityCard, String housingTypes, Integer usableArea, Date constructionTime) {
        this.id = id;
        this.projectName = projectName;
        this.propertyOwner = propertyOwner;
        this.identityCard = identityCard;
        this.housingTypes = housingTypes;
        this.usableArea = usableArea;
        this.constructionTime = constructionTime;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", propertyOwner='" + propertyOwner + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", housingTypes='" + housingTypes + '\'' +
                ", usableArea=" + usableArea +
                ", constructionTime=" + constructionTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getHousingTypes() {
        return housingTypes;
    }

    public void setHousingTypes(String housingTypes) {
        this.housingTypes = housingTypes;
    }

    public Integer getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Integer usableArea) {
        this.usableArea = usableArea;
    }

    public Date getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(Date constructionTime) {
        this.constructionTime = constructionTime;
    }
}

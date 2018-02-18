package com.softbird.eventbuzz.groups.DAL.models;

/**
 * Created by laksh on 09-Dec-17.
 */

public class GroupsInflateModel {

    String imageUrl, groupName, countOfEvents;

    public GroupsInflateModel(String imageUrl, String groupName, String countOfEvents) {
        this.imageUrl = imageUrl;
        this.groupName = groupName;
        this.countOfEvents = countOfEvents;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCountOfEvents() {
        return countOfEvents;
    }

    public void setCountOfEvents(String countOfEvents) {
        this.countOfEvents = countOfEvents;
    }
}

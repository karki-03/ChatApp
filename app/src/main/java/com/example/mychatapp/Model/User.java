package com.example.mychatapp.Model;

public class User {
    private String id;
    private String username;
    private String imgURL;
    private String status;
    private String search;

    public User(String id, String username, String imgURL, String status, String search) {
        this.username = username;
        this.id=id;
        this.imgURL = imgURL;
        this.status = status;
        this.search = search;
    }

    public User() {


    }



    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    //optional
    public String getImageURL() {
        return imgURL;
    }

    public void setImageURL(String imgURL) {
        this.imgURL = imgURL;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }


    public String getId() {
        return id;

    }
}

package com.example.recyclerviewdemo;

class Dataitem {
    String type,exercise,rep;
int imgid;

    public Dataitem(String type, String exercise, String rep,int imgid) {
        this.type = type;
        this.exercise = exercise;
        this.imgid = imgid;
        this.rep=rep;
    }

    public Dataitem() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getImgid() {
        return imgid;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}

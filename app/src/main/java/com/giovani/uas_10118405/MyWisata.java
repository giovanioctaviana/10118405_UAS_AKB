package com.giovani.uas_10118405;

public class MyWisata {

    private String wisataName;
    private String wisataData;
    private Integer wisataImage;

    //10118405 Giovani Octaviana 14 agustus 2021 13.33

    public MyWisata(String wisataName, String wisataData, Integer wisataImage) {
        this.wisataName = wisataName;
        this.wisataData = wisataData;
        this.wisataImage = wisataImage;
    }


    public String getWisataName() {
        return wisataName;
    }

    public void setWisataName(String wisataName) {
        this.wisataName = wisataName;
    }

    public String getWisataData() {
        return wisataData;
    }

    public void setWisataData(String wisataData) {
        this.wisataData = wisataData;
    }

    public Integer getWisataImage() {
        return wisataImage;
    }

    public void setWisataImage(Integer wisataImage) {
        this.wisataImage = wisataImage;
    }
}

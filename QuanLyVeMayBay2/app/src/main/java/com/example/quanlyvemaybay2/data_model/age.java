package com.example.quanlyvemaybay2.data_model;

public class age {
    String age_id;
    String age_name;

    public age(String age_name) {
        this.age_name = age_name;
    }

    public age() {
    }

    public String getAge_name() {
        return age_name;
    }

    public void setAge_name(String age_name) {
        this.age_name = age_name;
    }

    @Override
    public String toString() {
        return "Người Lớn";
    }
}

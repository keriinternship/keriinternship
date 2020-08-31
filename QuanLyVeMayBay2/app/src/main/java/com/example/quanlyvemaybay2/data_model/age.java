package com.example.quanlyvemaybay2.data_model;

public class Age {
    String age_id;
    String age_name;

    public Age(String age_name) {
        this.age_name = age_name;
    }

    public Age() {
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

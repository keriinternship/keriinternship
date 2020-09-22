package com.example.quanlyvemaybay2.model;

public class Plane {
    private int planes_id;
    private String number;
    private int company_id;

    public Plane() {
    }

    public Plane(int planes_id, String number, int company_id) {
        this.planes_id = planes_id;
        this.number = number;
        this.company_id = company_id;
    }

    public int getPlanes_id() {
        return planes_id;
    }

    public void setPlanes_id(int planes_id) {
        this.planes_id = planes_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planes_id=" + planes_id +
                ", number='" + number + '\'' +
                ", company_id=" + company_id +
                '}';
    }
}

package com.example.quanlyvemaybay2.data_model;

public class AirTicket {
    private  int id;
    private  String diemdi, diemden, gioxp, gioden,giatien, ngaydi,ngayden ,company_id,planes_id;

    public AirTicket(int id,
                     String diemdi,
                     String diemden,
                     String gioxp,
                     String gioden,
                     String giatien,
                     String ngaydi,
                     String ngayden,
                     String company_id,
                     String planes_id) {
        this.id = id;
        this.diemdi = diemdi;
        this.diemden = diemden;
        this.gioxp = gioxp;
        this.gioden = gioden;
        this.giatien = giatien;
        this.ngaydi = ngaydi;
        this.ngayden = ngayden;
        this.company_id = company_id;
        this.planes_id = planes_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiemdi() {
        return diemdi;
    }

    public void setDiemdi(String diemdi) {
        this.diemdi = diemdi;
    }

    public String getDiemden() {
        return diemden;
    }

    public void setDiemden(String diemden) {
        this.diemden = diemden;
    }

    public String getGioxp() {
        return gioxp;
    }

    public void setGioxp(String gioxp) {
        this.gioxp = gioxp;
    }

    public String getGioden() {
        return gioden;
    }

    public void setGioden(String gioden) {
        this.gioden = gioden;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public String getNgayden() {
        return ngayden;
    }

    public void setNgayden(String ngayden) {
        this.ngayden = ngayden;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getPlanes_id() {
        return planes_id;
    }

    public void setPlanes_id(String planes_id) {
        this.planes_id = planes_id;
    }
    @Override
    public String toString() {
        return "air_ticket{" +
                "id=" + id +
                ", diemdi='" + diemdi + '\'' +
                ", diemden='" + diemden + '\'' +
                ", gioxp='" + gioxp + '\'' +
                ", gioden='" + gioden + '\'' +
                ", giatien='" + giatien + '\'' +
                ", ngaydi='" + ngaydi + '\'' +
                ", ngayden='" + ngayden + '\'' +
                ", company_id='" + company_id + '\'' +
                ", planes_id='" + planes_id + '\'' +
                '}';
    }
}

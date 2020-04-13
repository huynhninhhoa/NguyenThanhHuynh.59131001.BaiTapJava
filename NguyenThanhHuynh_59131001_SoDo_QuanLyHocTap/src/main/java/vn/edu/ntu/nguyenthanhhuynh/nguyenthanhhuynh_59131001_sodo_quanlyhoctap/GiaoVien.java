/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.ntu.nguyenthanhhuynh.nguyenthanhhuynh_59131001_sodo_quanlyhoctap;


public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        System.out.println("Ho ten giao vien: " + getHoTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So dien thoai: " + getSdt());
        System.out.println("Mon day: " + monDay);
        System.out.println("To bo mon: " + toBoMon);
        return null;
    }
    
    
}

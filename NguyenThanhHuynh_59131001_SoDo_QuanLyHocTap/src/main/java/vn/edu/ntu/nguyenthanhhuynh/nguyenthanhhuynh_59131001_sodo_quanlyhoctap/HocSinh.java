/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.ntu.nguyenthanhhuynh.nguyenthanhhuynh_59131001_sodo_quanlyhoctap;


public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh() {
        //Không tham số
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        System.out.println("Ho ten hoc sinh: " + getHoTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So dien thoai: " + getSdt());
        System.out.println("Lop: " + lop);
        System.out.println("Nang khieu: " + nangKhieu);
        return null;
    }  
}

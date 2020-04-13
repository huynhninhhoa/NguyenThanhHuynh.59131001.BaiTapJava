/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.ntu.nguyenthanhhuynh.nguyenthanhhuynh_59131001_sodo_quanlyhoctap;

public class Main_SoDo_QuanLyHocTap {
    public static void main(String[] args) {
        
        HocSinh hs1 = new HocSinh("CNTT", "Mua", "Nguyen Thanh Huynh", 21, "Khanh Hoa", "59131001");
        HocSinh hs2 = new HocSinh("Marketing", "Hat", "Nguyen Van A", 22, "Phu Yen", "0123123123");
        
        GiaoVien gv1 = new GiaoVien("Giai tich", "Toan", "Nguyen Van D", 40, "Khanh Hoa", "123456");
        GiaoVien gv2 = new GiaoVien("Dai So", "Toan", "Nguyen Van C", 50, "Phu Yen", "12345678");
        
        LopHoc lh = new LopHoc();
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        
        lh.inDSHS();
        lh.inDSGVGD();
    }
}

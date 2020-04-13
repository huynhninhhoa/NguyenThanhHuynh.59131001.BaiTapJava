/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.ntu.nguyenthanhhuynh.nguyenthanhhuynh_59131001_sodo_quanlyhoctap;

public class LopHoc {
    QLDS qldsGVGD;
    QLDS qldsHS;
    GiaoVien giaoVienCN;

    public LopHoc() {
        
    }

    public LopHoc(QLDS qldsGVGD, QLDS qldsHS, GiaoVien giaoVienCN) {
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
        this.giaoVienCN = giaoVienCN;
    }

    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public GiaoVien getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }  

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    public int themHocSinh(HocSinh hs){
        return 0;
    }
    
    public int themGVGD(GiaoVien gv){
        return 0;
    }
    
    public int inDSHS(){
        return 0;      
    }
    
    public int inDSGVGD(){
        return 0;     
    }
    
    
}

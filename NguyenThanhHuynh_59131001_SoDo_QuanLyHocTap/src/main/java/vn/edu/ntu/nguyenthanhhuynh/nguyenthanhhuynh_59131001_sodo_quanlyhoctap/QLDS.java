/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.ntu.nguyenthanhhuynh.nguyenthanhhuynh_59131001_sodo_quanlyhoctap;
import java.util.ArrayList;


public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds = new ArrayList();;

    public QLDS() {
        //Không tham số
    }
    
    public QLDS(ArrayList<CaNhan> ds) {
        this.ds = ds;
    }
    public ArrayList<CaNhan> getDs() {
        return ds;
    }

    public void setDs(ArrayList<CaNhan> ds) {
        this.ds = ds;
    }

    @Override
    public int them(CaNhan p) {
        if(ds.add(p))
            return 1;
        return 0;
    }
    
    @Override
    public int xoa(String ten) {
        int x = 0;
        for(int i = 0; i < ds.size(); i++){
            if(ds.get(i).getHoTen().equals(ten)){
                ds.remove(i);
                x = 1;
            }
        }
        return x;
    }

    @Override
    public void inDS() {
        for(int i = 0; i < ds.size(); i++){
            this.ds.get(i).HienThiTT();
        }
    }
}

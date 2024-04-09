package Kethua;

import HinhTron;

public class main {
    public static void main(String[] args) {
        

   //Hinh Tron
   HinhTron hinhTron=new HinhTron();
      
    hinhTron.NhapBanKinh();
    hinhTron.TinhChuVi();
    hinhTron.inChuvi();
    hinhTron.TinhDienTich();
    hinhTron.inDientich();
     

    //HinhChuNhat
    HinhChuNhat  hinhChuNhat=new HinhChuNhat();
    hinhChuNhat.NhapDai();
    hinhChuNhat.NhapRong();
    hinhChuNhat.TinhChuVi();
    hinhChuNhat.inChuvi();
    hinhChuNhat.TinhDienTich();
    hinhChuNhat.inDientich();
   
   //hinh Vuong
     HinhVuong hinhVuong=new HinhVuong();
     hinhVuong.NhapCanh();
     hinhVuong.TinhChuVi();
     hinhVuong.inChuvi();
     hinhVuong.TinhDienTich();
     hinhVuong.inDientich();
   
     //Hinh Tru tron
     HinhTruTRon HinhTruTRon=new HinhTruTRon();
     HinhTruTRon.NhapCao();
     HinhTruTRon.inThetich();
     HinhTruTRon.TinhDienTich();
  }

}
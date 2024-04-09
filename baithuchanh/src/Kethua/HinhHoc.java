package Kethua;
import java.util.Scanner;

import HinhTron;

public class HinhHoc {
    
       
        public final float Pi = 3.14f;
        public String Ten;
        public float ChuVi;
        public float DienTich;
        public float TheTich;
    
    public void xuatTen(){
        System.out.println("======="+"======");
    }
    public void inChuvi(){
        System.out.println("Chu vi: "+ ChuVi);
    }
    public void inDientich(){
        System.out.println("Dien tich ="+ DienTich);
    }
    public void inThetich(){
        System.out.println("Dien tich ="+ TheTich);
    }
}
 class HinhTron extends HinhHoc{
      Scanner sc = new Scanner(System.in);
      public HinhTron(){
        Ten = "Hinh Tron";
      }
      public float BanKinh;
      public void NhapBanKinh(){
        System.out.println(" Ban Kinh = ");
        BanKinh=sc.nextFloat();
      }
      public void TinhChuVi(){
        ChuVi = 2*Pi*BanKinh;
      }
      public void TinhDienTich(){
        DienTich = Pi*BanKinh*BanKinh;
      }
 }
 class HinhChuNhat extends HinhHoc{
      Scanner sc= new Scanner( System.in);
      public HinhChuNhat(){
        Ten ="Hinh Chu Nhat";
      }
      public float Dai;
      public float Rong;
      public void  NhapDai(){
        System.out.println("Chieu dai =");
        Dai=sc.nextFloat();
      }
      public void NhapRong(){
        System.out.println("Chieu dai =");
        Rong=sc.nextFloat();
      } 
      public void TinhChuVi(){
        ChuVi = (Dai + Rong)*2;
      }
      public void TinhDienTich(){
        DienTich = Dai * Rong;
      }

 }
 class HinhVuong extends HinhChuNhat{
      public HinhVuong (){
        Ten ="Hinh Vuong";
      }
      public void NhapCanh(){
        System.out.println(" Canh =");
        Dai=sc.nextFloat();

      }
      public void TinhChuVi(){
        ChuVi = Dai *4;
      }
      public void TinhDienTich(){
        DienTich = Dai * Dai;
      }
 }
 class HinhTruTRon extends HinhTron{
      public HinhTruTRon (){
         Ten ="Hinh Tru Tron";
      }
      public float Cao;
      public void NhapCao(){
        System.out.println("Chieu Cao =");
        Cao=sc.nextFloat();
      }
      public void TinhTheTich(){
        TheTich = Pi * BanKinh * BanKinh * Cao;
      }
 }

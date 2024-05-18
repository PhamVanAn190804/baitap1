package person;
import java.util.Scanner;

public class person {
    public String HoTen;
    public String SoCCCD;
    public int tuoi;


    Scanner sc = new Scanner(System.in);
    public void NhapThongtin(){
       System.out.println("nhap thong tin:");
       HoTen=sc.nextLine();
       System.out.println("nhap cccd: ");
       SoCCCD=sc.nextLine();
       System.out.println("nhap tuoi");
       tuoi=sc.nextInt();
    }


    public void NhapThongtin(String HoTen, String cccd, int tuoi){
        System.out.print("\nHo Ten: " + HoTen);
        System.out.print("\nSo CCCD: " + SoCCCD);
        System.out.print("\n Tuoi: " + tuoi);


    }


    public void InThongtin(String HoTen, String cccd, int tuoi){
        System.out.print("\nHo Ten: " + HoTen);
        System.out.print("\nSo CCCD: " + SoCCCD);
        System.out.print("\n Tuoi: " + tuoi);


    }

    public static void main(String[] args) throws Exception {
        person nguoi = new person();
        nguoi.NhapThongtin();
        nguoi.NhapThongtin("pham van an","333333333345",19);
        nguoi.InThongtin(null, null, 0);
     }




     
}

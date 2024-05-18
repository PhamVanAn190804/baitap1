package Chuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class slide69 {
    public static void main(String[] args) {
        TreeSet<Integer> Tree = new TreeSet()<number>;
        Tree.add(7);
        Tree.add(8);
        Tree.add(9);
        Tree.add(10);
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("TreeSet: ");
        System.out.println(TreeSet);

        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        if(!Tree .contains(number)){
            Tree.add(number);
            System.out.println(" them phan tu thanh : ");
            System.out.println("Danh sach phan tu: ");
            System.out.println(Tree);
        }
        else{
            System.out.println(" Xuat hien phan tu trong danh sach :");
        }
    }
}

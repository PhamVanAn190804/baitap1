package Chuong4;
import java.util.HashSet;
import java.util.Scanner;
public class slide54 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int number ;
        Scanner sc = new Scanner(System.in);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(0);
        hashSet.add(7);

        System.out.println("Cac phan tu trong HashSet: ");
        System.out.println(hashSet);

        System.out.println("Cac phan tu trong Xoa: ");
        number = sc .nextInt();
        if(hashSet.contains(number)){
            hashSet.remove(number);
            System.out.println("Xoa thanh cong: ");
            System.out.println("Cac phan tu sau khi xoa : ");
            System.out.println(hashSet);
        }
        else{
            System.out.println("Xoa thanh cong");
        }

    }
}

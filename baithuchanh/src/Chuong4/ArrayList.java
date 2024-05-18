package Chuong4;

import java.util.ListIterator;
import java.until.ArrayList;
public class ArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> arrList = new ArrayList<Integer>();
      arrList.add(100);
      arrList.add(9);
      arrList.add(10);
      arrList.add(7);
      ListIterator<Integer> ListIterator = arrList.listIterator();
      System.out.println("Cac Phan tu trong mang la: ");
      for (int i=0; i<arrList.size() ;i++){
        System.out.println(arrList.get(i) + "");
      }
    }
}

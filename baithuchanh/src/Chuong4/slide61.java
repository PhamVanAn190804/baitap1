package Chuong4;


import java.util.LinkedHashSet;
import java.util.Set;

public class Slide60 {
    public static void main(String[] args) {
        Set<String> Linked = new LinkedHashSet<String>();
        Linked.add("Java");
        Linked.add("HTML");
        Linked.add("CSS");
        Linked.add("JS");

       System.out.println("LinkedHashSet: ");
       for(String str : Linked){
          System.out.println(str);

       }
       String name;
       System.out.println("Nhap vi tri can xoa: ");
       name = sc.nextLine();
       if(Linked.contains(name)){
        System.out.println('Phan tu da con ton tai: ');
       }
       else{
         Link.remove(name);
         System.out.println(" Da duoc xoa: ");
         System.out.println("phan tu da xoa");
         for(String str :  Linked){
            System.out.println(str);
         }
       }
    }
    
}

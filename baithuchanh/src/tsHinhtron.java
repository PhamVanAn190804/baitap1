public class tsHinhtron {
   public float r;
   public ToaDo toaDo;

   public void setBanKinh(float r){
        this.r = r;
   }
   public void setToaDo(ToaDo toaDo ){
         this.toaDo = toaDo;
   }

    void setToaDo(int x, int y){
      this.toaDo = new ToaDo();


      this.toaDo.x = x;
      this.toaDo.y = y;
      
    }
    void inBanKinh() {
      System.out.println("Ban Kinh HINH Tron : " +this.r);
    }















}

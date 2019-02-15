import java.util.ArrayList;

public class Order {
  public double total;
  ArrayList<String> danhSachSP = new ArrayList<>();
  public void MuaSP(Ao ao,int soLuong){
     if(soLuong<=ao.amount){
         danhSachSP.add(ao.name);
         ao.amount-=soLuong;
         this.total+= ao.money*soLuong;
     }
   else {
         System.out.println("Hình như có gì đấy sai sai ");
     }
  }
  public void MuaSP(Nhan nhan,int soLuong){
      if(soLuong<=nhan.amount){
          danhSachSP.add(nhan.name);
          nhan.amount-=soLuong;
          this.total+= nhan.money*soLuong;
      }
      else {
          System.out.println("Hình như có gì đấy sai sai ");
      }
  }
  public void DanhSach(){
      for(String value : danhSachSP){
          System.out.println(value);

      }
      System.out.println("Tổng tiền phải chi trả là "+this.total);
  }
}

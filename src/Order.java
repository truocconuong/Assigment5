import java.util.ArrayList;

public class Order {
    public double total;
    public void Shopping(Ao ao){
        System.out.println("Bạn vừa mua  "+ao.name +"  Với giá "+ao.money);
        ao.amount-= 1;
        this.total+=ao.money;
    }
    public void Shopping(Nhan nhan){
        nhan.amount-=1;
        this.total+= nhan.money;
        System.out.println("Bạn vừa mua "+nhan.name + " Với giá" +nhan.money);
    }
    public void TongDonHang(){
        System.out.println(" Tổng số tiến bạn phải thanh toán cho Shop là : "+ this.total);
    }
}

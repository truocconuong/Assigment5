import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
Ao ao1 = new Ao(1,"Kaki",45.0,3,28,"Black","Gucci");
Ao ao2 = new Ao(2,"Gucii",20.0,3,28,"Black","Gucci");
Ao ao3 = new Ao(2,"Dolce",15.0,1,28,"Black","Gucci");
Ao ao4 = new Ao(2,"Nani",18.0,2,28,"Black","Gucci");
Nhan nhan1 = new Nhan(1,"Nhẫn giả nhựa",25.0,2,1,"Hàng giả");
Nhan nhan2 = new Nhan(2,"Nhẫn Vàng Mạ Nhựa",25.0,2,1,"Hàng Thật");
Nhan nhan3 = new Nhan(3,"Nhẫn giả nhựa",25.0,2,1,"Hàng giả");
ArrayList<Ao>dataAo = new ArrayList<>();
ArrayList<Nhan>dataNhan = new ArrayList<>();
dataAo.add(ao1);
dataAo.add(ao2);
dataNhan.add(nhan1);
dataNhan.add(nhan2);
dataNhan.add(nhan3);
Order shopping = new Order();
shopping.Shopping(ao1);
shopping.Shopping(ao2);
shopping.Shopping(nhan1);
shopping.Shopping(nhan2);
shopping.Shopping(nhan3);
shopping.TongDonHang();
        System.out.println("-----------------------------");
        System.out.println("Tra cứu hàng tồn kho của Shop");
for(Ao value  : dataAo){
    System.out.println("Áo: "+value.name + " Số lượng còn lại "+value.amount);
}
        System.out.println("--------------------------");
for(Nhan value : dataNhan){
    System.out.println(" "+value.name + " Số lượng còn lại "+value.amount);
}

    }
}

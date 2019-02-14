public class Fashion extends SanPham{
    public int KichThuoc;
    public String color;
    public String ThuongHieu;

    public Fashion(int id, String name, double money, int amount) {
        super(id, name, money, amount);
    }

    public void Giat(){
        System.out.println("tôi đang giặt nè");
    }
    public void LamKho(){
        System.out.println("Làm khô");
    }

    public Fashion(int id, String name, double money, int amount, int kichThuoc, String color, String thuongHieu) {
        super(id, name, money, amount);
        KichThuoc = kichThuoc;
        this.color = color;
        ThuongHieu = thuongHieu;
    }
}

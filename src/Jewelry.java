public class Jewelry extends SanPham {
    public int trongLuong;
    public String Loai;

    public Jewelry(int id, String name, double money, int amount) {
        super(id, name, money, amount);
    }

    public void LamMoi(){
        System.out.println("Làm mớiiiii");
    }

    public Jewelry(int id, String name, double money, int amount, int trongLuong, String loai) {
        super(id, name, money, amount);
        this.trongLuong = trongLuong;
        Loai = loai;
    }
}

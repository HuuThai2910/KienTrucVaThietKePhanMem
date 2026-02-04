// 4. Chạy thử
public class Main {
    public static void main(String[] args) {
        // Sản phẩm bình thường áp dụng VAT
        Product milk = new Product("Sữa", 100.0, new VatTax());
        System.out.println("Giá Sữa (VAT): " + milk.getFinalPrice());

        // Sản phẩm xa xỉ áp dụng Luxury Tax
        Product diamond = new Product("Kim cương", 1000.0, new LuxuryTax());
        System.out.println("Giá Kim Cương (Luxury): " + diamond.getFinalPrice());
    }
}
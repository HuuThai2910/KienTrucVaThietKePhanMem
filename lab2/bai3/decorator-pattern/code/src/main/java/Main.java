// 5. Chạy thử
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Trường hợp 1: Thẻ tín dụng thường ---");
        Payment creditCard = new CreditCardPayment();
        creditCard.pay(100.0);

        System.out.println("\n--- Trường hợp 2: PayPal + Phí xử lý ---");
        Payment paypalWithFee = new ProcessingFeeDecorator(new PayPalPayment());
        paypalWithFee.pay(100.0);

        System.out.println("\n--- Trường hợp 3: Thẻ + Phí + Giảm giá (Wrapper lồng nhau) ---");
        // Bọc Discount ra ngoài (CreditCard + Fee)
        Payment complexPayment = new DiscountDecorator(
                                    new ProcessingFeeDecorator(
                                        new CreditCardPayment()));
        complexPayment.pay(100.0);
    }
}
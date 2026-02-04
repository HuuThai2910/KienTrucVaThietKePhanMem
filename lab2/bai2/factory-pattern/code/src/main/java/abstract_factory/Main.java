package abstract_factory;

// 5. Client
public class Main {
    public static void main(String[] args) {
        // Giả sử config hệ thống đang chạy cho khách VIP
        boolean isVip = true; 
        
        ProviderFactory factory;
        if (isVip) {
            factory = new VipUserFactory();
        } else {
            factory = new RegularUserFactory();
        }

        // Client cứ thế dùng, không quan tâm là VIP hay thường
        // Đảm bảo Email và SMS luôn đồng bộ cùng loại VIP hoặc Thường
        Email email = factory.createEmail();
        SMS sms = factory.createSMS();

        email.sendEmail("Thông báo bảo trì");
        sms.sendSMS("Mã OTP");
    }
}
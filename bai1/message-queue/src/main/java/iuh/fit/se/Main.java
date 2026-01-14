package iuh.fit.se;

import iuh.fit.se.consumer.MessageConsumer;
import iuh.fit.se.producer.MessageProducer;

public class Main {

    public static void main(String[] args) {

        // Consumer duoc chay o mot thread rieng
        new Thread(() -> {
            MessageConsumer consumer = new MessageConsumer();
            consumer.start();
        }).start();

        // Producer
        MessageProducer producer = new MessageProducer();

        // Producer gui 3 tin nhan
        // Message duoc luu vao redis
        // Sau do duoc chuyen tiep cho consumer
        for (int i = 1; i <= 3; i++) {
            producer.sendMessage("Message Queue " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

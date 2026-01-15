package iuh.fit.se.consumer;

import iuh.fit.se.config.RedisConfig;
import redis.clients.jedis.Jedis;

import java.util.List;

public class MessageConsumer {

    private static final String QUEUE_NAME = "message_queue";

    public void start() {
        try (Jedis jedis = RedisConfig.getJedis()) {
            System.out.println("Waiting for messages...");

            while (true) {

                List<String> result = jedis.brpop(0, QUEUE_NAME);

                if (result != null && result.size() == 2) {
                    String message = result.get(1);
                    System.out.println("Received message (consumer): " + message);
                }
            }
        }
    }
}

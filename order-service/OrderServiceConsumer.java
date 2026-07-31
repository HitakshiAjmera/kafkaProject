import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceConsumer {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceConsumer.class);

    @KafkaListener(topics = {"user-created-topic", "user-random-topic"})
    public void consumeUserServiceEvents(Object event) {
        processEvent("user-service", event);
    }

    @KafkaListener(topics = {"notification-created-topic", "notification-event-topic"})
    public void consumeNotificationServiceEvents(Object event) {
        processEvent("notification-service", event);
    }

    private void processEvent(String source, Object event) {
        if (event == null) {
            log.warn("Received null event from {}", source);
            return;
        }

        String payload = event instanceof String
                ? (String) event
                : event.toString();

        log.info("Processing event from {}: {}", source, payload);

        // Add your order-service business logic here.
        // Example: create order, validate event, update inventory, etc.
    }
}

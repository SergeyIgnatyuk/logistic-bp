package by.logisticbp.event;

//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {

//    @KafkaListener(topics = {"topic-1"}, groupId = "group-1")
    public void handleMessageWithHeaders(String message) {
        System.out.println("Received message: " + message);
    }
}

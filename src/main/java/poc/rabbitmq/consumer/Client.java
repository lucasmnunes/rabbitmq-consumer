package poc.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import poc.rabbitmq.config.MessageConfig;
import poc.rabbitmq.model.Payment;

@Component
@Slf4j
public class Client {

    @RabbitListener(queues = MessageConfig.QUEUE)
    public void getMessageFromQueue(Payment payment) {
        log.info("Payment received!");
        log.info(payment.toString());
    }

}

package com.example.manytomany.consumer;
import com.example.manytomany.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);
    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumeJsonMessage(Student student){
       try {
           LOGGER.info(String.format("Consumed json format detail of Student -> %s", student.toString()));
       }catch (Exception e){
           System.out.println("json not consumed");
       }
    }
}

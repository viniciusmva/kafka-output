package com.org.kafkaoutput.service;

import com.org.kafkaoutput.entity.OutputEntity;
import com.org.kafkaoutput.infrastructure.KafkaChannels;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class OutputService {

    private final KafkaChannels kafkaChannels;

    public OutputService(KafkaChannels kafkaChannels) {
        this.kafkaChannels = kafkaChannels;
    }

    public OutputEntity createMessage(OutputEntity outputEntity){
        System.out.println(outputEntity);
        kafkaChannels.testOutput().send(MessageBuilder.withPayload(outputEntity).build());
        return outputEntity;
    }
}

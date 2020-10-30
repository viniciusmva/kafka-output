package com.org.kafkaoutput.infrastructure;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface KafkaChannels {
    String TEST_OUTPUT = "org-test-output";

    @Output(TEST_OUTPUT)
    MessageChannel testOutput();
}

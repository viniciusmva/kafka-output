package com.org.kafkaoutput.config;

import com.org.kafkaoutput.infrastructure.KafkaChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(KafkaChannels.class)
public class KafkaConfig {
}
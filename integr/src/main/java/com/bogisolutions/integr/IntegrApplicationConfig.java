package com.bogisolutions.integr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
public class IntegrApplicationConfig {
    @Bean
    public MessageChannel registrationRequest() {
        return new DirectChannel();
    }

}

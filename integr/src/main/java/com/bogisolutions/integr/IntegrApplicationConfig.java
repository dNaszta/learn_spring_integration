package com.bogisolutions.integr;

// import com.bogisolutions.integr.service.RegistrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
// import org.springframework.integration.dsl.IntegrationFlow;
// import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

@Configuration
public class IntegrApplicationConfig {
    @Bean("registrationRequest")
    public MessageChannel registrationRequest() {
        return new DirectChannel();
    }

    /*
     * if we use DSL instead of Annotation we can remove the @ServiceActivator annotation from the RegistrationService class
     */
    /*
    @Bean
    public IntegrationFlow integrationFlow(RegistrationService registrationService) {
        return flow -> flow
                .channel(registrationRequest())
                .handle(registrationService, "register");
    }
     */
}

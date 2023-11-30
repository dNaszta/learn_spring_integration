package com.bogisolutions.integr.web;

import com.bogisolutions.integr.model.AttendeeRegistration;
import com.bogisolutions.integr.service.RegistrationService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class RegistrationController {
    private static final Logger LOG = LoggerFactory.getLogger(RegistrationController.class);

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
        System.out.println("RegistrationController constructor");
    }

    @GetMapping
    public String index(@ModelAttribute("registration") AttendeeRegistration registration) {
        return "index";
    }

    @PostMapping
    public String submit(@ModelAttribute("registration") @Valid AttendeeRegistration registration, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            LOG.warn("Validation failed: {}", bindingResult);
            return "index";
        }

        registrationService.register(registration);

        return "success";
    }
}
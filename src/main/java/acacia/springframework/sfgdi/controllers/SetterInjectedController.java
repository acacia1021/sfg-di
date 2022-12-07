package acacia.springframework.sfgdi.controllers;

import acacia.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
}

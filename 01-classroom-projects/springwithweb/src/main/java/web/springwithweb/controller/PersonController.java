package web.springwithweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.springwithweb.service.PersonService;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    @ResponseBody
    public String homePage() {
        return "<h1>Vaccine Management System</h1>" +
                "<p>Welcome! The server is running perfectly.</p>" +
                "<a href='/people/total'>View the total number of registered users</a>";
    }

    @GetMapping("/people/total")
    @ResponseBody
    public String totalPeople() {
        long total = personService.countTotalPeople();

        return "<h1>System Overview</h1>" +
                "<p>Currently, we have <strong>" + total + "</strong> people registered for vaccination.</p>" +
                "<a href='/'>Return to home.</a>";
    }
}

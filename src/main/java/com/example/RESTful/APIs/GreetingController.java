package com.example.RESTful.APIs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(1, "Hello, " + name + "!");
    }

    /*The client (web browser) sends an HTTP request to the Tomcat server.
    Tomcat, acting as the embedded servlet container, receives the request and forwards it to the Spring MVC Dispatcher.
    The Dispatcher maps the request to the appropriate Controller based on the request URL.
    The Controller processes the request, interacts with the Model (if necessary), and returns a response.
    If needed, the Controller uses the Model to retrieve or manipulate data.
    Finally, the response is sent back to the client (web browser) via Tomcat.*/

}


package com.example.RESTful.APIs;

/* MVC

First, the browser sends a request to the Controller. Then, the Controller interacts with the Model

to send and receive data.The Controller then interacts with the View to render the data. The View is

only concerned about how to present the information and not the final presentation. It will be a dynamic

HTML file that renders data based on what the Controller sends it.

Finally, the View will send its final presentation to the Controller and the Controller will send that

final data to the user output.

The important thing is that the View and the Model never interact with each other.

The only interaction that takes place between them is through the Controller.

This means the logic of the application and the interface never interacts with each other, which

makes writing complex applications easier.*/

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}


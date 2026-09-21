package com.frozen.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestComponent {

    private String  name;
private String name2;

    public TestComponent(@Qualifier("name") String name){
        this.name = name;
        System.out.println("TestComponent created with name: " + name2);
        System.out.println("The test is created.");
    }

    @RequestMapping("/click")
    public String onClick(){
        return "end.jsp";
    }
}

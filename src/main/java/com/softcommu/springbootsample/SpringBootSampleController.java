package com.softcommu.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SpringBootSampleController {

    @GetMapping("/")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/abc")
    public String getAbc(){
        return "abc";
    }

    @GetMapping("/message")
    public String getMessage(Model model) {
        model.addAttribute("message", "メッセージです！！！");
        return "message"; // Thymeleafテンプレートのファイル名を返す
    }

    @GetMapping("/stringlist")
    public String getStringList(Model model) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");
        list.add("Item 9");
        list.add("Item 10");

        model.addAttribute("list", list);

        return "stringlist";
    }

    @GetMapping("/personList")
    public String getPersonList(Model model) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 28));
        people.add(new Person("David", 35));
        people.add(new Person("Eva", 27));
        people.add(new Person("Frank", 33));
        people.add(new Person("Grace", 29));
        people.add(new Person("Henry", 31));
        people.add(new Person("Ivy", 26));
        people.add(new Person("Jack", 32));

        model.addAttribute("list", people);

        return "personList";
    }

    @GetMapping("/messageTest")
    public String getMessageTest(){
        return "messageTest";
    }

    @PostMapping("/messageTest")
    public String postSubmit(Model model, @RequestParam("mmmmm") String m){
        model.addAttribute("message", m);
        return "messageTest";
    }
}

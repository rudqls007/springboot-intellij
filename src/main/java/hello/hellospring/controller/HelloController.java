package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");

        return "hello";
    }


    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; // hello spring html 태그 없이 데이터 값만 그대로 출력된다.
    }


    @GetMapping("hello-api")
    @ResponseBody   // json으로 반환하는 게 기본임.
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;

    }

    static class Hello{
        private String name;
        // alt + insert = getter / setter 단축기
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



    }
}

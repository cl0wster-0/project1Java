package pl.edu.vistula.JavaProj1_TarasParfeniuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController
public class HelloController {

    // @Controller would treat the returned String as a template name.
    // @ResponseBody makes Spring write the String directly into the HTTP response body instead.
    @GetMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=666
}

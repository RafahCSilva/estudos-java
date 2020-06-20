package rcs.rafahcsilva.SpringGradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @GetMapping
    public String sayHello() {
        return "Hello from SpringBoot by RaFao";
    }
}

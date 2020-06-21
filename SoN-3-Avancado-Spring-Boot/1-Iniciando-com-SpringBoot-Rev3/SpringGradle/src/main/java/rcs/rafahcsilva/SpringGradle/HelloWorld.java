package rcs.rafahcsilva.SpringGradle;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @GetMapping
    public String sayHello() {
        // http://localhost:8080/
        return "Hello from SpringBoot by RaFao";
    }

    @GetMapping("/subpath")
    public String subPath() {
        // http://localhost:8080/subpath
        return "This is one subPath of endpoint";
    }

    @GetMapping("/subpath_dynamic/{dynamic}")
    public String withDynamic(@PathVariable("dynamic") String name) {
        // http://localhost:8080/subpath_dynamic/rafao
        return "Hello '" + name + "' this is my route dynamic...";
    }

    @GetMapping("/subpath_queryparam")
    public String withQueryParam(@RequestParam("name") String name) {
        // http://localhost:8080/subpath_queryparam?name=rafao
        return "Hello '" + name + "' this is my route with QueryParams...";
    }

    @GetMapping("/subpathquery_webrequest")
    public String withWebRequest(final WebRequest webRequest) {
        // http://localhost:8080/subpathquery_webrequest?name=rafao
        String name = webRequest.getParameter("name");
        return name != null ?
                "Hello '" + name + "' this is my route with WebRequest..." :
                "No Query Params";
    }

    @GetMapping("/subpath_queryparam_required")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public String withQueryParamRequired(@RequestParam(value = "name", required = true) String name) {
        // http://localhost:8080/subpath_queryparam_required?name=rafao
        // http://localhost:8080/subpath_queryparam_required  <- error 400
        return "Hello '" + name + "' this is my route with QueryParams...";
    }

    @PostMapping("/post")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public String sayHelloPost(@RequestBody Map<String, Object> payload) {
        // POST: http://localhost:8080/post  with JsonBody {"name":"Rafao"}
        return "Post: " + payload.get("name").toString();
    }

}

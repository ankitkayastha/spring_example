package gradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ankit on 10/10/2016.
 */


@RestController
public class MainController {
    @RequestMapping("/")
    public String hi() {
        return "Hi this is an endpoint";
    }
}

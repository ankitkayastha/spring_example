package gradle;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ankit on 10/10/2016.
 * This class serves more as a proof of concept. Implementation is not there yet because we recently decided to use Spring
 * to build our RESTful service. The idea behind the endpoints below is to just show how it will work in general with Spring. Of course,
 * there will be many more endpoints in our application for the different screens and behaviors users can excpet to access.
 */


@RestController
public class MainController {
    @RequestMapping("/")
    public String hi() {
        return "Hi this is an endpoint";
    }
    @RequestMapping("/login/{userID}")
    public String login(@PathVariable String userID) {
        /*
        This method will handle the code to check the userID. The user will enter id and password, and this method will query
        our database to ensure that the user login is indeed valid and the user is a registered user.
         */
        return "Login Succeeded with userID: " + userID;
    }
}

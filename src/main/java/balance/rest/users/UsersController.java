package balance.rest.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/")
    public String homepage() {
        return "Welcome to Home Page";
    }
}

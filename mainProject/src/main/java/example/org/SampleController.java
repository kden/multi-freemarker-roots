package example.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("userName", "Juan");
        return "main";
    }

}

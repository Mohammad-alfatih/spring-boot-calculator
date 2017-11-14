package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping("/math")
    public Operation math(
                          @RequestParam(value="first") long first,
                          @RequestParam(value="second") long second,
                          @RequestParam(value="operator", defaultValue="+") String operator
                          ) {
        return new Operation(first, second, operator);
    }
}

package hello;

import com.splunk.logging.HttpEventCollectorErrorHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class Application
{
    @RequestMapping("/")
    public String index()
    {
        log.info("Greetings from Spring Boot!");
        return "Greetings from Spring Boot!";
    }

    public static void main(String[] args)
    {
        HttpEventCollectorErrorHandler.onError((events, e)-> e.printStackTrace());
        SpringApplication.run(Application.class, args);
    }
}
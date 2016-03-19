package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wiring.IntegratedApplicationWiring;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{Application.class, IntegratedApplicationWiring.class}, args);
    }

}

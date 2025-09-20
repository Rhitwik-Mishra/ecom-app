package com.mtd.ecommerce_app;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("############################################################");
        System.out.println("########## DEBUGGING MONGO_URI ON STARTUP ##########");
        System.out.println("########## The URI my application sees is: " + mongoUri);
        System.out.println("############################################################");
    }
}
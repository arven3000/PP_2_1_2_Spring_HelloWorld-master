import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "catSays")
    @Scope("prototype")
    public Cat getWhatCatSays() {
        Cat cat = new Cat();
        cat.setWhatCatSays("Meow-Meow");
        return cat;
    }
}
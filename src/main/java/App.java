import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld newBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(newBean.getMessage());

        Cat cat = applicationContext.getBean("catSays", Cat.class);
        System.out.println(cat.getWhatCatSays());

        Cat otherCat = applicationContext.getBean("catSays", Cat.class);
        System.out.println(otherCat.getWhatCatSays());

        System.out.println("HelloWorld Bean is singleton? answer: " + (bean == newBean));
        System.out.println("Cat Bean is singleton? answer: " + (cat == otherCat));
    }
}
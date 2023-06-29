import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(beanHello.getMessage());
        System.out.println(bean.equals(beanHello));


        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getString());
        System.out.println(beanCat1.getString());
        System.out.println(beanCat.equals(beanCat1));
    }
}
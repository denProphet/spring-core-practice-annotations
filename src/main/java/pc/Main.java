package pc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pc pc = applicationContext.getBean("pc", Pc.class);

        System.out.println(pc.getMainProperties());
        System.out.println("\t");
        pc.displayConnection();
        System.out.println("\t");
        pc.inputConnection();
        System.out.println("\t");
        pc.volumeOutputConnection();
        System.out.println("\t");
        System.out.println(pc.getOs().toString());
        System.out.println("\t");
        pc.getFan1().setColor("Black");
        pc.getFan2().setColor("White");
        pc.fanConnection();

    }
}

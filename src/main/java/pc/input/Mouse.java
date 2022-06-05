package pc.input;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements PcDataInput{
    @Override
    public void input() {
        System.out.println("mouse input");
    }
}

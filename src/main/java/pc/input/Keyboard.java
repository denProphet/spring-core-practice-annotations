package pc.input;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements PcDataInput{
    @Override
    public void input() {
        System.out.println("keyboard input");
    }
}

package pc.input;

import org.springframework.stereotype.Component;

@Component
public class Gamepad implements PcDataInput{
    @Override
    public void input() {
        System.out.println("gamepad input");
    }
}

package pc.video;

import org.springframework.stereotype.Component;

@Component
public class Monitor implements VideoOutput {
    @Override
    public void display() {
        System.out.println("Monitor output");
    }
}

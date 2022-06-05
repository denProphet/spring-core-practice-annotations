package pc.video;

import org.springframework.stereotype.Component;

@Component
public class Tv implements  VideoOutput {
    @Override
    public void display() {
        System.out.println("Tv output");
    }
}

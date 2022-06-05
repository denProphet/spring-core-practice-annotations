package pc.volumeOutput;

import org.springframework.stereotype.Component;

@Component
public class Speakers implements VolumeOutput{
    @Override
    public void output() {
        System.out.println("speakers output");
    }
}

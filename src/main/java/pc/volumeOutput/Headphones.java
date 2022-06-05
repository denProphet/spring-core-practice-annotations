package pc.volumeOutput;

import org.springframework.stereotype.Component;
import pc.video.VideoOutput;

@Component
public class Headphones implements VolumeOutput {


    @Override
    public void output() {
        System.out.println("headphones output");
    }
}

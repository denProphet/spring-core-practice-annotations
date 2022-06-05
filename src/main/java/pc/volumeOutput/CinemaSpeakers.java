package pc.volumeOutput;

import org.springframework.stereotype.Component;

@Component
public class CinemaSpeakers implements VolumeOutput{
    @Override
    public void output() {
        System.out.println("cinema speakers output");
    }
}

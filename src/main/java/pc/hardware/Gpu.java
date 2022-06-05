package pc.hardware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gpu {
    @Value("54")
    private int videoRam;

    public Gpu() {
    }

    public Gpu(int videoRam) {
        this.videoRam = videoRam;
    }

    public int getVideoRam() {
        return videoRam;
    }

    public void setVideoRam(int videoRam) {
        this.videoRam = videoRam;
    }


}

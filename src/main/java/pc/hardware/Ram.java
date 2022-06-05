package pc.hardware;

import org.springframework.stereotype.Component;

@Component
public class Ram {
    private int memory;
    private int bandwidth;

    public Ram(int memory, int bandwidth) {
        this.memory = memory;
        this.bandwidth = bandwidth;
    }

    public Ram() {}

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }
}

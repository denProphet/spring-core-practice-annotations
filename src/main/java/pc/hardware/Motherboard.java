package pc.hardware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motherboard {
    private Ram ram;
    private Gpu gpu;
    private Cpu cpu;

    @Autowired
    public Motherboard(Ram ram, Gpu gpu, Cpu cpu) {
        this.ram = ram;
        this.gpu = gpu;
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}

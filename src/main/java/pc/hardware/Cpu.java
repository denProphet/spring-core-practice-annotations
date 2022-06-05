package pc.hardware;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
    private int countOfKernels;
    private int countOfThreads;
    private int frequency;

    public Cpu() {}

    public Cpu(int countOfKernels, int countOfThreads, int frequency) {
        this.countOfKernels = countOfKernels;
        this.countOfThreads = countOfThreads;
        this.frequency = frequency;
    }

    public int getCountOfKernels() {
        return countOfKernels;
    }

    public void setCountOfKernels(int countOfKernels) {
        this.countOfKernels = countOfKernels;
    }

    public int getCountOfThreads() {
        return countOfThreads;
    }

    public void setCountOfThreads(int countOfThreads) {
        this.countOfThreads = countOfThreads;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}

package pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pc.hardware.Fan;
import pc.hardware.Motherboard;
import pc.hardware.PowerUnit;
import pc.input.PcDataInput;
import pc.software.OperatingSystem;
import pc.video.VideoOutput;
import pc.volumeOutput.VolumeOutput;

@Component
public class Pc {

    private Motherboard motherboard;
    private PowerUnit powerUnit;
    private VideoOutput videoOutput;
    private OperatingSystem os;
    private Fan fan1;
    private Fan fan2;
    /**
     * Тестирование Autowired Field Qualifier
     * NOT RECOMMENDED TO USE
     */

    @Autowired
    @Qualifier("mouse")
    private PcDataInput pcDataInput;
    @Autowired
    @Qualifier("keyboard")
    private PcDataInput pcDataInput2;

    private VolumeOutput volumeOutput;

    /**
     * Тестирование Autowired Constructor Qualifier и
     * Autowired без уточнения
     */

    @Autowired
    public Pc(Motherboard motherboard,
              PowerUnit powerUnit,
              OperatingSystem os,
              Fan fan1,
              Fan fan2,
              @Qualifier("monitor") VideoOutput videoOutput) {
        this.motherboard = motherboard;
        this.powerUnit = powerUnit;
        this.videoOutput = videoOutput;
        this.os = os;
        this.fan1 = fan1;
        this.fan2 = fan2;
    }

    public PcDataInput getPcDataInput() {
        return pcDataInput;
    }

    public void setPcDataInput(PcDataInput pcDataInput) {
        this.pcDataInput = pcDataInput;
    }

    public PcDataInput getPcDataInput2() {
        return pcDataInput2;
    }

    public void setPcDataInput2(PcDataInput pcDataInput2) {
        this.pcDataInput2 = pcDataInput2;
    }

    public VolumeOutput getVolumeOutput() {
        return volumeOutput;
    }

    /**
     * Тестирование Autowired Setter Qualifier
     */

    @Autowired
    public void setVolumeOutput(@Qualifier("speakers") VolumeOutput volumeOutput) {
        this.volumeOutput = volumeOutput;
    }


    public VideoOutput getVideoOutput() {
        return videoOutput;
    }

    public void setVideoOutput(VideoOutput videoOutput) {
        this.videoOutput = videoOutput;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PowerUnit getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(PowerUnit powerUnit) {
        this.powerUnit = powerUnit;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public Fan getFan1() {
        return fan1;
    }

    public void setFan1(Fan fan1) {
        this.fan1 = fan1;
    }

    public Fan getFan2() {
        return fan2;
    }

    public void setFan2(Fan fan2) {
        this.fan2 = fan2;
    }

    public String getMainProperties() {
        return "\tRAM: " + motherboard.getRam().getMemory() +
                "\n\tVIDEO-RAM: " + motherboard.getGpu().getVideoRam() +
                "\n\tCPU KERNELS: " + motherboard.getCpu().getCountOfKernels() +
                "\n\tCPU FREQUENCY: " + motherboard.getCpu().getFrequency() +
                "\n\tPOWER UNIT VOLTAGE: " + powerUnit.getVoltage();
    }

    public void displayConnection() {
        videoOutput.display();
    }

    public void inputConnection() {
        pcDataInput.input();
        pcDataInput2.input();
    }

    public void volumeOutputConnection() {
        volumeOutput.output();
    }

    public void fanConnection(){
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }


}

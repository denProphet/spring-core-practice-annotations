package pc.hardware;

import org.springframework.stereotype.Component;

@Component
public class PowerUnit {
    private int voltage;

    public PowerUnit(int voltage) {
        this.voltage = voltage;
    }

    public PowerUnit() {
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

}

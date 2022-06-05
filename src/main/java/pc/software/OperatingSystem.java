package pc.software;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OperatingSystem {

    /**
     * Value annotation
     * */

    @Value("${operatingSystem.name}")
    private String name;
    @Value("${operatingSystem.vendor}")
    private String vendor;
    @Value("${operatingSystem.version}")
    private double version;
    @Value("${operatingSystem.bitDepth}")
    private int bitDepth;

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getVersion() {
        return version;
    }

    public int getBitDepth() {
        return bitDepth;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", version=" + version +
                ", bitDepth=" + bitDepth +
                '}';
    }
}

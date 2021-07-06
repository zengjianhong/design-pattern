package _07adapter.classadapter;

/**
 * @author jehon
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44; // 转成5V
        return dstV;
    }
}

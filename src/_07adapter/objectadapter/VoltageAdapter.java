package _07adapter.objectadapter;

/**
 * @author jehon
 */
public class VoltageAdapter implements IVoltage5V {

    // 关联关系-聚合
    private Voltage220V voltage220V;

    VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}

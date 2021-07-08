package _18observer;

/**
 * @author jehon
 *
 * 类是核心
 * - 1. 包含最新的天气情况信息
 * - 2. 含有CurrentConditions对象
 * - 3. 当数据有更新时，就主动的调用CurrentConditions对象update方法（含display)，这是他们（接收方）就看到最新的信息
 */
public class WeatherData {

    private float temperature;

    private float pressure;

    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        // 调用接入方的update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    // 当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        // 嗲用dataChange,将最新的信息推送给接入方currentConditions
        dataChange();
    }
}

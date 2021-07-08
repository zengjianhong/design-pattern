package _18observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jehon
 */
public class WeatherData implements Subject {

    private float temperature;

    private float pressure;

    private float humidity;

    // 观察者集合
    private List<Observer> observerList;

    // 加入新的第三方
    public WeatherData() {
        this.observerList = new ArrayList<>();
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

//    public void dataChange() {
//        // 调用第三方的update
//        notifyObserver();
//    }

    // 当数据由更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange，将最新的信息推送给接入方currentConditions
        // dataChange();
        notifyObserver();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    // 遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}

package _18observer.improve;

/**
 * @author jehon
 *
 * 接口，由WeatherData来实现
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}

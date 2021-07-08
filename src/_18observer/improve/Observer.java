package _18observer.improve;

/**
 * @author jehon
 *
 * 观察者接口，由观察者来实现
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}

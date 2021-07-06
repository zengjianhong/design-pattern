package _11facade;

/**
 * @author jehon
 */
public class DVEPlayer {

    // 使用单例模式，饿汉式
    private static DVEPlayer instance = new DVEPlayer();

    public static DVEPlayer getInstance() { return instance; }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}

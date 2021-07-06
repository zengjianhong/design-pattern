package _11facade;

import _09decorator.DeCaf;
import javafx.scene.shape.SVGPath;

/**
 * @author jehon
 */
public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVEPlayer dvePlayer;

    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvePlayer = DVEPlayer.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvePlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvePlayer.play();
    }

    public void pause() {
        dvePlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvePlayer.off();
    }
}

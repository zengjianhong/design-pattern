package _01principle._3inversion.improve;

/**
 * @author jehon
 */
public class DependencyPass {

    public static void main(String[] args) {

        // 抽象方法接收接口
        ChangHong1 changHong1 = new ChangHong1();
        OpenAndClose1 openAndClose1 = new OpenAndClose1();
        openAndClose1.open1(changHong1);

        // 构造方法传递
        ChangHong2 changHong2 = new ChangHong2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong2);
        openAndClose2.open2();

        // setter设置
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();

    }
}

/**
 * 方式1：通过接口传递实现依赖
 * 开关的接口
 */
interface IOpenAndClose1 {

    // 抽象方法，接收接口
    void open1(ITV1 tv);
}

interface ITV1 {

    void play1();
}

class ChangHong1 implements ITV1 {

    @Override
    public void play1() {
        System.out.println("长虹电视机，打开");
    }
}

class OpenAndClose1 implements IOpenAndClose1 {

    @Override
    public void open1(ITV1 tv) {
        tv.play1();
    }
}

/**
 * 方式2：通过构造方法依赖传递
 */
interface IOpenAndClose2 {

    void open2();
}

interface ITV2 {

    void play2();
}

class ChangHong2 implements ITV2 {

    @Override
    public void play2() {
        System.out.println("长虹电视机，打开");
    }
}

class OpenAndClose2 implements IOpenAndClose2 {

    public ITV2 tv; // 成员

    public OpenAndClose2(ITV2 tv) {
        this.tv = tv;
    }

    public void open2() {
        this.tv.play2();
    }
}

/**
 * 方式3，通过setter方法传递
 */
interface IOpenAndClose {

    void open();

    void setTv(ITV tv);
}

interface ITV {

    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
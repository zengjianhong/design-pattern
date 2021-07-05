package _01principle._3inversion.improve;

/**
 * @author jehon
 *
 * 依赖倒装原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

/**
 * 定义接口
 */
interface IReceiver {

    String getInfo();
}

class Email implements IReceiver {

    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

/**
 * 新增微信
 */
class Wechat implements IReceiver {

    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

/**
 * 方式2
 */
class Person {

    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
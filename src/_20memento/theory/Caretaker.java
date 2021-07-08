package _20memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jehon
 */
public class Caretaker {

    // 在List集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    // 获取到第index个Originator的备忘录对象（即保存状态）
    public Memento get(int index) {
        return mementoList.get(index);
    }
}

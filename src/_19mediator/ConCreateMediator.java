package _19mediator;

import java.util.HashMap;

/**
 * @author jehon
 *
 * 具体的中介者类
 */
public class ConCreateMediator extends Mediator {

    // 集合，放入所有的同时对象
    private HashMap<String, Colleague> colleagueMap;

    private HashMap<String, String> interMap;

    public ConCreateMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 根据得到的消息，完成对应任务
     * 2. 中介者在这个方法，协调各个具体的同时对象，完成任务
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        // 处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) colleagueMap.get(interMap.get("TV"))).startTv();
            } else if (stateChange == 1) {
                ((TV) colleagueMap.get(interMap.get("TV"))).stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果TV发现消息
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发出的消息，这里处理...
        }
    }

    @Override
    public void sendMessage() {

    }
}

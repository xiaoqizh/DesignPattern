package 观察者模式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:04 2018/1/15
 * @Description:
 */

public  class Subject {
    //Subject里面包括通知对象
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyAllObs() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

class SubjectTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Observer());
        subject.addObserver(new Observer());
        subject.addObserver(new Observer());
        subject.notifyAllObs();
    }
}
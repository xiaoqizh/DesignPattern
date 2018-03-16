package 装饰者模式;

import org.junit.Test;

import java.util.BitSet;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 21:28 2018/1/10
 * @Description:
 */

public class Decorator {
    private Base base;

    public Decorator(Base base) {
        this.base = base;
    }
    /**
     *  对类方法进行装饰
     *  其实这个地方也可以使用Base参数来的
     */
    public  void decorating  (){
        System.out.println("我对被装饰的类进行装饰！");
        base.beenDecorated();
    }
}

class DecorateTest {
    public static void main(String[] args) {
        Base base = new Base();
        Decorator decorator = new Decorator(base);
        decorator.decorating();
    }
}
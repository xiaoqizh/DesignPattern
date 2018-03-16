package 工厂方法模式;

import org.junit.Test;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:50 2018/1/12
 * @Description:
 */

public class FactoryPatternTest {
    /**
     * @Description: 对工厂模式的测试
     *                 工厂模式就是创建各自独立的类
     *                 简单工厂方法模式 如果在添加一个方法什么的 那么就必须要改简单工厂方法
     *                 违背了 开放封闭原则。尽可能是只是扩展 而不是更改！
     */
    @Test
    public void test1(){
        //通过具体的工厂类来获得对象 而不是把参数给整个大工厂类 通过参数switch 来创建类
        //
        Factory addFactory = new AddFactory();
        AddBean addBeanFac = (AddBean)addFactory.createBean();
        addBeanFac.setVar1(1);
        addBeanFac.setVar2(2);
        System.out.println(addBeanFac.getResult());
    }
    /**
     * @Description: 创建出发工厂也是如此
     *                 编写代码一定要规范！ 模式真的是太重要了！
     */
    @Test
    public void test2(){
        Factory factory = new DivFactory();
        //实际对象是除法的对象
        DivBean  factory1 = ((DivBean) factory.createBean());
        factory1.setVar1(100);
        factory1.setVar2(20);
        System.out.println(factory1.getResult());
    }
}

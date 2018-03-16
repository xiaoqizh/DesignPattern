package 策略模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:21 2018/1/9
 * @Description:
 */

public class Strategy1 implements StrategyInterface {


    /**
     * @Description: 不同策略对应的不不同算法
     * @Date: 23:21 2018/1/9
     */
    @Override
    public void algorithm() {
        System.out.println("我是策略1");
    }
}

package 策略模式;

import org.junit.Test;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:24 2018/1/9
 * @Description:
 */

public class StrategyTest {
    /**
     * @Description: 对策略模式的测试
     *                 其实调用的还是参数里面的方法 Context类只是对策略的一种封装
     *                 这就是为什么策略模式叫：对算法的一种封装了
     */
    @Test
    public void  test1 (){
        Context context = new Context(new Strategy1());
        context.useStrategy();
        Context context1 = new Context(new Strategy2());
        context1.useStrategy();
    }
}

package 策略模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:25 2018/1/9
 * @Description： 该类是对策略的进一步封装
 */

public class Context {
    private    StrategyInterface strategy;
    public Context(StrategyInterface strategy) {
        this.strategy = strategy;
    }
    /**
     *  调用策略中的方法
     *   不要什么都弄成静态方法
     */
    public  void  useStrategy (){
        strategy.algorithm();
    }
}

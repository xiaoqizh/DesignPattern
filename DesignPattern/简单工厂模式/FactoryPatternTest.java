package 简单工厂模式;
/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:09 2018/1/9
 * @Description:
 */

public class FactoryPatternTest {
    /**
     * @Description: 对简单工厂模式的测试
     */

    public static void main(String[] args) {
        Operate operate = OperateFactory.getOperate("+");
        operate.setVar1(1);
        operate.setVar2(2);
        System.out.println(operate.operate());
    }
}

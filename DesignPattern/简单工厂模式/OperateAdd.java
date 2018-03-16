package 简单工厂模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:58 2018/1/9
 * @Description: 只是举例说明工厂模式
 */

public class OperateAdd extends Operate {

    /**
     * @Description: 加法的操作数
     * @Date: 23:01 2018/1/9
     */
    @Override
    public int operate() {
        int result;
        result = getVar1() + getVar2();
        return result;
    }
}

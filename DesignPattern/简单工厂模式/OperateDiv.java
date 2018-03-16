package 简单工厂模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:02 2018/1/9
 * @Description:
 */

public class OperateDiv extends  Operate {
    /**
     * @Description: 加法的操作数
     * @Date: 23:01 2018/1/9
     */
    @Override
    public int operate() {
        int result;
        if (getVar2() == 0) {
            throw new IllegalArgumentException("传递的参数错误");
        }
        result = (getVar1()/ getVar2());
        return result;
    }
}

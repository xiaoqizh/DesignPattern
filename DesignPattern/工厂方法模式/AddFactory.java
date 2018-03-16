package 工厂方法模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 13:28 2018/1/13
 * @Description:
 */

public class AddFactory implements Factory {

    @Override
    public Object createBean() {
        return new AddBean();
    }
}

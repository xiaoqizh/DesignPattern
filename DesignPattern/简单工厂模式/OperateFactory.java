package 简单工厂模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:03 2018/1/9
 * @Description:
 */

public class OperateFactory {
     private static Operate operateObj;
    /**
     *  得到相应的对象  ; 一般static成员都是斜体
     */
    public static Operate getOperate(String operateStr){
        switch (operateStr) {
            case "+":
                operateObj = new OperateAdd();
                break;
            case "/":
                operateObj = new OperateDiv();
                break;
            default:;
        }
        return operateObj;
    }

    public Operate getOperateObj() {
        return operateObj;
    }

    public void setOperateObj(Operate operateObj) {
        this.operateObj = operateObj;
    }
}

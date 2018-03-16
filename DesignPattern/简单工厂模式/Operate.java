package 简单工厂模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:58 2018/1/9
 * @Description:
 */

public class Operate {

    private int var1;
    private int var2;
    /**
     *  操作方法
     */
    public  int  operate (){
        return  0;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}

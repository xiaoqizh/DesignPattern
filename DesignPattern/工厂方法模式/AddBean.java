package 工厂方法模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 13:29 2018/1/13
 * @Description:
 */

public class AddBean {
    private int var1;
    private int var2;
    public AddBean(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public AddBean() {
    }

    /**
     *
     */
    public  int getResult (){
        return var1 + var2;
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

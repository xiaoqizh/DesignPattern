package 模板方法模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:25 2018/1/14
 * @Description:
 */

public abstract class asd {
    private String name;
    private String address;

    public asd(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract void test1();
}

class asdImpl extends asd {
    /**
     * 通过子类调用父类的构造方法；
     * 所以其实抽象类的构造方法是有用的
     * 接口是不允许有构造方法的
     * @param name
     * @param address
     */
    public asdImpl(String name, String address) {
        super(name, address);
    }

    @Override
    void test1() {
        System.out.println("我是你爸爸");
    }
}

class test1 {
    public static void main(String[] args) {
        asdImpl asd = new asdImpl("asd","qwe");
    }
}



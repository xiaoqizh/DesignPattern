package 建造者模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:57 2018/1/14
 * @Description:
 */

public abstract class PersonBuilderAbstrate {
    private String name;
    private int age;

    public PersonBuilderAbstrate() {
    }

    /**
     * 抽象类中的构造方法就是为了子类调用的
     */

    abstract void yifu() ;
    abstract void xiezi() ;
    abstract void xishu() ;

    /**
     * @Description: 在父类中事先定义好顺序  子类直接调用这个方法就行了
     * @Date: 23:01 2018/1/14
     */

    public void buildPerson() {
        yifu();
        xiezi();
        xishu();
    }
}

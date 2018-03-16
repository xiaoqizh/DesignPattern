package 建造者模式;

import 代理模式.Person;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 23:01 2018/1/14
 * @Description:
 */

public class PersonBuild extends PersonBuilderAbstrate {

    /**
     * 抽象类中的构造方法就是为了子类调用的
     * 一定要有构造方法啊 应该让父类中参数赋值
     */

    @Override
    void yifu() {
        System.out.println("我穿衣服了");
    }

    @Override
    void xiezi() {
        System.out.println("我穿鞋子了");
    }

    @Override
    void xishu() {
        System.out.println("我洗漱啦");
    }

    public static void main(String[] args) {
        PersonBuild personBuild = new PersonBuild();
        personBuild.buildPerson();
    }
}

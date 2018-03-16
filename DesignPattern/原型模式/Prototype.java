package 原型模式;

import org.junit.Test;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:10 2018/1/12
 * @Description:
 *                  用的不多 但是也要知道这些克隆模式
 */

public class Prototype {
    /**
     * @Description: 浅克隆
     */
    @Test
    public void test1() throws CloneNotSupportedException {
        //创建对象时 避免重复的创建对象
        Person p1 = new Person("zhangsan1",29);
        Person p2 = new Person("zhangsan2",29);
        //此时弊端就显示出来了 都是同样的人 一次次的创建很麻烦 所以使用克隆
        //此时使用的是 浅复制 ，因为现在Person类中都是值类型；并不是引用类型
        //进行克隆之后 这个对象就是自己的了 ，所以可以随便的设置；下面打印的就是false
        Person clone = (Person)p1.clone();
        System.out.println(clone == p1);
        //深复制就是要复制的对象中有一个别的类的引用；而不仅仅有值类型
    }

    /**
     * @Description: 测试下深克隆
     */
    @Test
    public void test2() throws CloneNotSupportedException {
        Message message = new Message("binbin", "456");
        DeptPerson person = new DeptPerson(message, "zhngsan", 25);
        System.out.println(person);
        //下面测试深复制
        DeptPerson clone = person.clone();
        //这里打印的就是message 为null。
        //如果不重写父类的Clone()方法 那么message引用的就是被克隆对象中的引用
        System.out.println(clone);
    }
}

/**
 * @Description: 这里的Clone接口还是没有什么方法 但这就是一种规范
 * @Date: 22:21 2018/1/12
 */
class Person implements  Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void out(String msg) {
        System.out.println(msg+":创建了一个人类");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class DeptPerson  implements  Cloneable{
    /**
     * @Description: 这就是个引用类型
     *                 此时进行复制时 就要重写clone方法
     * @Date: 22:24 2018/1/12
     */
    private Message message ;
    private String name;
    private int age;

    public DeptPerson(Message message, String name, int age) {
        this.message = message;
        this.name = name;
        this.age = age;
    }

    @Override
    protected DeptPerson clone() throws CloneNotSupportedException {
        DeptPerson clone = (DeptPerson) super.clone();
        clone.setMessage(null);
        return clone;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DeptPerson{" +
                "message=" + message +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Message {
    private String xuesheng;
    private String xuehao;
    public Message(String xuesheng, String xuehao) {
        this.xuesheng = xuesheng;
        this.xuehao = xuehao;
    }
    public String getXuesheng() {
        return xuesheng;
    }

    public void setXuesheng(String xuesheng) {
        this.xuesheng = xuesheng;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    @Override
    public String toString() {
        return "Message{" +
                "xuesheng='" + xuesheng + '\'' +
                ", xuehao='" + xuehao + '\'' +
                '}';
    }
}
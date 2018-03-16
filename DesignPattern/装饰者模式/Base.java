package 装饰者模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 21:27 2018/1/10
 * @Description:被装饰的类
 *                我现在像 aop是不是也相当于装饰者模式呢？
 */

public class Base {
    /**
     *  被装饰的方法
     */
    public  void  beenDecorated (){
        System.out.println("我是Base类中的方法" );
    }
}

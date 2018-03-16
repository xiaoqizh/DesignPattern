package 模板方法模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 0:04 2018/1/14
 * @Description: 把重复的部分放在父类中进行声明
 */

public class AllTest {
    /**
     * 模板方法的测试
     */
    public  void  question1 (){ System.out.println("这是问题一");
    }
    public  void  question2 (){
        System.out.println("这是问题二");
    }
    public  void  question3 (){
        System.out.println("这是问题三");
    }
}

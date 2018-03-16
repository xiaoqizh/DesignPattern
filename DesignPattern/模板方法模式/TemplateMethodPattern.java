package 模板方法模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 0:03 2018/1/14
 * @Description:
 */

public class TemplateMethodPattern extends  AllTest {
    /**
     * @Description: 模板方法把共同的放在父类 然后通过继承
     *                 在对父类的方法进行改变。super
     * @Date: 22:34 2018/1/14
     */
    @Override
    public void question1() {
        super.question1();
        System.out.println("习题1的答案");
    }

    @Override
    public void question2() {
        super.question2();
        System.out.println("习题2的答案");
    }

    @Override
    public void question3() {
        super.question3();
        System.out.println("习题3的答案");
    }
    /**
     *
     */
    public  void answerTest(){
        question1();
        question2();
        question3();
    }
    public static void main(String[] args) {
        TemplateMethodPattern t = new TemplateMethodPattern();
        t.answerTest();
    }
}

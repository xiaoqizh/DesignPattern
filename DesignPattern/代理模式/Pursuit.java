package 代理模式;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 21:41 2018/1/10
 * @Description:
 */

public class Pursuit extends Person {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    /**
     *  追求者独有的送礼物的方法
     *  二者之间是默认的关系
     *  实际的联系是Pursuit和SchoolGirl的
     *  但是此时需要代理去送礼物
     */
    public  void  giveGift (){
        System.out.println("我送 "+schoolGirl.getName()+" 苹果电脑啦");
    }
}

package 代理模式;
/**
 * @Author: xiaoqiZh
 * @Date: Created in 21:46 2018/1/10
 * @Description: 代理只是提供一个途径 而不提供具体的方法
 */

public class Proxy {
    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    /**
     *  进行代理
     */
    public  void  proxyGift (){
        pursuit.giveGift();
    }
}

class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("binbin");
        schoolGirl.setAge(10);
        Proxy proxy = new Proxy(schoolGirl);
        proxy.proxyGift();
    }
}

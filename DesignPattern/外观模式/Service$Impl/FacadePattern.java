package 外观模式.Service$Impl;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:50 2018/1/14
 * @Description: 这就是外观模式
 *                 任务全由外观模式来操作  我觉得还是代理模式的一种调用
 *                 可以看到代理模式是多么的重要
 */

public class FacadePattern {
    private ServiceA serviceA;
    private ServiceB serviceB;
    public FacadePattern(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA =  serviceA;
        this.serviceB = serviceB;
    }
    /**
     *
     */
    public  void  AB (){
        serviceA.print();
        serviceB.print();
    }

    public static void main(String[] args) {
        FacadePattern facedePattern = new FacadePattern(new ServiceImplA(), new ServiceImplB());
        facedePattern.AB();
    }
}

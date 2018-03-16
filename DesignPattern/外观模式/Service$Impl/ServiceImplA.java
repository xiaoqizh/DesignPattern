package 外观模式.Service$Impl;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:48 2018/1/14
 * @Description:
 */

public class ServiceImplA implements  ServiceA{
    @Override
    public void print() {
        System.out.println("A服务调用了");
    }
}

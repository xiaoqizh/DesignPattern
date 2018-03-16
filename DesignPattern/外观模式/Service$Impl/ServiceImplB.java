package 外观模式.Service$Impl;

/**
 * @Author: xiaoqiZh
 * @Date: Created in 22:48 2018/1/14
 * @Description:
 */

public class ServiceImplB implements  ServiceB{
    @Override
    public void print() {
        System.out.println("B服务调用了");
    }
}

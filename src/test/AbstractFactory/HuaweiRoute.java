package test.AbstractFactory;

public class HuaweiRoute implements RouteProduct{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }
}

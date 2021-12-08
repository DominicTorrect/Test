package test.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("===========小米产品=========");
        PhoneProduct phone = new XiaomiFactory().getPhone();
        phone.start();
        phone.shutdown();
        RouteProduct route = new XiaomiFactory().getRoute();
        route.start();
        route.shutdown();
        System.out.println("===========华为产品=========");
        phone = new HuaweiFactory().getPhone();
        phone.start();
        phone.shutdown();
        route = new HuaweiFactory().getRoute();
        route.start();
        route.shutdown();
    }
}

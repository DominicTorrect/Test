package test.AbstractFactory;

public class HuaweiFactory implements ProductFactory{
    @Override
    public PhoneProduct getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public RouteProduct getRoute() {
        return new HuaweiRoute();
    }
}

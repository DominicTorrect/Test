package test.AbstractFactory;

public class XiaomiFactory implements ProductFactory{
    @Override
    public PhoneProduct getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public RouteProduct getRoute() {
        return new XioamiRoute();
    }
}

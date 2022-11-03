package Task8;

public class SpecificFactory2 implements AbstractFactory {


    @Override
    public ProductA createProductA() {
        return new SpecificProductA2();
    }

    public ProductB createProductB() {
        return new SpecificProductB2();
    }
}



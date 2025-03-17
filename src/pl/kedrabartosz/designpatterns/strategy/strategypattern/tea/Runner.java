package pl.kedrabartosz.designpatterns.strategy.strategypattern.tea;

public class Runner {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop(new BlackTeaStrategy());
        System.out.println(teaShop.serveTea());

        teaShop.setTeaStrategy(new GreenTeaStrategy());
        System.out.println(teaShop.serveTea());

        teaShop.setTeaStrategy(new WhiteTeaStrategy());
        System.out.println(teaShop.serveTea());
    }
}

package src.ch08_Adapter.Adapter;

public class NormalArcher implements Archer{

    @Override
    public void shot() {
        System.out.println("射箭");
    }
}

import dev.uira.hfdp.duck.Duck;
import dev.uira.hfdp.duck.DuckCall;
import dev.uira.hfdp.duck.MallardDuck;
import dev.uira.hfdp.duck.ModelDuck;
import dev.uira.hfdp.duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		DuckCall dc = new DuckCall();
		dc.quack();
	}
}

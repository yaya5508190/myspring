package bean;

import java.util.Random;

public class BeanB {
	int r;
	public BeanB(){
		Random random = new Random();
		r = random.nextInt(100);
	}
	public void showRandom(){
		System.out.println(r);
	}
}

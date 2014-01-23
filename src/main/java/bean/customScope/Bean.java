package bean.customScope;

import java.util.Random;

public class Bean {
	int i = 0;
	Random r = new Random();

	public Bean() {
		// TODO Auto-generated constructor stub
		i = r.nextInt(100);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

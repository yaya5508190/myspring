package bean.lifecycleMechanisms;

import org.springframework.context.Lifecycle;

public class BeanForLifecycle implements Lifecycle {
	boolean flag = false;

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return flag;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		flag = true;
		System.out.println("start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		flag = false;
		System.out.println("stop");
	}

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

package Chap2_Observer.weatherStation;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
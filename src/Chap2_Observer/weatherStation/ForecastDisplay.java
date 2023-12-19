package Chap2_Observer.weatherStation;

public class ForecastDisplay implements Observer, DisplayElement{

	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}

	@Override
	public void display() {
		// 디스플레이 코드
	}
}

package ua.org.oa.dyachenko_s;



public class MobileElectronics {
   
	private String nameDevice;
	private int screenDiagonal;
	private int batteryCapacity;
	private double priceDevice;
	
	
	public MobileElectronics(String nameDevice, int screenDiagonal, int batteryCapacity, double priceDevice) {
		
		setNameDevice(nameDevice);
		setScreenDiagonal(screenDiagonal);
		setBatteryCapacity(batteryCapacity);
		setPriceDevice(priceDevice);
		
	}

	public String getNameDevice() {
		return nameDevice;
	}

	public void setNameDevice(String nameDevice) {
		if (nameDevice != null)
		{
		this.nameDevice = nameDevice;
		}  else {
			System.out.println("Name cannot be empty!");
		}
	}

	public int getScreenDiagonal() {
		return screenDiagonal;
	}

	public void setScreenDiagonal(int screenDiagonal) {
		if (screenDiagonal != 0) 
		{
		this.screenDiagonal = screenDiagonal;
		} else {
			System.out.println("Screen diagonal of the device cannot be 0!");
		}
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		if (batteryCapacity != 0) 
		{
		this.batteryCapacity = batteryCapacity;
		} else {
			System.out.println("Battery capacity cannot be 0!");
		}
	}

	
	public double getPriceDevice() {
		return priceDevice;
	}

	public void setPriceDevice(double priceDevice) {
		if (priceDevice != 0)
		{
		this.priceDevice = priceDevice;
		} else {
			System.out.println("Price of the device cannot be 0!");
		}
	}

	@Override
	public String toString() {
		return "MobileElectronics [Name Device= " + nameDevice + ", Screen Diagonal= " + screenDiagonal
				+ ", Battery Capacity= " + batteryCapacity + ", Price Device= "
				+ priceDevice + "]";
	}
	
}

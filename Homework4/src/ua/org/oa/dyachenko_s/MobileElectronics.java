package ua.org.oa.dyachenko_s;

public class MobileElectronics {            // ������������ �����
	
		   
		private String nameDevice;          // ��� �������
		private double priceDevice;         // ���� �������
	
		
		//�����������
		public MobileElectronics(String nameDevice, double priceDevice) {
			
			setNameDevice(nameDevice);
			setPriceDevice(priceDevice);
			
		}
		
	   

		public String getNameDevice() {
			return nameDevice;
		}

		public void setNameDevice(String nameDevice) {
			if (nameDevice != null)         //��������
			{
			this.nameDevice = nameDevice;
			}  else {
				System.out.println("Name cannot be empty!");
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
			return "MobileElectronics [Name Device = " + nameDevice + ", Price Device = " + priceDevice + "]";
		}

		
	}


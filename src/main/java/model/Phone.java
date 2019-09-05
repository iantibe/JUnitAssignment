package model;

public class Phone {
	
		//properties
		private String osType;
		private int batteryLevel;
		private int numberOfAppsInstalled;
		
		//constructors
		public Phone() {
			super();
		}
		
		public Phone(String os, int bat, int apps) {
			this.osType = os;
			this.batteryLevel = bat;
			this.numberOfAppsInstalled = apps;
			
		}
		
		//getters and setters
		public String getOsType() {
			return osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public int getBatteryLevel() {
			return batteryLevel;
		}

		public void setBatteryLevel(int batteryLevel) {
			this.batteryLevel = batteryLevel;
		}

		public int getNumberOfAppsInstalled() {
			return numberOfAppsInstalled;
		}

		public void setNumberOfAppsInstalled(int numberOfAppsInstalled) {
			this.numberOfAppsInstalled = numberOfAppsInstalled;
		}
		
		//methods
		public void chargeBattery() {
			if(this.getBatteryLevel() <= 95) {
				this.setBatteryLevel(this.getBatteryLevel() + 5);
			}else {
				this.setBatteryLevel(100);
			}
		}
		
		public void addApp() {
			this.setNumberOfAppsInstalled(this.getNumberOfAppsInstalled() + 1);
		}

}

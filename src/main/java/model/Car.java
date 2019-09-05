package model;

public class Car {
	
		//properties
		private int speed;
		private String color;
		private String make;
		private boolean isMoving;
		
		//constructor
		public Car() {
			super();
			
		}
		
		public Car(int speed, String col, String mak) {
			this.speed = speed;
			this.color = col;
			this.make = mak;
			
			if(this.getSpeed() < 0) {
				this.setSpeed(0);
				this.setMoving(false);
			}
						
			if(speed != 0) {
				isMoving = true;
			}
		}
		
		
		// getters and setters
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
			
			if(this.getSpeed() < 0) {
				this.setSpeed(0);
				this.setMoving(false);
			}
			
			if(this.getSpeed() != 0) {
				this.setMoving(true);
			}
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public boolean isMoving() {
			return isMoving;
		}

		public void setMoving(boolean isMoving) {
			this.isMoving = isMoving;
		}
		
		//methods
		public void stopCar() {
			this.setSpeed(0);
			this.setMoving(false);
		}
		
		public void acclerateCar() {
			this.setSpeed(this.getSpeed() + 5);
		}

}

package model;

public class Cat {
	
		//properties
		private String name;
		private String color;
		private boolean isLitterBoxTrained;

		//constructor
		public Cat() {
			super();
		}
		
		public Cat(String nam, String col, boolean litter) {
			this.name = nam;
			this.color = col;
			this.isLitterBoxTrained = litter;
		}

		//getter and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isLitterBoxTrained() {
			return isLitterBoxTrained;
		}

		public void setLitterBoxTrained(boolean isLitterBoxTrained) {
			this.isLitterBoxTrained = isLitterBoxTrained;
		}
		
		//methods
		public String speak() {
			return "Meow!";
		}
		
		public String petCatTooMuch() {
			return "Hiss!";
		}
}

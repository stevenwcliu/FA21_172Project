package test.register;

public class Order {
	
	
	private String drinkName;
	private String size;
	private String temp;
	private String milk;
	private String topping;
	private float price;
	
	public float calculatePrice() {
		float totalPrice=0;
		if(drinkName.equalsIgnoreCase("Black Coffee")) {
			totalPrice+=4.25;
		}
		else if(drinkName.equalsIgnoreCase("Latte")) {
			totalPrice+=4.50;
		}
		else if(drinkName.equalsIgnoreCase("Cold Brew")) {
			totalPrice+=4.75;
		}
		else if(drinkName.equalsIgnoreCase("Hot Chocolate")) {
			totalPrice+=4.25;
		}
		
		if(size.equalsIgnoreCase("Medium")) {
			totalPrice+=0.5;
		}
		else if(size.equalsIgnoreCase("Large")) {
			totalPrice+=1;
		}
		
		if(milk.equalsIgnoreCase("Soy Milk")) {
			totalPrice+=0.2;
		}
		else if(milk.equalsIgnoreCase("Almond Milk")) {
			totalPrice+=0.2;
		}
		price = totalPrice;
		return price;
	}
	
	
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getMilk() {
		return milk;
	}
	public void setMilk(String milk) {
		this.milk = milk;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	@Override
	public String toString() {
		return "Order [drinkName=" + drinkName + ", size=" + size +", temp=" + temp +", milk=" + milk
				+ "]";
	}

}

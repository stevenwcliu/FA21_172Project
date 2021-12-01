package demo;

public class Order {
	
	
	private String drinkName;
	private String size;
	private String temp;
	private String milk;
	private String topping;
	private float price;
	
	public float calculatePrice() { //calculate the price of the order
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
	
	//get the price
	public float getPrice() { 
		return price;
	}

	//set price
	public void setPrice(float price) {
		this.price = price;
	}

	//get list of toppings
	public String getTopping() {
		return topping;
	}
	//set the list of toppings
	public void setTopping(String topping) {
		this.topping = topping;
	}
	//get the type of milk
	public String getMilk() {
		return milk;
	}
	//set the type of milk
	public void setMilk(String milk) {
		this.milk = milk;
	}
	//get temperature
	public String getTemp() {
		return temp;
	}
	//set the temperature
	public void setTemp(String temp) {
		this.temp = temp;
	}
	//get the drink name
	public String getDrinkName() {
		return drinkName;
	}
	//set drink name
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	//get the size
	public String getSize() {
		return size;
	}
	//set the size
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	@Override
	public String toString() {
		return "Order [drinkName=" + drinkName + ", size=" + size +", temp=" + temp +", milk=" + milk
				+ "]";
	}

}

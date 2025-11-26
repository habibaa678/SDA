
package restaurantmanagementsystem;
import java.lang.*;

public class MainDish extends FoodItem{
	
	private String category;
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public String getCategry(){
		return this.category;
	}
	
	public void showInfo(){
		System.out.println("Food Type: Main Dish");
            String fid = null;
		System.out.println("Food ID: "+fid);
            String name = null;
		System.out.println("Food Name: "+name);
		System.out.println("Category: "+category);
            String availableQuantity = null;
		System.out.println("Available Quantity: "+availableQuantity);
            String price = null;
		System.out.println("Price: "+price);
	}
}

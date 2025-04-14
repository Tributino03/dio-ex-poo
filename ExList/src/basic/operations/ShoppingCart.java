package basic.operations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> onlineShoppingCart;
	
	public ShoppingCart() {
		this.onlineShoppingCart = new ArrayList<>();
	}
	
	public void addItem(String name, double price, int quantity){
		onlineShoppingCart.add(new Item(name, price, quantity));
	}
	
	public void removeItem(String name) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item i : onlineShoppingCart) {
			if(i.getName().equalsIgnoreCase(name)) {
				itensParaRemover.add(i);
			}
		}
		onlineShoppingCart.removeAll(itensParaRemover);
	}
	
	public double calculateTotalValue() {
	    double total = 0.0;

	    for (Item item : onlineShoppingCart) {
	        total += item.getPrice() * item.getQuantity();
	    }

	    return total;
	}
	
	public void viewItems() {
		for (Item item : onlineShoppingCart) {
	        System.out.println("name: " + item.getName());
	        System.out.println("price: $" + item.getPrice());
	        System.out.println("Quantity: " + item.getQuantity());
	    }
	}
	
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		System.out.println("total cart value is: " + shoppingCart.calculateTotalValue());
		shoppingCart.addItem("doll", 20, 5);
		shoppingCart.addItem("ball", 5, 3);
		System.out.println("total cart value is: " + shoppingCart.calculateTotalValue());
		shoppingCart.viewItems();
		shoppingCart.removeItem("ball");
		shoppingCart.viewItems();
		System.out.println("total cart value is: " + shoppingCart.calculateTotalValue());
	}
}

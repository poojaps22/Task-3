package pt2;

import pt2.ElectronicDevice;

public class ElectronicDevice implements Comparable<ElectronicDevice>
{

	int price;
	int rating;
	
	public ElectronicDevice(int price, int rating) {
		super();
		this.price = price;
		this.rating = rating;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(ElectronicDevice o) {
		// TODO Auto-generated method stub
		return this.getRating() - o.getRating();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "=> "+rating+" - "+price+"\n";
	}
	
	
}

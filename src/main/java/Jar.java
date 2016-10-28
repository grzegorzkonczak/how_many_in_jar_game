
public class Jar {
	
	private String itemName;
	private int maxCapacity;
	private int numberOfItemsInside;
	
	public Jar(String itemName, int maxCapacity) {
		this.itemName = itemName;
		if (maxCapacity == 0){
			this.maxCapacity = 1;
		} else {
			this.maxCapacity = maxCapacity;
		}
		numberOfItemsInside = 0;
	}
	
	// fills the jar with specified amount of item
	public void fill(int fillAmount){
		numberOfItemsInside = fillAmount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}


	public int getNumberOfItemsInside() {
		return numberOfItemsInside;
	}

	
	
}

package liberry;

public abstract class Item {
	
	int itemId;

	static int  i = 0;

	public Item() 
	{

		i++;
		this.itemId = i;

	}

	public abstract int getItemId();
}

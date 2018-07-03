package liberry;

public abstract class Item {
	
	int itemId;

	static int  i = 0;
    /*
     * this consturter adds 1 to id eveytime it is called
     * in order to have a uquie item for ever time
     */
	public Item() 
	{
     	i++;
		this.itemId = i;
	}
	
	public int getItemId()
	{
		return itemId;
	}


}

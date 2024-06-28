package shopping;

public class ItemDetail {
 private Item item;
 private int quanity;
 
 public ItemDetail() {
}

public ItemDetail(Item item, int quanity) {
	this.item = item;
	this.quanity = quanity;
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

public int getQuanity() {
	return quanity;
}

public void setQuanity(int quanity) {
	this.quanity = quanity;
}

@Override
public String toString() {
	return "ItemDetail [item=" + item + ", quanity=" + quanity + "]";
}
  

 
}
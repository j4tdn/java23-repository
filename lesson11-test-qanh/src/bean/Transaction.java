package bean;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private Trader trader;
    private LocalDate  createdItem;
    private double value;

    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Trader getTrader() {
		return trader;
	}


	public void setTrader(Trader trader) {
		this.trader = trader;
	}



	public LocalDate getCreatedItem() {
		return createdItem;
	}


	public void setCreatedItem(LocalDate createdItem) {
		this.createdItem = createdItem;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public Transaction(int id, Trader trader, LocalDate localDate, double value) {
        this.id = id;
        this.trader = trader;
        this.createdItem = localDate;
        this.value = value;
    }


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", createdItem=" + createdItem + ", value=" + value
				+ "]";
	}

 


}


public class Commision extends Hourly{
	private double totalSales, rate;
	public Commision(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double totalSalesRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.rate = totalSalesRate;
		// TODO Auto-generated constructor stub
	}
	public void setSales(double sales){
		this.totalSales = sales;
	}
	public double pay(){
		double totalPay = super.pay() + rate;
		return totalPay;
		}
	public String toString(){
		return super.toString() + " Total Sales: "+ this.totalSales;
	}
}

package AtmApplication;

public class Pizza {
	private double pizza;
	private double chickenpizza;
	private double onionpizza;
	private double tandooripizza;
	private double doublecheesepizza;
	private double cheesepizza;
	private int extracheese;
	private int extratopping;
//	public double get;
	public Pizza(double pizza, double chickenpizza, double onionpizza, double tandooripizza, double doublecheesepizza,
			double cheesepizza, int extracheese, int extratopping) {
		super();
		this.pizza = 130;
		this.chickenpizza = 1360;
		this.onionpizza = 1250;
		this.tandooripizza = 1250;
		this.doublecheesepizza = 1256;
		this.cheesepizza = 1245;
		this.extracheese = 50;
		this.extratopping = 50;
	}
	public double getPizza() {
		return pizza;
	}
	public void setPizza(double pizza) {
		this.pizza = pizza;
	}
	public double getChickenpizza() {
		return chickenpizza;
	}
	public void setChickenpizza(double chickenpizza) {
		this.chickenpizza = chickenpizza;
	}
	public double getOnionpizza() {
		return onionpizza;
	}
	public void setOnionpizza(double onionpizza) {
		this.onionpizza = onionpizza;
	}
	public double getTandooripizza() {
		return tandooripizza;
	}
	public void setTandooripizza(double tandooripizza) {
		this.tandooripizza = tandooripizza;
	}
	public double getDoublecheesepizza() {
		return doublecheesepizza;
	}
	public void setDoublecheesepizza(double doublecheesepizza) {
		this.doublecheesepizza = doublecheesepizza;
	}
	public double getCheesepizza() {
		return cheesepizza;
	}
	public void setCheesepizza(double cheesepizza) {
		this.cheesepizza = cheesepizza;
	}
	public int getExtracheese() {
		return extracheese;
	}
	public void setExtracheese(int extracheese) {
		this.extracheese = extracheese;
	}
	public int getExtratopping() {
		return extratopping;
	}
	public void setExtratopping(int extratopping) {
		this.extratopping = extratopping;
	}
	@Override
	public String toString() {
		return " 1.pizza=" + pizza + "\n 2.chickenpizza=" + chickenpizza + "\n 3.onionpizza=" + onionpizza
				+ "\n 4.tandooripizza=" + tandooripizza + "\n 5.doublecheesepizza=" + doublecheesepizza + "\n 5.cheesepizza="
				+ cheesepizza + "\n 6.extracheese=" + extracheese + "extratopping=" + extratopping + "]";
	}
	
}

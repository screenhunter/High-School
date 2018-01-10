//name: Juliana Baindate: 9/4/14
import java.text.DecimalFormat;

public class thing {
	public static void main(String[] args) {
		Station downtown = new Station("Downtown", 1);
		Station center = new Station("Center City", 1);
		Station uptown = new Station("Uptown", 2);
		Station suburbia = new Station("Suburb", 4);

		SmartCard jimmy = new SmartCard(20.00); // bought with $20.00
		jimmy.board(center);// boarded in zone 1
		jimmy.disembark(suburbia);// disembark in zone 4
		jimmy.disembark(uptown);// disembark without having boarded

		// lots more test cases!
	}
}

class Station {
	private String name;
	private int zone;

	public Station(String n, int z) {
		name = n;
		zone = z;
	}

	public String getName() {
		return name;
	}

	public int getZone() {
		return zone;
	}

	public void setName(String n) {
		name = n;
	}

	public void setZone(int z) {
		zone = z;
	}
}

class SmartCard {
	private double money;
	private Station start = new Station("wat", 1);
	private int zone;
	private String name;
	private boolean ruon;

	public SmartCard(double m) {
		money = m;
	}

	public void setStart(Station s) {
		start = s;
	}

	public void addMoney(double mula) {
		if (mula > 0)
			money = money + mula;
		if (mula <= 0)
			;
		System.out.println("R u dumb? Do not add negative money!!!");
	}

	public double moneyOnCard() {
		return money;
	}

	public void board(Station s) // geton //START STATION NEEDS INFO
	{
		if (ruon == false) {
			if (money >= 0.5) {
				ruon = true;
				zone = s.getZone();
				name = s.getName();
				System.out.println("Boarded at " + name);
			} else if (money < 0.5) {
				System.out.println("Please add money to your card!");
			} else {
				System.out.println("Please see the station manager!");
			}
		}
	}

	public double cost(Station s) // getoff
	{

		int beginzone = start.getZone();
		int endzone = s.getZone();
		double m = 0;

		if ((beginzone - endzone) > 0)
			m = beginzone - endzone;
		if ((endzone - beginzone) > 0)
			m = endzone - beginzone;
		if ((endzone - beginzone) == 0)
			m = 0;

		double juju = .50 + m * .75;
		return juju;

	}

	public void disembark(Station s) {
		double ay = this.cost(s);
		double balance = money - ay;
		String beginname = start.getName();
		String endname = s.getName();
		
		if (ruon == true)
			ruon = false;
		else
			System.out.println("Please see the station manager");
		System.out.println("From " + beginname + " to " + endname + " costs "
				+ ay);
		System.out.println("Balance: " + balance);

	}
}
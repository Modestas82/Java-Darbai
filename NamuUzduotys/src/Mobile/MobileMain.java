package Mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile[] mobiles = Mobile.initializeMobiles();
		Mobile.findMostExpensiveMobile(mobiles);
		Mobile.mobileStartsWithA(mobiles);
		}
	}

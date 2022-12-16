package tamilnadu.chennai;

class CommonManInChennai implements TrafficRulesChennai{
	
	@Override
	public void goByDieselVehicle() {
		System.out.println("Buying DieselVehicle");
	}

	@Override
	public void goByBicycle() {
		System.out.println("Buying Bicycle");
	}
	
	public static void main(String[] args) {
		TrafficRulesChennai obj = new CommonManInChennai();
		System.out.println(obj.trafficCommisssioner);
		obj.goByDieselVehicle();
		obj.goByBicycle();
	}
}

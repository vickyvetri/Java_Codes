package india.newDelhi;

import tamilnadu.chennai.TrafficRulesChennai;

class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai{

	@Override
	public void dontGoByDieselVehicle() {
		System.out.println("Don't Buying Diesel Vehicle");
	}

	@Override
	public void goByBicycle() {
		System.out.println("Buying Bicycle");
	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("Buying Diesel Vehicle");	
	}
	public static void main(String[] args) {
		TrafficRulesDelhi obj1 = new CommonManInDelhi();
		obj1.dontGoByDieselVehicle();
		obj1.goByBicycle();
		System.out.println(obj1.trafficCommisssioner);
		
		TrafficRulesChennai obj2 = new CommonManInDelhi();
		obj2.goByDieselVehicle();
		obj2.goByBicycle();
		System.out.println(obj2.trafficCommisssioner);
	}
}

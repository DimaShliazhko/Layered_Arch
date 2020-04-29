package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		// you may add your own code here
		if (appliance == null) {
			System.out.println("объек данному критерию поиска не найден");
		}
		else {
		 System.out.println("новый объект "+appliance);
		}
	}
	
	// you may add your own code here

}

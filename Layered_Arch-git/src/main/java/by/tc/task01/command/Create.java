package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.ApplianceCreator;

public class Create {

//	Appliance appliance ;

	public Oven createApplianceOven(Map<String, String> params) {
		System.out.println("создание объекта");
		Oven oven = new Oven();
		oven.setcAPACITY(Double.parseDouble(params.get("CAPACITY")));
		oven.setdEPTH(Double.parseDouble(params.get("DEPTH")));
		oven.sethEIGHT(Double.parseDouble(params.get("HEIGHT")));
		oven.setpOWER_CONSUMPTION(Double.parseDouble(params.get("POWER_CONSUMPTION")));
		oven.setwEIGHT(Double.parseDouble(params.get("WEIGHT")));
		oven.setwIDTH(Double.parseDouble(params.get("WIDTH")));
		return oven;

	}

	public Appliance createApplianceLaptop(Map<String, String> params) {
		Laptop laptop = new Laptop();
		laptop.setbATTERY_CAPACITY(Double.parseDouble(params.get("bATTERY_CAPACITY")));
		laptop.setcPU(Double.parseDouble(params.get("CPU")));
		laptop.setdISPLAY_INCHS(Double.parseDouble(params.get("DISPLAY_INCHS")));
		laptop.setmEMORY_ROM(Double.parseDouble(params.get("MEMORY_ROM")));
		laptop.setoS(params.get("OS"));
		laptop.setsYSTEM_MEMORY(Double.parseDouble(params.get("SYSTEM_MEMORY")));
		return laptop;
	}

	public Appliance createApplianceRefrigerator(Map<String, String> params) {
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.setfREEZER_CAPACITY(Double.parseDouble(params.get("FREEZER_CAPACITY")));
		refrigerator.sethEIGHT(Double.parseDouble(params.get("HEIGHT")));
		refrigerator.setoVERALL_CAPACITY(Double.parseDouble(params.get("OVERALL_CAPACITY")));
		refrigerator.setpOWER_CONSUMPTION(Double.parseDouble(params.get("POWER_CONSUMPTION")));
		refrigerator.setwEIGHT(Double.parseDouble(params.get("WEIGHT")));
		refrigerator.setwIDTH(Double.parseDouble(params.get("WIDTH")));
		return refrigerator;
	}

	public Appliance createApplianceVacuumCleaner(Map<String, String> params) {
		
			VacuumCleaner vacuumcleaner = new VacuumCleaner();
			vacuumcleaner.setbAG_TYPE(params.get("BAG_TYPE"));
			vacuumcleaner.setcLEANING_WIDTH(Double.parseDouble(params.get("CLEANING_WIDTH")));
			vacuumcleaner.setfILTER_TYPE(params.get("FILTER_TYPE"));
			vacuumcleaner.setmOTOR_SPEED_REGULATION(Double.parseDouble(params.get("MOTOR_SPEED_REGULATION")));
			vacuumcleaner.setpOWER_CONSUMPTION(Double.parseDouble(params.get("POWER_CONSUMPTION")));
			vacuumcleaner.setwAND_TYPE(params.get("wAND_TYPE"));
			return vacuumcleaner;
	}

	public Appliance createApplianceSpeakers(Map<String, String> params) {
		Speakers speakers = new Speakers();
		speakers.setcORD_LENGTH(Double.parseDouble(params.get("CORD_LENGTH")));
		speakers.setfREQUENCY_RANGE(Double.parseDouble(params.get("FREQUENCY_RANGE")));
		speakers.setnUMBER_OF_SPEAKERS(Double.parseDouble(params.get("nUMBER_OF_SPEAKERS")));
		speakers.setpOWER_CONSUMPTION(Double.parseDouble(params.get("POWER_CONSUMPTION")));
		return speakers;
	}

	public Appliance createApplianceTabletPC(Map<String, String> params) {
		TabletPC tabletPC = new TabletPC();
		tabletPC.setbATTERY_CAPACITY(Double.parseDouble(params.get("BATTERY_CAPACITY")));
		tabletPC.setcOLOR(params.get("COLOR"));
		tabletPC.setdISPLAY_INCHES(Double.parseDouble(params.get("DISPLAY_INCHES")));
		tabletPC.setfLASH_MEMORY_CAPACITY(Double.parseDouble(params.get("FLASH_MEMORY_CAPACITY")));

		return tabletPC;
	}
}

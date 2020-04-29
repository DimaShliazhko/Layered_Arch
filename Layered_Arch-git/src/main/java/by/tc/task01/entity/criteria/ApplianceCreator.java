package by.tc.task01.entity.criteria;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import by.tc.task01.command.Command;
import by.tc.task01.command.Create;
import by.tc.task01.command.CreateLaptop;
import by.tc.task01.command.CreateOven;
import by.tc.task01.command.CreateRefrigerator;
import by.tc.task01.command.CreateSpeakers;
import by.tc.task01.command.CreateTabletPC;
import by.tc.task01.command.CreateVacuumCleaner;
import by.tc.task01.command.Developer;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceCreator {

	Create create = new Create();
	Developer developer = new Developer(new CreateOven(create), new CreateLaptop(create), new CreateTabletPC(create),
			new CreateSpeakers(create), new CreateVacuumCleaner(create), new CreateRefrigerator(create));

	public Appliance create(List<String> data) {

		List<Appliance> appliances = new ArrayList<Appliance>();

		Map<String, String> params;
		Appliance appliance = new Appliance();

		for (String d : data) {
			params = applianceDataParse(d);

			String applianceType = params.get("type");

			if (applianceType.equalsIgnoreCase("Oven")) {
				appliance = developer.startCreateOven(params);
				// appliance = createApplianceOven(params);

			} else if (applianceType.equalsIgnoreCase("laptop")) {
				appliance = developer.startCreateLaptop(params);
				// appliance = createApplianceLaptop(params);

			} else if (applianceType.equalsIgnoreCase("Refrigerator")) {
				appliance = developer.startCreateRefrigerator(params);
				// appliance = createApplianceRefrigerator(params);

			} else if (applianceType.equalsIgnoreCase("VacuumCleaner"))

			{
				appliance = developer.startCreateVacuumCleaner(params);
				// appliance = createApplianceVacuumCleaner(params);

			} else if (applianceType.equalsIgnoreCase("TabletPC"))

			{
				appliance = developer.startCreateTabletPC(params);
				// appliance = createApplianceTabletPC(params);

			} else if (applianceType.equalsIgnoreCase("Speakers"))

			{
				appliance = developer.startCreateSpeakers(params);
				// appliance = createApplianceSpeakers(params);

			}

		}
		return appliance;

	}

	Map<String, String> applianceDataParse(String singleApplData) {

		Map<String, String> parsString = new HashMap<>();
		// String[] parts = str.split("\\s+");

		final String reg = "\\s*[:|=|,|;]\\s*";
		String[] parse = singleApplData.split(reg);

		// List<String> newList = Arrays.asList(parse); // для удаления null значений

		// newList.removeAll(Collections.singleton(null));
		for (String list : parse) {

			// System.out.println(list);

		}

		// System.out.println(parse.length);

		for (int i = 0; i <= parse.length - 2;) {
			if (i == 0) {
				parsString.put("type", parse[i]);
				i++;
			} else {
				parsString.put(parse[i], parse[i + 1]);
				i = i + 2;
			}
		}

		// System.out.println("количество пар " + parsString.size());

		for (Map.Entry<String, String> pair : parsString.entrySet()) {

			// System.out.println(pair.getKey() + " " + pair.getValue());

		}

		return parsString;

	}

////создание команды реализованно в паттерне команда
	/*
	 * public Oven createApplianceOven(Map<String, String> params) { Oven oven = new
	 * Oven();
	 * 
	 * oven.setcAPACITY(Double.parseDouble(params.get("CAPACITY")));
	 * oven.setdEPTH(Double.parseDouble(params.get("DEPTH")));
	 * oven.sethEIGHT(Double.parseDouble(params.get("HEIGHT")));
	 * oven.setpOWER_CONSUMPTION(Double.parseDouble(params.get("POWER_CONSUMPTION"))
	 * ); oven.setwEIGHT(Double.parseDouble(params.get("WEIGHT")));
	 * oven.setwIDTH(Double.parseDouble(params.get("WIDTH")));
	 * 
	 * return oven; }
	 * 
	 * 
	 * public Laptop createApplianceLaptop(Map<String, String> params) { Laptop
	 * laptop = new Laptop();
	 * laptop.setbATTERY_CAPACITY(Double.parseDouble(params.get("bATTERY_CAPACITY"))
	 * ); laptop.setcPU(Double.parseDouble(params.get("CPU")));
	 * laptop.setdISPLAY_INCHS(Double.parseDouble(params.get("DISPLAY_INCHS")));
	 * laptop.setmEMORY_ROM(Double.parseDouble(params.get("MEMORY_ROM")));
	 * laptop.setoS(params.get("OS"));
	 * laptop.setsYSTEM_MEMORY(Double.parseDouble(params.get("SYSTEM_MEMORY")));
	 * return laptop; }
	 * 
	 * public Refrigerator createApplianceRefrigerator(Map<String, String> params) {
	 * 
	 * Refrigerator refrigerator = new Refrigerator();
	 * refrigerator.setfREEZER_CAPACITY(Double.parseDouble(params.get(
	 * "FREEZER_CAPACITY")));
	 * refrigerator.sethEIGHT(Double.parseDouble(params.get("HEIGHT")));
	 * refrigerator.setoVERALL_CAPACITY(Double.parseDouble(params.get(
	 * "OVERALL_CAPACITY")));
	 * refrigerator.setpOWER_CONSUMPTION(Double.parseDouble(params.get(
	 * "POWER_CONSUMPTION")));
	 * refrigerator.setwEIGHT(Double.parseDouble(params.get("WEIGHT")));
	 * refrigerator.setwIDTH(Double.parseDouble(params.get("WIDTH"))); return
	 * refrigerator; }
	 * 
	 * public VacuumCleaner createApplianceVacuumCleaner(Map<String, String> params)
	 * { VacuumCleaner vacuumcleaner = new VacuumCleaner();
	 * vacuumcleaner.setbAG_TYPE(params.get("BAG_TYPE"));
	 * vacuumcleaner.setcLEANING_WIDTH(Double.parseDouble(params.get(
	 * "CLEANING_WIDTH"))); vacuumcleaner.setfILTER_TYPE(params.get("FILTER_TYPE"));
	 * vacuumcleaner.setmOTOR_SPEED_REGULATION(Double.parseDouble(params.get(
	 * "MOTOR_SPEED_REGULATION")));
	 * vacuumcleaner.setpOWER_CONSUMPTION(Double.parseDouble(params.get(
	 * "POWER_CONSUMPTION"))); vacuumcleaner.setwAND_TYPE(params.get("wAND_TYPE"));
	 * return vacuumcleaner; }
	 * 
	 * public TabletPC createApplianceTabletPC(Map<String, String> params) {
	 * TabletPC tabletPC = new TabletPC();
	 * tabletPC.setbATTERY_CAPACITY(Double.parseDouble(params.get("BATTERY_CAPACITY"
	 * ))); tabletPC.setcOLOR(params.get("COLOR"));
	 * tabletPC.setdISPLAY_INCHES(Double.parseDouble(params.get("DISPLAY_INCHES")));
	 * tabletPC.setfLASH_MEMORY_CAPACITY(Double.parseDouble(params.get(
	 * "FLASH_MEMORY_CAPACITY")));
	 * 
	 * return tabletPC; }
	 * 
	 * public Speakers createApplianceSpeakers(Map<String, String> params) {
	 * Speakers speakers = new Speakers();
	 * speakers.setcORD_LENGTH(Double.parseDouble(params.get("CORD_LENGTH")));
	 * speakers.setfREQUENCY_RANGE(Double.parseDouble(params.get("FREQUENCY_RANGE"))
	 * ); speakers.setnUMBER_OF_SPEAKERS(Double.parseDouble(params.get(
	 * "nUMBER_OF_SPEAKERS")));
	 * speakers.setpOWER_CONSUMPTION(Double.parseDouble(params.get(
	 * "POWER_CONSUMPTION"))); return speakers; }
	 */

}

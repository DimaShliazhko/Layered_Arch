package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public class Developer {
	Command createOven;
	Command createLaptop;
	Command createTabletPC;
	Command createSpeakers;
	Command createVacuumCleaner;
	Command createRefrigerator;

	public Developer(Command createOven, Command createLaptop, Command createTabletPC, Command createSpeakers,
			Command createVacuumCleaner, Command createRefrigerator) {

		this.createOven = createOven;
		this.createLaptop = createLaptop;
		this.createTabletPC = createTabletPC;
		this.createSpeakers = createSpeakers;
		this.createVacuumCleaner = createVacuumCleaner;
		this.createRefrigerator = createRefrigerator;
	}

	public Appliance startCreateOven(Map<String, String> params) {
		return createOven.execute(params);
		
	}

	public Appliance startCreateLaptop(Map<String, String> params) {
		return createLaptop.execute( params);
	}

	public Appliance startCreateTabletPC(Map<String, String> params) {
		return createTabletPC.execute( params);
	}

	public Appliance startCreateSpeakers(Map<String, String> params) {
		return createSpeakers.execute( params);
	}

	public Appliance startCreateVacuumCleaner(Map<String, String> params) {
		return createVacuumCleaner.execute( params);
	}

	public Appliance startCreateRefrigerator(Map<String, String> params) {
		return createRefrigerator.execute( params);
	}

}

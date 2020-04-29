package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.tc.task01.command.Create;
import by.tc.task01.command.CreateLaptop;
import by.tc.task01.command.CreateOven;
import by.tc.task01.command.CreateRefrigerator;
import by.tc.task01.command.CreateSpeakers;
import by.tc.task01.command.CreateTabletPC;
import by.tc.task01.command.CreateVacuumCleaner;
import by.tc.task01.command.Developer;
import by.tc.task01.entity.Appliance;
//import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		try {
			Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
			criteriaOven.add(Oven.CAPACITY.toString(), 32);

			appliance = service.find(criteriaOven);

			PrintApplianceInfo.print(appliance);
		
			System.out.println();

			//////////////////////////////////////////////////////////////////

			criteriaOven = new Criteria(Oven.class.getSimpleName());
			criteriaOven.add(Oven.HEIGHT.toString(), 40);
			criteriaOven.add(Oven.DEPTH.toString(), 60);

			appliance = service.find(criteriaOven);

			PrintApplianceInfo.print(appliance);

			System.out.println();

			//////////////////////////////////////////////////////////////////

			Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
			
			appliance = service.find(criteriaTabletPC);
			criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
			criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
			criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

			appliance = service.find(criteriaTabletPC);// find(Object...obj)

			PrintApplianceInfo.print(appliance);
			
			System.out.println();
			
			Criteria criteriaTabletPC2 = new Criteria("TabletPC2");
			appliance = service.find(criteriaTabletPC2);// find(Object...obj)

			PrintApplianceInfo.print(appliance);
			

		} catch (FileNotFoundException e) {

			// e.printStackTrace();
			System.out.println("файл не найден");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

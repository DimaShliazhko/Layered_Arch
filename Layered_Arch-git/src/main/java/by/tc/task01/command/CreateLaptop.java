package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.ApplianceCreator;

public class CreateLaptop implements Command {

	Create create;

	public CreateLaptop(Create create) {
		super();
		this.create = create;
	}

	@Override
	public Appliance  execute(Map<String, String> params) {
		return create.createApplianceLaptop(params);

	}

	

}

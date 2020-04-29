package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.ApplianceCreator;

public class CreateOven implements Command {
	Create create;

	public CreateOven(Create create) {

		this.create = create;
	}

	@Override
	public Appliance execute(Map<String, String> params) {
		return create.createApplianceOven(params);

	}

}

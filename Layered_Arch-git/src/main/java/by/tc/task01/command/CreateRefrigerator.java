package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.ApplianceCreator;

public class CreateRefrigerator implements Command {

	Create crete;

	public CreateRefrigerator(Create crete) {
		super();
		this.crete = crete;
	}

	@Override
	public Appliance execute(Map<String, String> params) {
	return crete.createApplianceRefrigerator(params);

	}

}

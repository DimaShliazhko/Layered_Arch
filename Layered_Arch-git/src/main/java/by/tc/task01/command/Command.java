package by.tc.task01.command;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public interface Command {

	Appliance execute(Map<String, String> params);

}

package by.tc.task01.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws FileNotFoundException, IOException;
	
}
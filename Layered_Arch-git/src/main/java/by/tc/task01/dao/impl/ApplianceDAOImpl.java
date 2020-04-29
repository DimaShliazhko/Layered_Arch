package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.ApplianceCreator;
import by.tc.task01.entity.criteria.ApplianceReader;
import by.tc.task01.entity.criteria.Criteria;
//import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public Appliance find(Criteria criteria) throws FileNotFoundException, IOException {
		Appliance appliance; 
		List<String> applianceData ;
		ApplianceReader reader = new ApplianceReader(criteria);
		applianceData = reader.find();
		if(applianceData.size() == 0) {
			return null;
		}
		ApplianceCreator create = new ApplianceCreator();
		appliance = create.create(applianceData);
		//System.out.println(appliance.toString());
		return appliance;
		// you may add your own code here

	}

// you may add your own code here

}

//you may add your own new classes
package by.tc.task01.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public Appliance find(Criteria criteria) throws FileNotFoundException, IOException {

		Appliance appliance = new Appliance() ;
		if (!Validator.criteriaValidator(criteria)) {
			System.out.println("запрос на поиск не коректен");
			return null;

		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		appliance = applianceDAO.find(criteria);

		// you may add your own code here

		return appliance;
	}

}

//you may add your own new classes

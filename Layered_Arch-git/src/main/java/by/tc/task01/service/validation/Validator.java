package by.tc.task01.service.validation;

import java.util.Map;
import java.util.Set;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		String criteriaName = criteria.getGroupSearchName();
		Set<String> keymap = criteria.getCriteria().keySet();

		if (criteria.getGroupSearchName().equalsIgnoreCase("Oven")) {
			return true;

		} else if (criteria.getGroupSearchName().equalsIgnoreCase("laptop")) {
			return true;

		} else if (criteria.getGroupSearchName().equalsIgnoreCase("Refrigerator")) {
			return true;

		} else if (criteria.getGroupSearchName().equalsIgnoreCase("VacuumCleaner")) {
			return true;

		} else if (criteria.getGroupSearchName().equalsIgnoreCase("TabletPC")) {
			return true;

		} else if (criteria.getGroupSearchName().equalsIgnoreCase("Speakers")) {
			return true;

		}

		return false;

	}

}

//you may add your own new classes
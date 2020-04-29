package by.tc.task01.entity.criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.entity.Appliance;

public class ApplianceReader {
	Criteria criteria;

	public ApplianceReader(Criteria criteria) {
		this.criteria = criteria;
	}

	public List<String> find() throws FileNotFoundException, IOException {

		FileReader fr = new FileReader("appliances_db.txt");
		BufferedReader reader = new BufferedReader(fr);

		// System.out.println("файл открыт");
		String lines;// для записи найденных строк
		List<String> line = new ArrayList<String>();

		while ((lines = reader.readLine()) != null) {
			if (criteriaMatcher(lines)) {
				line.add(lines);
				System.out.println(lines);
			}

		}

		return line;
	}

	boolean criteriaMatcher(String lines) {
		int size = 0;
		for (String key : criteria.getCriteria().keySet()) {

			criteria.getCriteria().size();
			if (lines.contains(criteria.getGroupSearchName())
					&& lines.contains(key + "=" + criteria.getCriteria().get(key).toString()))

			{
				size++;
				// System.out.println(lines);
				if (size == criteria.getCriteria().size()) {
					return true;
				}

			}

		}

		return false;

	}

}

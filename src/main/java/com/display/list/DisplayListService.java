package com.display.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DisplayListService {

	private DisplayListModel getDisplayProject() {
		List<String> list = new ArrayList<>();
		list.add("1) Spring MVC application");
		list.add("2) SMC application");
		list.add("3) Efiling application");
		list.add("4) Pay By web");
		DisplayListModel model = new DisplayListModel("We have following applications running currently.", list);
		return model;
	}
	
	private DisplayListModel getDisplayTodos() {
		List<String> list = new ArrayList<>();
		list.add("1) Create a controller");
		list.add("2) Create service and model");
		list.add("3) Represent to a view");
		list.add("4) Run your application");
		DisplayListModel model = new DisplayListModel("Follow these steps to write an application.", list);
		return model;
	}
	
	private DisplayListModel getDisplayParty() {
		List<String> list = new ArrayList<>();
		list.add("1) Attorneys");
		list.add("2) Clerks");
		list.add("3) Judges");
		list.add("4) Public Users");
		DisplayListModel model = new DisplayListModel("Major parties who access our applications are:", list);
		return model;
	}
	
	public Map<String, String> getDisplayMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("", "--SELECT--");
		map.put("one", "ASSOC CAPE GIRARDEAU (JACKSON)");
		map.put("two", "ASSOCIATE DIV BOLLINGER");
		map.put("three", "DO NOT USE");
		map.put("four", "ASSOCIATE DIV PERRY");
		map.put("five", "DO NOT USE");
		map.put("six", "DO NOT USE");
		map.put("seven", "JUVENILE OFFICE CAPE GIRARDEAU");
		map.put("eight", "DO NOT USE");
		map.put("nine", "PERRY");
		map.put("ten", "DO NOT USE");
		map.put("eleven", "CAPE GIRARDEAU (CAPE GIRARD)");
		return map;
	}
	
	public DisplayListModel getDisplayList(String value) {
		if(value.equals("DO NOT USE")) {
			return getDisplayProject();
		} else if (value.equals("DO NOT USE")) {
			return getDisplayTodos();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("ASSOC CAPE GIRARDEAU (JACKSON)")) {
			return getDisplayParty();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("ASSOCIATE DIV BOLLINGER")) {
			return getDisplayParty();
		} else if(value.equals("ASSOCIATE DIV PERRY")) {
			return getDisplayParty();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("CAPE GIRARDEAU (CAPE GIRARD)")) {
			return getDisplayParty();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("JUVENILE OFFICE CAPE GIRARDEAU")) {
			return getDisplayParty();
		} else if(value.equals("JUVENILE OFFICE PERRY")) {
			return getDisplayParty();
		} else if(value.equals("DO NOT USE")) {
			return getDisplayParty();
		} else if(value.equals("PERRY")) {
			return getDisplayParty();
		}
		return null;
	}

}

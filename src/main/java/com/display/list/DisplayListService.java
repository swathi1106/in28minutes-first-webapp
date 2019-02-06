package com.display.list;

import java.util.ArrayList;
import java.util.List;

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
	
	public DisplayListModel getDisplayList(String value) {
		if(value.equals("project")) {
			return getDisplayProject();
		} else if (value.equals("todos")) {
			return getDisplayTodos();
		} else if(value.equals("party")) {
			return getDisplayParty();
		}
		return null;
	}

}

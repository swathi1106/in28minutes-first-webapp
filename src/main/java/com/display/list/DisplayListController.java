package com.display.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisplayListController {

	@Autowired
	DisplayListService service;
	@RequestMapping(value="/display", method = RequestMethod.GET)
	public String showDisplayPage() {
		return "display";
	}
	
	@RequestMapping(value="/displayList", method = RequestMethod.POST)
	public String submitList(@RequestParam String listInfo, ModelMap model) {
		System.out.println("value is: " +listInfo);
		model.put("listDetail", service.getDisplayList(listInfo));
		model.put("listInfo", listInfo);
		return "displaylist";
	}
	
	

}

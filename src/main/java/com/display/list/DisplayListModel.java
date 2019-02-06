package com.display.list;

import java.util.List;

public class DisplayListModel {
	
	private String statement;
	private List<String> list;
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public DisplayListModel(String statement, List<String> list) {
		super();
		this.statement = statement;
		this.list = list;
	}

}

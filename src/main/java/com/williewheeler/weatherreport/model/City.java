package com.williewheeler.weatherreport.model;

public class City {
	private long id;
	private String name;

	public City(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

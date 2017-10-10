package com.williewheeler.weatherreport.domain.template.binding;

public class Sys {
	private String country;

	/** Sunrise time, Unix, UTC */
	private Long sunrise;

	/** Sunset time, Unix, UTC */
	private Long sunset;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getSunrise() {
		return sunrise;
	}

	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	public Long getSunset() {
		return sunset;
	}

	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}
}

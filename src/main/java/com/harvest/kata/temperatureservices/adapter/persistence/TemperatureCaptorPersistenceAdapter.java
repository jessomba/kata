package com.harvest.kata.temperatureservices.adapter.persistence;


import com.harvest.kata.temperatureservices.application.port.out.TemperatureCaptorPort;
import com.harvest.kata.temperatureservices.common.PersistenceAdapter;

@PersistenceAdapter
public class TemperatureCaptorPersistenceAdapter implements TemperatureCaptorPort{

	@Override
	public int retrieveTemperature() {
		return (int) ((Math.random() * 101));
	}

}

package com.harvest.kata.temperatureservices.application.service;

import com.harvest.kata.temperatureservices.application.port.in.TemperatureCaptorUseCase;
import com.harvest.kata.temperatureservices.common.UseCase;

import lombok.AllArgsConstructor;

import com.harvest.kata.temperatureservices.application.port.out.TemperatureCaptorPort;

@UseCase
@AllArgsConstructor
public class TemperatureCaptor implements TemperatureCaptorUseCase {

	private final TemperatureCaptorPort temperatureCaptorPort;

	@Override
	public int temperature() {
		return temperatureCaptorPort.retrieveTemperature();
	}

}

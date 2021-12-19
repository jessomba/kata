package com.harvest.kata.temperatureservices.application.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

import com.harvest.kata.temperatureservices.application.port.in.TemperatureCaptorUseCase;
import com.harvest.kata.temperatureservices.application.port.out.TemperatureCaptorPort;

public class TemperatureCaptorTest {

	private final TemperatureCaptorUseCase temperatureCaptorUseCase =
			Mockito.mock(TemperatureCaptorUseCase.class);

	private final TemperatureCaptorPort temperatureCaptorPort =
			Mockito.mock(TemperatureCaptorPort.class);
	
	private final TemperatureCaptor temperatureCaptor =
			new TemperatureCaptor(temperatureCaptorPort);
	@Test
	public void retriveTemperature() {
		// Arrange
		Mockito.when(temperatureCaptorPort.retrieveTemperature()).thenReturn(10);
		Mockito.when(temperatureCaptorUseCase.temperature()).thenReturn(10);

		// Act
		int expected = temperatureCaptor.temperature();

		// Assert
		assertThat(expected).isEqualTo(10);
	}
}

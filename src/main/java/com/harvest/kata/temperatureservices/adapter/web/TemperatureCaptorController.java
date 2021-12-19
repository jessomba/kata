package com.harvest.kata.temperatureservices.adapter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harvest.kata.temperatureservices.application.port.in.TemperatureCaptorUseCase;
import com.harvest.kata.temperatureservices.common.WebAdapter;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class TemperatureCaptorController {

	private final TemperatureCaptorUseCase temperatureCaptorUseCase;
	
	@GetMapping("/v1/temperature")
	int temperature() {
		return temperatureCaptorUseCase.temperature();
	}

}

package com.harvest.kata.temperatureservices.adapter.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.harvest.kata.temperatureservices.application.port.in.TemperatureCaptorUseCase;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = TemperatureCaptorController.class)
public class TemperatureCaptorControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TemperatureCaptorUseCase temperatureCaptorUseCase;

	@Test
	public void retrieveTemperature() throws Exception {

		Mockito.when(temperatureCaptorUseCase.temperature()).thenReturn(10);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/v1/temperature")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = 10 + "";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}

}

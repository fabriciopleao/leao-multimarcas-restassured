package leaocentermultimarcas.restassured.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import leaocentermultimarcas.restassured.objects.VehiclesApi;

public class CreateTest {

	@Test
	public void testCreateVehicle() {
		Response response = VehiclesApi.createVehicle("Kia", "Sportage", "Branco", 2014, 2013, "gasolina", "7", 61647);
		assertEquals(response.getStatusCode(), 400);
		System.out.println(response.asPrettyString());
	}
	
	
}

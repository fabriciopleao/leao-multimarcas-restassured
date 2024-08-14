package leaocentermultimarcas.restassured.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import leaocentermultimarcas.restassured.objects.VehiclesApi;

public class ReadTest {

	@Test
	public void testGetVehicles() {
		Response response = VehiclesApi.getVehicles();
		assertEquals(response.getStatusCode(), 200);
		System.out.println(response.asPrettyString());
	}
	
	@Test
	public void testGetVehicle() {
		Response response = VehiclesApi.getVehicle(19);
		assertEquals(response.getStatusCode(), 200);
		String marca = response.jsonPath().getString("marca");
		assertEquals(marca, "Porche");
		System.out.println(response.asPrettyString());
	}
	
}

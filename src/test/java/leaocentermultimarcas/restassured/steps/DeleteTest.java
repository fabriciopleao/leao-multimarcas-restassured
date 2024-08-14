package leaocentermultimarcas.restassured.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import leaocentermultimarcas.restassured.objects.VehiclesApi;

public class DeleteTest {

	@Test
	public void deleteTest() {
		Response response = VehiclesApi.deleteVehicle(23);
		assertEquals(204, response.getStatusCode());
	}
	
}

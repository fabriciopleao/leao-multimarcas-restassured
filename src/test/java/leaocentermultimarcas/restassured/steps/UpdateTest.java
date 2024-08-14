package leaocentermultimarcas.restassured.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import leaocentermultimarcas.restassured.objects.VehiclesApi;

public class UpdateTest {

	@Test
	public void updateTest() {
		Response response = VehiclesApi.updateVehicle(22, "Kia", "Cerato", "Preto", 2014, 2013, "gasolina", "7", 61647);
		assertEquals(response.getStatusCode(), 200);
		System.out.println(response.asPrettyString());
	}
	
}

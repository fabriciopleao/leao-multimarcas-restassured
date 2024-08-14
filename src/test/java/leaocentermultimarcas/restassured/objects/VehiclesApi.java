package leaocentermultimarcas.restassured.objects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class VehiclesApi {

	private static final String BASE_URL = "http://localhost:8087/api/leao-center";

	public static Response getVehicles() {
		return RestAssured.given().baseUri(BASE_URL).basePath("/catalogo").when().get();
	}
	
	public static Response getVehicle(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("/catalogo/" + id).when().get();
	}
	
	public static Response createVehicle(String marca, String nome, String cor, int anoModelo, int anoFabricacao, String combustivel, String finalPlaca, int valor) {
		return RestAssured.given().baseUri(BASE_URL).contentType("application/json").body("{\n" +
                "  \"marca\": \"" + marca + "\",\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"cor\": \"" + cor + "\",\n" +
                "  \"anoModelo\": " + anoModelo + ",\n" +
                "  \"anoFabricacao\": " + anoFabricacao + ",\n" +
                "  \"combustivel\": \"" + combustivel + "\",\n" +
                "  \"finalPlaca\": \"" + finalPlaca + "\",\n" +
                "  \"valor\": " + valor + "\n" +
                "}").when().post();
	}
	
	public static Response updateVehicle(int id, String marca, String nome, String cor, int anoModelo, int anoFabricacao, String combustivel, String finalPlaca, int valor) {
		return RestAssured.given().baseUri(BASE_URL).basePath("/"+id).contentType("application/json").body("{\n" +
                "  \"marca\": \"" + marca + "\",\n" +
                "  \"nome\": \"" + nome + "\",\n" +
                "  \"cor\": \"" + cor + "\",\n" +
                "  \"anoModelo\": " + anoModelo + ",\n" +
                "  \"anoFabricacao\": " + anoFabricacao + ",\n" +
                "  \"combustivel\": \"" + combustivel + "\",\n" +
                "  \"finalPlaca\": \"" + finalPlaca + "\",\n" +
                "  \"valor\": " + valor + "\n" +
                "}").when().put();
	}
	
	public static Response deleteVehicle(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("/"+id).when().delete();
	}
}

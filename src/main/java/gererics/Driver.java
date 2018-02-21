package gererics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.apache.commons.io.IOUtils;

public class Driver {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Container<Integer> obj = new Container<Integer>();
		obj.value = 9;
		obj.show();

		Container<String> objString = new Container<String>();
		objString.value = "hello";
		objString.show();

		String fish = "{\r\n" + "	\"fins\": 2,\r\n" + "	\"eyes\": 2,\r\n" + "	\"color\": \"blue\",\r\n"
				+ "	\"type\": \"Fish\"\r\n" + "}";

		ObjectMapper mapper = new ObjectMapper();
		Animal animal = readAnimal(mapper.readValue(fish, Fish.class));
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(animal);
		System.out.println(json);
	}

	public static Animal readAnimal(Fish fish) throws IOException {
		fish.move();
		System.out.println(fish.toString() + " fins = " + fish.getFins());

		return fish;
	}

}

class Container<T> {
	T value;

	public void show() {
		System.out.println(value.getClass().getName());
	}
}

package burgers;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
	private String id;
	private String name;
	private String type;
	
	public static enum Type {
		AMERICAN, CLASSIC, CHEESE, CHICKEN, VEGGIES
	}
}

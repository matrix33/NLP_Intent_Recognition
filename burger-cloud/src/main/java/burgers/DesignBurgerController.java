package burgers;

import java.awt.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/design")
public class DesignBurgerController {

	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(new Ingredient(""))
		return null;
	}
}

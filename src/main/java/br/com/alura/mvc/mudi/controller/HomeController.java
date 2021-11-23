package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Plan B Team Foil Gustavo");
		pedido.setUrlImagem("https://planbskateboards.com/wp-content/uploads/2021/03/plan-b-team-foil-gustavo-7-75-deck.jpg");
		pedido.setUrlProduto("https://planbskateboards.com/product/skateboard/plan-b-team-foil-gustavo-deck/");
		pedido.setDescricao("ADDITIONAL INFORMATION\r\n" + 
				"Weight	1.2 kg\r\n" + 
				"Sizes	\r\n" + 
				"7.75\", 8.0\"\r\n" + 
				"\r\n" + 
				"Serie	\r\n" + 
				"Team Foil\r\n" + 
				"\r\n" + 
				"PRO	\r\n" + 
				"Felipe Gustavo");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}

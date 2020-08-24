package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Usuario;
import service.ILoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private ILoginService iLoginService;
	@Autowired
	public LoginController(ILoginService iLoginService) {
		this.iLoginService = iLoginService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setup(@ModelAttribute("usuario") Usuario usuario, Model model) {
		model.addAttribute("message","");
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String login(@ModelAttribute("usuario") Usuario usuario, Model model) {
		if(iLoginService.authUsuario(usuario)) {
			return "welcome";
		}else {
			model.addAttribute("message","<div class=\"alert alert-danger\">\r\n" + 
					"  <strong>Error!</strong> Usuario y/o contraseña inválidos.\r\n" + 
					"</div>");
			return "login";
		}
	}

}

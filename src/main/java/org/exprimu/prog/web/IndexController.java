package org.exprimu.prog.web;

import org.exprimu.prog.entity.Document;
import org.exprimu.prog.entity.Publication;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping(value = "/Index")
public class IndexController {
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping(value = "/Profil/Home")
	public String Home() {
		return "monprofil";
	}

	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping(value = "/Forum")
	public String form(Model model) {
		return "forum";
	}

	@RequestMapping(value = "/CarteBK/Page")
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String carte() {
		return "Carte";
	}

	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping(value = "/Index/Message")
	public String message() {
		return "message";
	}

	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping(value = "/Index/Messagerie")
	public String messagerie() {
		return "messagerie";
	}

	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping(value = "/Index/Quisommenous")
	public String QuiSommeNous() {
		return "quisommesnous";
	}

	@Secured(value = {"ROLE_ADMIN", "ROLE_USER"})
	@RequestMapping(value = "/Index/Accueil")
	public String AppLogin() {
		return "accueil";
	}

	@Secured(value = { "ROLE_USER", "ROLE_ADMIN" })
	@RequestMapping(value = "/Index/utilisateurt")
	public String utilisateurt(Model model) {
		return "utilisateurt";
	}

	@Secured(value = { "ROLE_USER", "ROLE_ADMIN"})
	@RequestMapping(value = "/Index/utilisateurTempon")
	public String formut(Model model) {
		return "utilisateurt";
	}
	
	@Secured(value = { "ROLE_USER", "ROLE_ADMIN"})
	@RequestMapping(value = "/Index/Publication")
	public String publication(Model model) {
		return "ajoutpublication";
	}
	
	@Secured(value = { "ROLE_USER", "ROLE_ADMIN"})
	@RequestMapping(value = "/Index/Actualite")
	public String actualite(Model model) {
		return "actualites";
	}
}

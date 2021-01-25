package com.alfalahsoftech.controller;

import java.util.Locale;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alfalahsoftech.base.AFBaseObject;

@Controller
public class LoginLogoutController extends AFBaseObject {



	@RequestMapping(value="/login")
	@PostMapping
	public String login(@RequestParam String username, @RequestParam String password) {
		afDebug(String.format("Username: %s\n Password %s", username,password));
		ReloadableResourceBundleMessageSource  R_RBMS = new ReloadableResourceBundleMessageSource();
		R_RBMS.setBasename("glbApp");
		R_RBMS.clearCache();
		R_RBMS.setCacheSeconds(5);
		String user = R_RBMS.getMessage("user", null, Locale.getDefault());
		String url = R_RBMS.getMessage("url", null, Locale.getDefault());
		afDebug(String.format("User: %s  \n url %s: ", user,url));
		return "Welcome";

	}
	@RequestMapping(value="/Welcome")
	@ResponseBody
	public String welcome_To_Alfalah_Softech() {
		return "welcome_To_Alfalah_Softech";
	}

}

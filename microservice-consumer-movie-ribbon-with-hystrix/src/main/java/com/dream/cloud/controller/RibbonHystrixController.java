package com.dream.cloud.controller;

import com.dream.cloud.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonHystrixController {

	@Autowired
	private RibbonHystrixService ribbonHystrixService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return this.ribbonHystrixService.hiService(name);
	}
}

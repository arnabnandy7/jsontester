package com.arnab.json.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.json.model.Pokemon;
import com.arnab.json.model.DexList;
import com.arnab.json.service.RestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/pokemon")
public class TestController {
	private final static Logger log = Logger.getLogger(TestController.class.getName());

	@Autowired
	private RestService restService;

	@GetMapping(value = "/dex", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Pokemon>> getDex() {
		List<Pokemon> dex = new ArrayList<Pokemon>();
		ResponseEntity<List<Pokemon>> responseEntity = null;

		String response = restService.getPostsPlainJSON();

		ObjectMapper mapper = new ObjectMapper();
		try {
			DexList list = mapper.readValue(response, new TypeReference<DexList>() {
			});
			dex = list.getPokemon();
			MultiValueMap<String, String> headers = new HttpHeaders();
			headers.put("Cache-Control", Arrays.asList("max-age=3600"));
			log.info("Success pojo population");
			responseEntity = new ResponseEntity<>(dex, headers, HttpStatus.OK);
		} catch (JsonProcessingException e) {
			responseEntity = new ResponseEntity<>(HttpStatus.SEE_OTHER);
			log.log(Level.SEVERE, e.getMessage());
		}

		return responseEntity;
	}

	@GetMapping(value = "/dexList", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<List<Pokemon>> getDexList() {
		List<Pokemon> dex = new ArrayList<Pokemon>();
		ResponseEntity<List<Pokemon>> responseEntity = null;
		
		dex=restService.getPostWithCustomHeaders().getPokemon();
		
		responseEntity = new ResponseEntity<>(dex, HttpStatus.OK);

		return responseEntity;
	}
}

package br.com.contmatic.application.controller;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.contmatic.domain.model.phone.PhoneRepository;
import br.com.contmatic.domain.model.phone.favorite.FavoritePhoneRepository;

@Resource
public class FavoritePhoneController {

	private final Result result;
	private final PhoneRepository phoneRepository;
	private final FavoritePhoneRepository favoritePhoneRepository;

	public FavoritePhoneController(Result result, PhoneRepository phoneRepository, FavoritePhoneRepository favoritePhoneRepository){
		this.result = result;
		this.phoneRepository = phoneRepository;
		this.favoritePhoneRepository = favoritePhoneRepository;
	}

	@Get("/favorite")
	public void load() {
		
	}

	@Post("/favorite")
	@Consumes("application/json")
	public void add(Long phoneId) {	
		
	}

	@Delete("/favorite/{phoneId}")
	public void remove(Long phoneId) {
		
	}
}

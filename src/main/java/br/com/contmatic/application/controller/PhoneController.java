package br.com.contmatic.application.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.contmatic.domain.model.phone.PhoneRepository;
import br.com.contmatic.domain.model.phone.favorite.FavoritePhoneRepository;

@Resource
public class PhoneController {
	private final Result result;
	private final PhoneRepository phoneRepository;
	private final FavoritePhoneRepository favoritePhoneRepository;

	public PhoneController(Result result, PhoneRepository phoneRepository, FavoritePhoneRepository favoriteRepository){
		this.result = result;
		this.phoneRepository = phoneRepository;
		this.favoritePhoneRepository = favoriteRepository;
	}

	@Get("/phone/list")
	public void load() {
		
	}

	@Get("/compare/{phoneId}/compareTo/{phoneId2}")
	public void compare(Long phoneId, Long phoneId2) {
		
	}
}

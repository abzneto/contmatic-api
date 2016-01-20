package br.com.contmatic.domain.model.phone.favorite;

import java.util.List;

import br.com.contmatic.domain.model.phone.Phone;

public interface FavoritePhoneRepository {
	List<FavoritePhone> list();

	void add(Phone phone);
	
	void remove(Long id);
}


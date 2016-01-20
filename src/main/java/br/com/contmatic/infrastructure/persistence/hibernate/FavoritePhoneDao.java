package br.com.contmatic.infrastructure.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.contmatic.domain.model.phone.Phone;
import br.com.contmatic.domain.model.phone.favorite.FavoritePhone;
import br.com.contmatic.domain.model.phone.favorite.FavoritePhoneRepository;

@Component
@RequestScoped
public class FavoritePhoneDao implements FavoritePhoneRepository {

	private final Session session;

	public FavoritePhoneDao(Session session) {
		this.session = session;
	}

	public List<FavoritePhone> load() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}
}

package br.com.contmatic.infrastructure.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.contmatic.domain.model.phone.Phone;
import br.com.contmatic.domain.model.phone.PhoneRepository;

@Component
@RequestScoped
public class PhoneDao implements PhoneRepository {

	private final Session session;

	public PhoneDao(Session session) {
		this.session = session;
	}

	public List<Phone> load() {
		// TODO Auto-generated method stub
		return null;
	}
}

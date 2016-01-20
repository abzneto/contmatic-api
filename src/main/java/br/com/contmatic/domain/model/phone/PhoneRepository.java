package br.com.contmatic.domain.model.phone;

import java.util.List;

public interface PhoneRepository {
	Phone loadById(Long id);
	
	List<Phone> load();
}

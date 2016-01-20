package br.com.contmatic.domain.model.requirement;

import java.util.List;

import br.com.contmatic.domain.model.phone.Phone;

public interface RequirementRepository {
	
	List<Requirement> listByPhone(Phone phone);
	
}

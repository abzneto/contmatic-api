package br.com.contmatic.domain.services.phone;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.contmatic.application.representation.PhoneCompareInformation;
import br.com.contmatic.domain.model.phone.Phone;

@Component
@RequestScoped
public class PhoneComparator {
	
	public PhoneCompareInformation compare(Phone phone1, Phone phone2) {	
		return null;
	}
}

package br.com.contmatic.domain.model.user;


public interface UserRepository {	
	void add(User user);

	User loadById(Long id);
}

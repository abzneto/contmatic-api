package br.com.contmatic.domain.model.phone.favorite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.com.contmatic.domain.model.phone.Phone;
import br.com.contmatic.domain.model.user.User;

@Entity
@SequenceGenerator(name = "seq_favoritePhone", sequenceName = "seq_favoritePhone")
public class FavoritePhone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_favoritePhone")
	private Long id;
	private Date creationDate;
	@ManyToOne
	@JoinColumn(name = "phoneId")
	private Phone phone;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public FavoritePhone() {
		creationDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoritePhone other = (FavoritePhone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

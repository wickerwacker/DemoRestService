package bookmarks;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<>();

	@Id
	@GeneratedValue
	private Long id;

	Account() {
	}

	public Set<Bookmark> getBookmarks() {
		return bookmarks;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	@JsonIgnore
	public String password;
	public String username;

	public Account(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}

}

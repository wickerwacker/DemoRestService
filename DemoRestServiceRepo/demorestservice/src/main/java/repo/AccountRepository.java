package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import bookmarks.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByUsername(String username);
}

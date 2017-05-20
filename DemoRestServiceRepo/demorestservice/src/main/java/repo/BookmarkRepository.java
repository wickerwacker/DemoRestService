package repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import bookmarks.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);
}

package ex;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookmarks.Account;
import bookmarks.Bookmark;
import repo.AccountRepository;
import repo.BookmarkRepository;

@SpringBootApplication
public class DemorestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemorestserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository, 
			BookmarkRepository bookmarkRepository) {
		return (eventArgs) -> Arrays.asList(
				"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(
						a -> { 
								Account account = accountRepository.save(new Account(a, "psswd"));
								bookmarkRepository.save(new Bookmark(account, 
										"http://bookmark.com/1/" + a, "A description"));
								bookmarkRepository.save(new Bookmark(account, 
										"http://bookmark.com/1/" + a, "A description"));
						});
	}
}

package com.pradipta.bookmarkerapi;

import com.pradipta.bookmarkerapi.domain.Bookmark;
import com.pradipta.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.time.Instant;

/**
 * Unused as of now as Flyway migration is used to populate the data
 */

//@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "Google", "https://www.google.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Yahoo", "https://www.yahoo.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Apple", "https://www.apple.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Facebook", "https://www.facebook.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Linkedin", "https://www.linkedin.com", Instant.now()));
    }
}

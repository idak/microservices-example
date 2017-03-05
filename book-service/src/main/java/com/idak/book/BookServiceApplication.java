package com.idak.book;

import com.idak.book.entity.Author;
import com.idak.book.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * Created by akadi on 05/03/2017.
 *
 */
@SpringBootApplication
public class BookServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }
}

@Configuration
class RepositoryConfig extends RepositoryRestMvcConfiguration {
    @Override
    public RepositoryRestConfiguration config() {
        return super.config().exposeIdsFor(Book.class, Author.class);
    }

}
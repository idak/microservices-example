package com.idak.book.repository;

import com.idak.book.entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by akadi on 05/03/2017.
 *
 */
@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long>{
}

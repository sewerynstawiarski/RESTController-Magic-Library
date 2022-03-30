package com.ExampleRESTController.MagicLibrary.Repository;

import com.ExampleRESTController.MagicLibrary.Entity.BookIsAvailable;
import org.springframework.data.repository.CrudRepository;

public interface BookIsAvailableRepo extends CrudRepository<BookIsAvailable, Integer> {
}

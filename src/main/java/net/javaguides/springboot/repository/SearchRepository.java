package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface SearchRepository extends JpaRepository<Search, Long> {
    @Query("SELECT p FROM Search p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Search> searchlist(String query);
}

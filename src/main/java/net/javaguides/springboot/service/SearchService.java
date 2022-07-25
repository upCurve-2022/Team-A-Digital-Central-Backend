package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Search;

import java.util.List;

public interface SearchService {
    List<Search> searchlist(String query);

    Search createlist(Search search);
}

package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Search;
import net.javaguides.springboot.repository.SearchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchServiceImpl implements SearchService {

    private SearchRepository searchRepository;

    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public List<Search> searchlist(String query) {
        List<Search> search = searchRepository.searchlist(query);
        return search;
    }

    @Override
    public Search createlist(Search search) {
        return searchRepository.save(search);
    }
}
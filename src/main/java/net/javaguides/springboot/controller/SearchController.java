package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.entity.Search;
import net.javaguides.springboot.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products/src")
@CrossOrigin("http://localhost:3000")

public class SearchController {
    private SearchService searchService;
    public SearchController(SearchService searchService){this.searchService = searchService;}
    @GetMapping("/search")
    public ResponseEntity<List<Search>> searchlist(@RequestParam("query") String query)
    {
        return ResponseEntity.ok(searchService.searchlist(query));
    }
    @PostMapping
    public Search createlist(@RequestBody Search search)
    {
        return searchService.createlist(search);
    }
}

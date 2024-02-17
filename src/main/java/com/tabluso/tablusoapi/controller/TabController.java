package com.tabluso.tablusoapi.controller;

import com.tabluso.tablusoapi.entity.Tab;
import com.tabluso.tablusoapi.service.tab.TabService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tabs")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@AllArgsConstructor
public class TabController {

    private TabService tabService;

    @GetMapping
    public List<Tab> searchTabs(@RequestParam String searchText) {
        return tabService.findTabsByArtistOrSongContainingText(searchText);
    }
}

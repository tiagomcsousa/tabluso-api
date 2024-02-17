package com.tabluso.tablusoapi.service.tab;

import com.tabluso.tablusoapi.entity.Tab;
import com.tabluso.tablusoapi.repository.TabRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TabServiceImpl implements TabService {

    private TabRepository tabRepository;

    @Override
    public List<Tab> findTabsByArtistOrSongContainingText(String text) {
        return tabRepository.findByArtistNameContainingOrSongNameContaining(text, text);
    }
}

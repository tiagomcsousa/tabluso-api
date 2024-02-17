package com.tabluso.tablusoapi.service.tab;

import com.tabluso.tablusoapi.entity.Tab;

import java.util.List;

public interface TabService {

    List<Tab> findTabsByArtistOrSongContainingText(String text);

}

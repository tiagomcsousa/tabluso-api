package com.tabluso.tablusoapi.bootstrap;

import com.tabluso.tablusoapi.entity.Artist;
import com.tabluso.tablusoapi.entity.Song;
import com.tabluso.tablusoapi.entity.Tab;

import com.tabluso.tablusoapi.repository.TabRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TabsLoader implements CommandLineRunner {

    private final TabRepository tabRepository;

    @Override
    public void run(String... args) {
        if(tabRepository.findAll().isEmpty()){
            Artist artist = Artist.builder().name("Linda Martini").build();
            Song song = Song.builder().name("Febril").build();
            Tab tab = Tab.builder().artist(artist).song(song).build();
            tabRepository.save(tab);
        }
    }

}

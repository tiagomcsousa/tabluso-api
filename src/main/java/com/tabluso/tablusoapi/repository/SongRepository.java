package com.tabluso.tablusoapi.repository;

import com.tabluso.tablusoapi.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}

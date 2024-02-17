package com.tabluso.tablusoapi.repository;

import com.tabluso.tablusoapi.entity.Tab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TabRepository extends JpaRepository<Tab, Long> {

    List<Tab> findByArtistNameContainingOrSongNameContaining(String artistName, String songName);
}

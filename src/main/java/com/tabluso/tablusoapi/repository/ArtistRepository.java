package com.tabluso.tablusoapi.repository;

import com.tabluso.tablusoapi.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}

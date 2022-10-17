package net.gaelgg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gaelgg.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}

package net.gaelgg.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gaelgg.api.entity.Album;
import net.gaelgg.api.repository.AlbumsRepository;
import net.gaelgg.api.service.IAlbumService;

@Service
public class AlbumService implements IAlbumService {
    @Autowired
	private AlbumsRepository repoAlbums;
	
	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}

}

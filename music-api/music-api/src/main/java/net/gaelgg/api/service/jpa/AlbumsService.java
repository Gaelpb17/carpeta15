package net.gaelgg.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.gaelgg.api.entity.Album;
import net.gaelgg.api.repository.AlbumsRepository;
import net.gaelgg.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
    @Autowired
	private AlbumsRepository repoAlbums;
	
	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}


	public void guardar(Album album) {
		repoAlbums.save(album);
	}

	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}

}

package net.gaelgg.api.service;

import java.util.List;

import net.gaelgg.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}

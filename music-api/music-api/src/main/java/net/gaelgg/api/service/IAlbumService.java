package net.gaelgg.api.service;

import java.util.List;

import net.gaelgg.api.entity.Album;

public interface IAlbumService {

	List<Album> buscarTodos();
}
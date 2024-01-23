package io.github.kauanmeira.imageliteapi.domain.service;

import io.github.kauanmeira.imageliteapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save(Image image);
    Optional<Image> findById(String id);
}

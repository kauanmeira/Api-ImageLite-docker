package io.github.kauanmeira.imageliteapi.domain.service;

import io.github.kauanmeira.imageliteapi.domain.entity.Image;
import io.github.kauanmeira.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image save(Image image);
    Optional<Image> findById(String id);
    List<Image> search(ImageExtension extension, String query);
}

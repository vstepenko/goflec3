package ua.edu.duan.gof;

import java.util.HashMap;
import java.util.Map;

public class PhotoStorageProxy implements PhotoStorage {

    private final PhotoStorage realPhotoStorage;

    public PhotoStorageProxy(PhotoStorage realPhotoStorage) {
        this.realPhotoStorage = realPhotoStorage;
    }

    private final Map<String, String> cache = new HashMap<>();
    @Override
    public String loadPhoto(String path) {

        if(!cache.containsKey(path)){
            String photo = realPhotoStorage.loadPhoto(path);
            cache.put(path, photo);
            return photo;
        }

        return cache.get(path);
    }
}

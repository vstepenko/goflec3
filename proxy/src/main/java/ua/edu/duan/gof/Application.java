package ua.edu.duan.gof;

public class Application {
    public static void main(String[] args) {

        PhotoStorage photoStorage = new PhotoStorageProxy(new PhotoStorageProxy(new RealPhotoStorage()));

        System.out.println(photoStorage.loadPhoto("path1"));
        System.out.println(photoStorage.loadPhoto("path2"));
        System.out.println(photoStorage.loadPhoto("path1"));
        System.out.println(photoStorage.loadPhoto("path1"));
    }
}

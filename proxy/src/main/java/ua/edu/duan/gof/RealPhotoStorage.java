package ua.edu.duan.gof;

public class RealPhotoStorage implements PhotoStorage{
    @Override
    public String loadPhoto(String path) {
        System.out.println("Load photo from internet");
        return "Real big photo from path : " + path;
    }
}

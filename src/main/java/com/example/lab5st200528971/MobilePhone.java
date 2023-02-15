package com.example.lab5st200528971;
import  javafx.scene.image.Image;
public class MobilePhone
{
    private String path;
    private String modelName;

    public MobilePhone(String path, String mobilePhone) {
        this.setPath(path);
        this.setModelName(mobilePhone);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public  Image getImage()
    {
        return new Image(MobilePhone.class.getResourceAsStream(path));
    }
}

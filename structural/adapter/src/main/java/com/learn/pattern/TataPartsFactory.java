package com.learn.pattern;

public class TataPartsFactory {
    private String body;
    private String gear;
    private String mirror;

    public TataPartsFactory(String body, String gear, String mirror) {
        this.body = body;
        this.gear = gear;
        this.mirror = mirror;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    @Override
    public String toString() {
        return "TataPartsFactory{" +
                "body='" + body + '\'' +
                ", gear='" + gear + '\'' +
                ", mirror='" + mirror + '\'' +
                '}';
    }
}

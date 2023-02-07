package org.example;

public class Notebook {
    private String name;
    private String processor;
    private Integer ozu;
    private Integer KolvoYader;
    private String Videocard;
    private Integer Videoozu;
    private Integer ssd;
    private Integer hdd;
    private int diag;
    private String os;
    private String color;

    public Notebook() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getOzu() {
        return ozu;
    }

    public void setOzu(Integer ozu) {
        this.ozu = ozu;
    }

    public Integer getKolvoYader() {
        return KolvoYader;
    }

    public void setKolvoYader(Integer kolvoYader) {
        KolvoYader = kolvoYader;
    }

    public String getVideocard() {
        return Videocard;
    }

    public void setVideocard(String videocard) {
        Videocard = videocard;
    }

    public Integer getVideoozu() {
        return Videoozu;
    }

    public void setVideoozu(Integer videoozu) {
        Videoozu = videoozu;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public int getDiag(int i) {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return System.out.printf("Ноутбук: " +this.name + "\nПроцессор: " + this.processor + "\nОбъем ОЗУ: " + this.ozu +
                "\nSSD: "+ this.ssd + "\nВидеокарта: " + this.Videocard + "\n --- \n").toString();
    }
}

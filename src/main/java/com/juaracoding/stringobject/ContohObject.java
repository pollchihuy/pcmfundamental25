package com.juaracoding.stringobject;

public class ContohObject {

    private Long data1;
    private String data2;
    private Double data3;

    public ContohObject() {
    }

    public ContohObject(Long data1, String data2, Double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public Long getData1() {
        return data1;
    }

    public void setData1(Long data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public Double getData3() {
        return data3;
    }

    public void setData3(Double data3) {
        this.data3 = data3;
    }
}

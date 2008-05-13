package com.googlecode.jsonplugin;

import java.util.List;
import java.util.Map;

public class WrapperClassBean {

    private String stringField;
    private Integer intField;
    private Boolean booleanField;
    private Character charField;
    private Long longField;
    private Float floatField;
    private Double doubleField;
    private Object objectField;
    private Byte byteField;
    private List<SimpleValue> listField;
    private List<Map<String,Long>> listMapField;
    private Map<String,List<Long>> mapListField;
    private Map<String,Long>[] arrayMapField;

    public List<SimpleValue> getListField() {
        return listField;
    }

    public void setListField(List<SimpleValue> listField) {
        this.listField = listField;
    }

    public List<Map<String,Long>> getListMapField() {
        return listMapField;
    }

    public void setListMapField(List<Map<String,Long>> listMapField) {
        this.listMapField = listMapField;
    }

    public Map<String,List<Long>> getMapListField() {
        return mapListField;
    }

    public void setMapListField(Map<String,List<Long>> mapListField) {
        this.mapListField = mapListField;
    }

    public Map<String,Long>[] getArrayMapField() {
        return arrayMapField;
    }

    public void setArrayMapField(Map<String,Long>[] arrayMapField) {
        this.arrayMapField = arrayMapField;
    }

    public Boolean getBooleanField() {
        return booleanField;
    }

    public void setBooleanField(Boolean booleanField) {
        this.booleanField = booleanField;
    }

    public Byte getByteField() {
        return byteField;
    }

    public void setByteField(Byte byteField) {
        this.byteField = byteField;
    }

    public Character getCharField() {
        return charField;
    }

    public void setCharField(Character charField) {
        this.charField = charField;
    }

    public Double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(Double doubleField) {
        this.doubleField = doubleField;
    }

    public Float getFloatField() {
        return floatField;
    }

    public void setFloatField(Float floatField) {
        this.floatField = floatField;
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(Integer intField) {
        this.intField = intField;
    }

    public Long getLongField() {
        return longField;
    }

    public void setLongField(Long longField) {
        this.longField = longField;
    }

    public Object getObjectField() {
        return objectField;
    }

    public void setObjectField(Object objectField) {
        this.objectField = objectField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

}

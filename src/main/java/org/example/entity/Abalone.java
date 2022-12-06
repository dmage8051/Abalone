package org.example.entity;

import java.util.Formatter;
import java.util.Locale;

public class Abalone {
    private String sex;

    public Abalone(String sex, Double length, Double diameter, Double height, Double wholeWeight, Double shuckedWeight, Double visceraWeight, Double shellWeight, Integer rings) {
        this.sex = sex;
        this.length = length;
        this.diameter = diameter;
        this.height = height;
        this.wholeWeight = wholeWeight;
        this.shuckedWeight = shuckedWeight;
        this.visceraWeight = visceraWeight;
        this.shellWeight = shellWeight;
        this.rings = rings;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    private Double length;
    private Double diameter;
    private Double height;
    private Double wholeWeight; // grams	whole abalone
    private Double shuckedWeight; // grams	weight of meat
    private Double visceraWeight; // grams	gut weight (after bleeding)
    private Double shellWeight;	// grams	after being dried
    private Integer rings; // +1.5 gives the age in years

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWholeWeight() {
        return wholeWeight;
    }

    public void setWholeWeight(Double wholeWeight) {
        this.wholeWeight = wholeWeight;
    }

    public Double getShuckedWeight() {
        return shuckedWeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format(
                "%s,%.4f,%.4f,%.4f,%.4f,%.4f,%.4f,%.4f,%d",
                sex,
                length,
                diameter,
                height,
                wholeWeight,
                shuckedWeight,
                visceraWeight,
                shellWeight,
                rings
        );
        return sb.toString();
    }

    public void setShuckedWeight(Double shuckedWeight) {
        this.shuckedWeight = shuckedWeight;
    }

    public Double getVisceraWeight() {
        return visceraWeight;
    }

    public void setVisceraWeight(Double visceraWeight) {
        this.visceraWeight = visceraWeight;
    }

    public Double getShellWeight() {
        return shellWeight;
    }

    public void setShellWeight(Double shellWeight) {
        this.shellWeight = shellWeight;
    }

    public Integer getRings() {
        return rings;
    }

    public void setRings(Integer rings) {
        this.rings = rings;
    }
}

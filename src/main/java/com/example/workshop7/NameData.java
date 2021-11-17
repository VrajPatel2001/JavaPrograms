package com.example.workshop7;

public class NameData {
    private String name;
    private String rank;
    private String totalNumbers;
    private boolean found;

    public NameData(boolean found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "NameData{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", totalNumbers='" + totalNumbers + '\'' +
                ", found=" + found +
                '}';
    }

    public NameData(String name, String rank, String totalNumbers) {
        this.found = true;
        this.name = name;
        this.rank = rank;
        this.totalNumbers = totalNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTotalNumbers() {
        return totalNumbers;
    }

    public void setTotalNumbers(String totalNumbers) {
        this.totalNumbers = totalNumbers;
    }
}

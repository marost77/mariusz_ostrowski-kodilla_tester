package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String stampName;
    String stampSize;
    boolean isStamped;

    public Stamp(String stampName, String stampSize, boolean isStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isStamped = isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                stampName.equals(stamp.stampName) &&
                stampSize.equals(stamp.stampSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }
}

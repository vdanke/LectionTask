package org.step.beans;

import java.util.Objects;

public class Engine {

    private double power;
    private String serialNumber;

    public Engine() {
    }

    public Engine(double power, String serialNumber) {
        this.power = power;
        this.serialNumber = serialNumber;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.power, power) == 0 &&
                Objects.equals(serialNumber, engine.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, serialNumber);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

package web.model;


import java.util.Objects;


public class Car {

    private String model;
    private String type;
    private int series;

    public Car(String model, String type, int series) {
        this.model = model;
        this.type = type;
        this.series = series;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(type, car.type);
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, type, series);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", series=" + series +
                '}';
    }

}

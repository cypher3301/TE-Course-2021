package model;

public class Car {
    private long carId;
    private String carModel;
    private String carGraduationYear;
    private double carCosts;
    private String carRegistrationNumber;

    public Car() {
    }



    public static class CarBuilder{
        private final Car car = new Car();

        public Car build() {
            return car;
        }

        public CarBuilder setCarId(long carId) {
            car.carId = carId;
            return this;
        }

        public CarBuilder setCarModel(String carModel) {
            car.carModel = carModel;
            return this;
        }

        public CarBuilder setCarGraduationYear(String carGraduationYear) {
            car.carGraduationYear = carGraduationYear;
            return this;
        }

        public CarBuilder setCarCosts(double carCosts) {
            car.carCosts = carCosts;
            return this;
        }

        public CarBuilder setCarRegistrationNumber(String carRegistrationNumber) {
            car.carRegistrationNumber = carRegistrationNumber;
            return this;
        }
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarGraduationYear() {
        return carGraduationYear;
    }

    public void setCarGraduationYear(String carGraduationYear) {
        this.carGraduationYear = carGraduationYear;
    }

    public double getCarCosts() {
        return carCosts;
    }

    public void setCarCosts(double carCosts) {
        this.carCosts = carCosts;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getCarId() != car.getCarId()) return false;
        if (Double.compare(car.getCarCosts(), getCarCosts()) != 0) return false;
        if (getCarModel() != null ? !getCarModel().equals(car.getCarModel()) : car.getCarModel() != null) return false;
        if (getCarGraduationYear() != null ? !getCarGraduationYear().equals(car.getCarGraduationYear()) : car.getCarGraduationYear() != null)
            return false;
        return getCarRegistrationNumber() != null ? getCarRegistrationNumber().equals(car.getCarRegistrationNumber()) : car.getCarRegistrationNumber() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getCarId() ^ (getCarId() >>> 32));
        result = 31 * result + (getCarModel() != null ? getCarModel().hashCode() : 0);
        result = 31 * result + (getCarGraduationYear() != null ? getCarGraduationYear().hashCode() : 0);
        temp = Double.doubleToLongBits(getCarCosts());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCarRegistrationNumber() != null ? getCarRegistrationNumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car: " + carId +", " + carModel + ", " + carGraduationYear +", " + carCosts +", " + carRegistrationNumber;
    }

}

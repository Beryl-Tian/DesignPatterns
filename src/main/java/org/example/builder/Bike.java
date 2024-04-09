package org.example.builder;

public class Bike {
    private String frame;
    private String seat;
    private String wheels;
    private String brake;

    public Bike(BikeBuilder builder) {
        frame = builder.frame;
        seat = builder.seat;
        wheels = builder.wheels;
        brake = builder.brake;
    }

    public static final class BikeBuilder {
        String frame;
        String seat;
        String wheels;
        String brake;

        public BikeBuilder() {
        }

        public BikeBuilder frame(String input) {
            frame = input;
            return this;
        }

        public BikeBuilder seat(String input) {
            seat = input;
            return this;
        }

        public BikeBuilder wheels(String input) {
            wheels = input;
            return this;
        }

        public BikeBuilder brake(String input) {
            brake = input;
            return this;
        }

        public Bike build() {
            return new Bike(this);
        }
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                ", wheels='" + wheels + '\'' +
                ", brake='" + brake + '\'' +
                '}';
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}

package org.example.builder;

public class HelloBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

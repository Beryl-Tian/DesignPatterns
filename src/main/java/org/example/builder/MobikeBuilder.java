package org.example.builder;

public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
    mBike.setSeat("橡胶座椅");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

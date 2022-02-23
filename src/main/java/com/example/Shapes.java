package com.example;

abstract class Shape {
    final int positionX;

    protected Shape(Builder<?> b) {
        this.positionX = b.positionX;
    }

    abstract static class Builder<B extends Builder<B>> {
        int positionX;

        B withPositionX(int x) {
            this.positionX = x;
            return self();
        }

        abstract Shape build();

        abstract B self();
    }
}

class Square extends Shape {
    int size;

    private Square(Builder b) {
        super(b);
        this.size = b.size;
    }

    static class Builder extends Shape.Builder<Builder> {
        int size;

        Builder withSize(int size) {
            this.size = size;
            return self();
        }

        @Override
        Square build() {
            return new Square(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }
}




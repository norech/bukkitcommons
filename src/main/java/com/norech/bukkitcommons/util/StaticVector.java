package com.norech.bukkitcommons.util;

import org.bukkit.util.Vector;

public final class StaticVector extends Vector {

    public StaticVector(int x, int y, int z) {
        super.setX(x);
        super.setY(y);
        super.setZ(z);
    }

    public StaticVector(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        super.setZ(z);
    }

    public StaticVector(double x, double y, double z) {
        super.setX(x);
        super.setY(y);
        super.setZ(z);
    }

    public StaticVector(Vector v) {
        super.copy(v);
    }

    public Vector toVector() {
        return this.clone();
    }

    @Override
    public StaticVector copy(Vector vec) {
        return new StaticVector(clone().copy(vec));
    }

    @Override
    public StaticVector add(Vector vec) {
        return new StaticVector(clone().add(vec));
    }

    @Override
    public StaticVector subtract(Vector vec) {
        return new StaticVector(clone().subtract(vec));
    }

    @Override
    public StaticVector multiply(int value) {
        return new StaticVector(clone().multiply(value));
    }

    @Override
    public StaticVector multiply(double value) {
        return new StaticVector(clone().multiply(value));
    }

    @Override
    public StaticVector multiply(float value) {
        return new StaticVector(clone().multiply(value));
    }

    @Override
    public StaticVector multiply(Vector vec) {
        return new StaticVector(clone().multiply(vec));
    }

    @Override
    public StaticVector divide(Vector vec) {
        return new StaticVector(clone().divide(vec));
    }

    @Override
    public StaticVector midpoint(Vector other) {
        return new StaticVector(getMidpoint(other));
    }

    @Override
    public StaticVector crossProduct(Vector o) {
        return new StaticVector(getCrossProduct(o));
    }

    @Override
    public StaticVector zero() {
        return new StaticVector(0, 0, 0);
    }

    @Override
    public StaticVector setX(int x) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public StaticVector setY(int y) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public StaticVector setZ(int z) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setX(float x) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setY(float y) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setZ(float z) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setX(double x) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setY(double y) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }

    @Override
    public Vector setZ(double z) {
        throw new UnsupportedOperationException("StaticVector is supposed to be read-only! Set operation failed.");
    }
}

package com.Tutor;

import java.util.concurrent.atomic.AtomicBoolean;

public class Foo {
    private volatile AtomicBoolean isFirstFinished;
    private volatile AtomicBoolean isSecondFinished;
    private volatile AtomicBoolean isThirdFinished;

    public AtomicBoolean getIsFirstFinished() {
        return isFirstFinished;
    }

    public void setIsFirstFinished(AtomicBoolean isFirstFinished) {
        this.isFirstFinished = isFirstFinished;
    }

    public AtomicBoolean getIsSecondFinished() {
        return isSecondFinished;
    }

    public void setIsSecondFinished(AtomicBoolean isSecondFinished) {
        this.isSecondFinished = isSecondFinished;
    }

    public AtomicBoolean getIsThirdFinished() {
        return isThirdFinished;
    }

    public void setIsThirdFinished(AtomicBoolean isThirdFinished) {
        this.isThirdFinished = isThirdFinished;
    }

    public void first(Runnable r){};
    public void second(Runnable r){};
    public void third(Runnable r){};

}

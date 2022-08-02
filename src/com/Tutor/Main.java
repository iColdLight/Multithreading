package com.Tutor;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.first(() ->{
            AtomicBoolean isFirstFinished = foo.getIsFirstFinished();
            if(!isFirstFinished.get()){
                isFirstFinished.set(true);
                System.out.println("first");
            }
        });
        foo.second(() ->{
            AtomicBoolean isFirstFinished = foo.getIsFirstFinished();
            AtomicBoolean isSecondFinished = foo.getIsSecondFinished();
            if(isFirstFinished.get()&& !isSecondFinished.get()){
                isSecondFinished.set(true);
                System.out.println("second");
            }
        });
        foo.third(() ->{
            AtomicBoolean isFirstFinished = foo.getIsFirstFinished();
            AtomicBoolean isSecondFinished = foo.getIsSecondFinished();
            AtomicBoolean isThirdFinished = foo.getIsThirdFinished();
            if(isFirstFinished.get()&& isSecondFinished.get() &&!isThirdFinished.get()){
                isThirdFinished.set(true);
                System.out.println("third");
            }
        });
    }
}

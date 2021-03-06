package com.github.yoojia.events;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class TestPayload {

    public final AtomicInteger evt1Calls = new AtomicInteger(0);
    public final AtomicInteger evt2Calls = new AtomicInteger(0);

    public final int perEvtCount;
    public final int totalCalls;

    protected final CountDownLatch mCountDownLatch;

    protected TestPayload(int count) {
        perEvtCount = count;
        totalCalls = count * 2;
        mCountDownLatch = new CountDownLatch(totalCalls);
    }

    public void await() throws InterruptedException {
        mCountDownLatch.await();
    }

    public void hitEvt1(){
        evt1Calls.incrementAndGet();
        mCountDownLatch.countDown();
    }

    public void hitEvt2(){
        evt2Calls.incrementAndGet();
        mCountDownLatch.countDown();
    }
}

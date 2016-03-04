package com.github.yoojia.events;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.2
 */
final class MethodArgs {

    public final int scheduleType;
    public final Class<?>[] defineTypes;
    public final String defineNames;

    MethodArgs(int scheduleType, Class<?>[] defineTypes, String defineNames) {
        this.scheduleType = scheduleType;
        this.defineTypes = defineTypes;
        this.defineNames = defineNames;
    }
}

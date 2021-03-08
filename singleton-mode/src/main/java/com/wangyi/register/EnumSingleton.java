package com.wangyi.register;

public enum EnumSingleton {
    /*
    *枚举单例
    */
    INSTANCE;
    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

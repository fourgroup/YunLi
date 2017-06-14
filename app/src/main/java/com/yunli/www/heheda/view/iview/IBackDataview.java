package com.yunli.www.heheda.view.iview;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/13 20:33
 * Title:
 * Text:
 */

public interface IBackDataview<T> {
    void onDataBack(T t);
    void onError(Throwable throwable);
}

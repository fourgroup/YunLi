package com.yunli.www.heheda.presenter;

import com.yunli.www.heheda.model.bean.PhoneLoginBean;
import com.yunli.www.heheda.model.util.HttpUtil;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/13 20:38
 * Title:
 * Text:
 */

public class PhoneLoginPresenter extends Basepresent{
    public void phoneLogin(String phone){
        Observer<PhoneLoginBean> observer=new Observer<PhoneLoginBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(PhoneLoginBean value) {
                getiBackDataview().onDataBack(value);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        HttpUtil.phoneLogin(phone,observer);
    }
}

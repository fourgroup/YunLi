package com.yunli.www.heheda.model.util;

import com.yunli.www.heheda.model.bean.PhoneLoginBean;
import com.yunli.www.heheda.view.iview.ApiService;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/13 19:57
 * Title:
 * Text:
 */

public class HttpUtil {


    private static Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.phone)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    static public void phoneLogin(String phone,Observer observer){
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<PhoneLoginBean> observable=apiService.getPhoneLogin(phone);
        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(observer);
    }
}

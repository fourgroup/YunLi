package com.yunli.www.heheda.view.iview;

import com.yunli.www.heheda.model.bean.PhoneLoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/13 20:01
 * Title:
 * Text:
 */

public interface ApiService {

    @FormUrlEncoded
    @POST()
    Observable<PhoneLoginBean> getPhoneLogin(@Field("phone")String phone);

}

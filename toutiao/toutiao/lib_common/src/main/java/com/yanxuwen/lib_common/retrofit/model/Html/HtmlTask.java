package com.yanxuwen.lib_common.retrofit.model.Html;

import android.content.Context;

import com.yanxuwen.lib_common.retrofit.Msg.Msg;
import com.yanxuwen.lib_common.retrofit.MyBaseTask;
import com.yanxuwen.retrofit.Annotation.Description;
import com.yanxuwen.retrofit.BaseRequest;
import com.yanxuwen.retrofit.Msg.ObserverListener;

import java.lang.reflect.Type;

import rx.Observable;

/**
 * Created by yanxuwen on 2018/6/6.
 */
@Description("获取html代码片段")
public class HtmlTask extends MyBaseTask {
    HtmlBuild mBuild;

    public HtmlTask(Context context, ObserverListener ob, String id) {
        super(context, ob);
        mBuild = new HtmlBuild(context);
        mBuild.setId(id);
    }

    @Override
    public Observable<String> getObservable() {
        return ((HtmlApi) getBaseApi()).postString(mBuild.getId(), mBuild.getId());
    }

    @Override
    public boolean isEncrypt() {
        return true;
    }

    @Override
    public boolean isShow() {
        return false;
    }

    @Override
    public boolean isReturnString() {
        return false;
    }

    @Override
    public boolean isToast() {
        return false;
    }

    @Override
    public String getDataType() {
        return Msg.Html;
    }

    @Override
    public BaseRequest requestClass() {
        return mBuild;
    }

    @Override
    public Type returnClass() {
        return Html.class;
    }

    @Override
    public Class<?> getBaseApiClass() {
        return HtmlApi.class;
    }

    @Override
    public void onCompleted() {
        super.onCompleted();
    }

    @Override
    public void onError(Object object) {
        super.onError(object);
    }

    @Override
    public void onSuccess(Object object) {
        super.onSuccess(object);
    }

    @Override
    public void onFail(Object object) {
        super.onFail(object);
    }
}
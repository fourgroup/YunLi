package com.yunli.www.heheda.presenter;

import com.yunli.www.heheda.view.iview.IBackDataview;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/13 19:46
 * Title:
 * Text:
 */

public class Basepresent {
    private IBackDataview iBackDataview;

    public IBackDataview getiBackDataview() {
        return iBackDataview;
    }

    public void atTouchActivity(IBackDataview iBackDataview){
        this.iBackDataview=iBackDataview;
    }
    public void deTouchActivity(){
        if(iBackDataview!=null){
            iBackDataview=null;
        }
    }
}

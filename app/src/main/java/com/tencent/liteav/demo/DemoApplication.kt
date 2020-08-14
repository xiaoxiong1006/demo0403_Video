package com.tencent.liteav.demo

import android.app.Application
import com.tencent.qcloud.ugckit.UGCKit
import com.tencent.ugc.TXUGCBase

class DemoApplication:Application() {
    //   如何获取License? 请参考官网指引 https://cloud.tencent.com/document/product/454/34750
    private var licenceUrl =
        "http://download-1252463788.cossh.myqcloud.com/xiaoshipin/licence_android/RDM_Enterprise.license"
    private var licenseKey = "9bc74ac7bfd07ea392e8fdff2ba5678a"
    override fun onCreate() {
        super.onCreate()

        TXUGCBase.getInstance().setLicence(this, licenceUrl, licenseKey)
        UGCKit.init(this)
    }

}



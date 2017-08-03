package com.jingjiu.sdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

import com.jingjiu.sdk.core.ad.exception.AdException;
import com.jingjiu.sdk.util.cache.DiskLruCacheHelper;

import java.io.IOException;

import static com.jingjiu.sdk.core.ad.common.Configuration.AD_BITMAP_CACHE;
import static com.jingjiu.sdk.core.ad.common.Configuration.AD_LIST_CACHE;
import static com.jingjiu.sdk.core.ad.common.Verification.bWorking;

/**

 */

public final class InitSDK {

    /**
     * mContext 上下文
     */
    @SuppressLint("StaticFieldLeak")

    static Context mContext;
    static DiskLruCacheHelper mHelperAdImgCache;
    static DiskLruCacheHelper mHelperAdListAndAdInfoCache;


    /**
     * 初始化工具类
     * 必须在application中初始化
     *
     * @param context 上下文
     * @throws IOException 初始化缓存失败
     */
    public static void init(Context context) throws AdException, IOException {
        if (context == null) {
            bWorking = false;
            throw new AdException("请确保 init(Context context) 参数不为空!!!");
        }
        if (mContext == null) {
            mContext = context.getApplicationContext();
        }
        if (mHelperAdImgCache == null) {
            mHelperAdImgCache = new DiskLruCacheHelper(mContext, AD_BITMAP_CACHE);
        }
        if (mHelperAdListAndAdInfoCache == null) {
            mHelperAdListAndAdInfoCache = new DiskLruCacheHelper(mContext, AD_LIST_CACHE);
        }
    }
}

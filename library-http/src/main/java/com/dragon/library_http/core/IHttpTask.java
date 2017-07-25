package com.dragon.library_http.core;


import com.dragon.library_http.callback.OnHttpTaskCallback;

import java.util.Map;

/**
 * function
 */

public interface IHttpTask<T extends IHttpTask> {

    /**
     * 请求方式 get
     *
     * @param url 请求url
     * @return 异步任务
     */
    T get(String url);

    /**
     * 请求方式 post
     *
     * @param url 请求url
     * @return 异步任务
     */
    T post(String url);

    /**
     * 添加请求参数
     *
     * @param params 请求参数
     * @return 异步任务
     */
    T addParams(Map<String, String> params);

    /**
     * 添加请求参数
     *
     * @param key   字段
     * @param value 值
     * @return 异步任务
     */
    T addParams(String key, String value);

    /**
     * 添加请求头
     *
     * @param key   字段
     * @param value 值
     * @return 异步任务
     */
    T addHeads(String key, String value);

    /**
     * 添加请求头
     *
     * @param heads 请求头
     * @return 异步任务
     */
    T addHeads(Map<String, String> heads);

    /**
     * 设置超时时间
     *
     * @param timeout 超时时间
     * @return 异步任务
     */
    T setTimeout(int timeout);

    /**
     * 设置回调接口
     *
     * @param taskCallback 回调接口
     * @return 异步任务
     */
    T setOnHttpTaskCallback(OnHttpTaskCallback taskCallback);

    /**
     * 设置字符集
     *
     * @param charset 字符集
     * @return 异步任务
     */
    T setCharset(String charset);

    /**
     * @param tag 线程标志
     */
    void cancelTask(String tag);
}

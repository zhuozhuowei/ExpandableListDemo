package com.example.aa;


import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ExUtils {

    private static final String TAG_GET = "exutils--->";

    public static String connectGet() {

        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL("http://www.handybest.com/index.php?m=Wx&c=Index&a=get_topic_info&id=34&view=");
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            // 判断请求是否成功
            if (urlConnection.getResponseCode() == 200) {
//                // 获取返回的数据
//                byte[] data = readStream(urlConnection.getInputStream());
//                Log.i(TAG_GET, "Get方式请求成功，返回数据如下：");
//                Log.i(TAG_GET, new String(data, "UTF-8"));
//                return new String(data, "UTF-8");
                return readInStreams(in);
            } else {
                Log.i(TAG_GET, "Get方式请求失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
        return null;
    }

    private static String readInStreams(InputStream in) {
        Scanner scanner = new Scanner(in).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
    }


    /***
     * Gson 解析数据
     */
    public static LcBean gsonData() {
        LcBean lcBean = null;
        try {
            String strContent = connectGet();
            Gson gson = new Gson();

            lcBean = gson.fromJson(strContent, LcBean.class);
            return lcBean;
        } catch (JsonSyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

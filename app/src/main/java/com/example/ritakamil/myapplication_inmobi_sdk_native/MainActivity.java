package com.example.ritakamil.myapplication_inmobi_sdk_native;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.sdk.InMobiSdk.LogLevel;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.nativead.sample.R;
import com.inmobi.nativead.utility.FeedData.FeedItem;
import com.inmobi.nativead.PlacementId;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize Inmobi SDK before any API call.

        InMobiSdk.setLogLevel(InMobiSdk.LogLevel.DEBUG);
        InMobiSdk.init(this, "389ca4c59f6741f7b1e96e4af3f42b3f");


        ListView listView =(ListView)findViewById(R.id.listView);
    }

        private final List<InMobiNative> mNativeAds = new ArrayList<>();
        InMobiNative nativeAd = new InMobiNative(com.example.ritakamil.myapplication_inmobi_sdk_native.NativeAdsActivity.this, 1535800178563, nativeAdListener);
        nativeAd.load();
        mNativeAds.add(nativeAd);
    }



    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}

public class NativeAdsActivity extends Activity {

    private final List<InMobiNative> mNativeAds = new ArrayList<>();
    InMobiNative nativeAd = new InMobiNative(NativeAdsActivity.this, YOUR_PLACEMENT_ID, nativeAdListener);
        nativeAd.load();
        mNativeAds.add(nativeAd);
}


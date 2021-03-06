package com.ycbjie.ycphotocover;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ycbjie.ycphotocover.cover.GalleryImageView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

    GalleryImageView scrollGalleryView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        scrollGalleryView = findViewById(R.id.scroll_gallery_view);
        initImage();
    }

    private void initImage(){
        List<Object> picsBeanList = new ArrayList<>();
        for (int i=0 ; i<10  ; i++){
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190916/asphpxyzcymmbhcpkkqejspgyzjqvsbs.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/201909/982823160a0693d37768a2c7ae787cef.jpeg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190916/asphpxyzcymmbhcpkkqejspgyzjqvsbs.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/201909/982823160a0693d37768a2c7ae787cef.jpeg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190916/asphpxyzcymmbhcpkkqejspgyzjqvsbs.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/201909/982823160a0693d37768a2c7ae787cef.jpeg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190916/asphpxyzcymmbhcpkkqejspgyzjqvsbs.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/201909/982823160a0693d37768a2c7ae787cef.jpeg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
            picsBeanList.add("https://pic1.yilu.cn/20190917/fqlcmvycypjmmgdvdbrhgfzpsiidmjva.jpg");
        }

        scrollGalleryView
                //??????viewPager???????????????????????????
                //????????????????????????
                //???????????????????????????
                .setPosition(0)
                //?????????????????????
                //???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
                .hideThumbnails(false)
                //??????????????????????????????????????????
                .addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPageSelected(int position) {

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                })
                .addUrlToRecyclerView(picsBeanList);
    }
}

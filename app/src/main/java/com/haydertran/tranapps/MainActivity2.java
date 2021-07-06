package com.haydertran.tranapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.AdRequest;

import static com.google.android.gms.ads.RequestConfiguration.TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE;

public class MainActivity2 extends AppCompatActivity {

    private Intent intent;
    private MediaPlayer mediaPlayer;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration()
                .toBuilder()
                .setTagForChildDirectedTreatment(TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE)
                .build();
        MobileAds.setRequestConfiguration(requestConfiguration);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1707823485728314/2482122755");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }


    public void go_letters(View view) {
        next_activity(1, "id", R.raw.letter);
        Showads();

}
    public void go_numbers(View view) {
        next_activity(2, "id",R.raw.number);
        Showads();
    }

    public void go_color(View view) {
        next_activity(3, "id",R.raw.colors);
        Showads();
    }

    public void go_country(View view) {
        next_activity(4, "id",R.raw.countries);
        Showads();
    }

    public void go_family(View view) {
        next_activity(5, "id",R.raw.familys);
        Showads();
    }

    public void go_occupations(View view) {
        next_activity(6, "id",R.raw.occupations);
        Showads();
    }

    public void go_animals(View view) {
        next_activity(7, "id",R.raw.animal);
        Showads();
    }

    public void go_transportation(View view) {
        next_activity(8, "id",R.raw.transportations);
        Showads();
    }

    public void go_days(View view) {
        next_activity(9, "id",R.raw.days);
        Showads();
    }

    public void go_months(View view) {
        next_activity(10, "id",R.raw.month);
        Showads();
    }

    public void go_fruit(View view) {
        next_activity(11, "id",R.raw.fruits);
        Showads();
    }

    public void go_vegetables(View view) {
        next_activity(12, "id",R.raw.vegetables);
        Showads();
    }


    public void go_seasons(View view) {
        next_activity(13, "id",R.raw.season);
        Showads();
    }

    public void go_Electrical(View view) {
        next_activity(14, "id",R.raw.electricaldevice);
        Showads();
    }

    private void next_activity(int i, String s,int m) {

        mediaPlayer=MediaPlayer.create(this,m);
        mediaPlayer.start();
        intent = new Intent(this, MainActivity.class);
        intent.putExtra(s, i);
        startActivity(intent);

    }
    private void Showads(){

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }


        mInterstitialAd.setAdListener(new

                                              AdListener() {
                                                  @Override
                                                  public void onAdClosed () {
                                                      // Load the next interstitial.
                                                      mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                                  }
        });


    }
}
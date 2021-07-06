package com.haydertran.tranapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;


import static com.google.android.gms.ads.RequestConfiguration.TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE;


public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private int i;
    private ListView listView;
    private AdapterClass adapterClass;
    private ArrayList<Item> arrayList = new ArrayList<>();
    private Context context = this;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1707823485728314/2482122755");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mInterstitialAd.setAdListener(new

                                              AdListener() {
                                                  @Override
                                                  public void onAdClosed () {
                                                      // Load the next interstitial.
                                                      mInterstitialAd.loadAd(new AdRequest.Builder().build());
                                                  }
                                              });



        ConstraintLayout constraintLayout=findViewById(R.id.cons);

        listView = findViewById(R.id.list);

        intent = getIntent();
        i = intent.getIntExtra("id", -1);

        if (i == 1) {
            constraintLayout.setBackgroundResource(R.drawable.letter);
            AddItem(arrayList, getResources().getString(R.string.A));
            AddItem(arrayList, getResources().getString(R.string.B));
            AddItem(arrayList, getResources().getString(R.string.C));
            AddItem(arrayList, getResources().getString(R.string.D));
            AddItem(arrayList, getResources().getString(R.string.E));
            AddItem(arrayList, getResources().getString(R.string.F));
            AddItem(arrayList, getResources().getString(R.string.G));
            AddItem(arrayList, getResources().getString(R.string.H));
            AddItem(arrayList, getResources().getString(R.string.I));
            AddItem(arrayList, getResources().getString(R.string.J));
            AddItem(arrayList, getResources().getString(R.string.K));
            AddItem(arrayList, getResources().getString(R.string.L));
            AddItem(arrayList, getResources().getString(R.string.M));
            AddItem(arrayList, getResources().getString(R.string.N));
            AddItem(arrayList, getResources().getString(R.string.O));
            AddItem(arrayList, getResources().getString(R.string.P));
            AddItem(arrayList, getResources().getString(R.string.Q));
            AddItem(arrayList, getResources().getString(R.string.R));
            AddItem(arrayList, getResources().getString(R.string.S));
            AddItem(arrayList, getResources().getString(R.string.T));
            AddItem(arrayList, getResources().getString(R.string.U));
            AddItem(arrayList, getResources().getString(R.string.V));
            AddItem(arrayList, getResources().getString(R.string.W));
            AddItem(arrayList, getResources().getString(R.string.X));
            AddItem(arrayList, getResources().getString(R.string.Y));
            AddItem(arrayList, getResources().getString(R.string.Z));


        } else if (i == 2) {

            constraintLayout.setBackgroundResource(R.drawable.numbersss);
            AddItem(arrayList, getResources().getString(R.string.zero));
            AddItem(arrayList, getResources().getString(R.string.one));
            AddItem(arrayList, getResources().getString(R.string.tow));
            AddItem(arrayList, getResources().getString(R.string.three));
            AddItem(arrayList, getResources().getString(R.string.four));
            AddItem(arrayList, getResources().getString(R.string.five));
            AddItem(arrayList, getResources().getString(R.string.six));
            AddItem(arrayList, getResources().getString(R.string.seven));
            AddItem(arrayList, getResources().getString(R.string.eight));
            AddItem(arrayList, getResources().getString(R.string.nine));
            AddItem(arrayList, getResources().getString(R.string.ten));
            AddItem(arrayList, getResources().getString(R.string.eleven));
            AddItem(arrayList, getResources().getString(R.string.twelve));
            AddItem(arrayList, getResources().getString(R.string.thirteen));
            AddItem(arrayList, getResources().getString(R.string.fourteen));
            AddItem(arrayList, getResources().getString(R.string.fifteen));
            AddItem(arrayList, getResources().getString(R.string.sixteen));
            AddItem(arrayList, getResources().getString(R.string.seventeen));
            AddItem(arrayList, getResources().getString(R.string.eighteen));
            AddItem(arrayList, getResources().getString(R.string.nineteen));
            AddItem(arrayList, getResources().getString(R.string.twenty));

        } else if (i == 3) {

            constraintLayout.setBackgroundResource(R.drawable.colorss);
            AddItem(arrayList, getResources().getString(R.string.black));
            AddItem(arrayList, getResources().getString(R.string.red));
            AddItem(arrayList, getResources().getString(R.string.white));
            AddItem(arrayList, getResources().getString(R.string.green));
            AddItem(arrayList, getResources().getString(R.string.grey));
            AddItem(arrayList, getResources().getString(R.string.purple));
            AddItem(arrayList, getResources().getString(R.string.pink));
            AddItem(arrayList, getResources().getString(R.string.yellow));
            AddItem(arrayList, getResources().getString(R.string.orange));
            AddItem(arrayList, getResources().getString(R.string.blue));
            AddItem(arrayList, getResources().getString(R.string.brouwn));


        } else if (i == 4) {

            constraintLayout.setBackgroundResource(R.drawable.earth);
            AddItem(arrayList, getResources().getString(R.string.jordan));
            AddItem(arrayList, getResources().getString(R.string.emirates));
            AddItem(arrayList, getResources().getString(R.string.eritrea));
            AddItem(arrayList, getResources().getString(R.string.bahrain));
            AddItem(arrayList, getResources().getString(R.string.algeria));
            AddItem(arrayList, getResources().getString(R.string.saudi));
            AddItem(arrayList, getResources().getString(R.string.sudan));
            AddItem(arrayList, getResources().getString(R.string.somalia));
            AddItem(arrayList, getResources().getString(R.string.iraq));
            AddItem(arrayList, getResources().getString(R.string.kuwait));
            AddItem(arrayList, getResources().getString(R.string.morocco));
            AddItem(arrayList, getResources().getString(R.string.yemen));
            AddItem(arrayList, getResources().getString(R.string.tunisia));
            AddItem(arrayList, getResources().getString(R.string.djibouti));
            AddItem(arrayList, getResources().getString(R.string.syria));
            AddItem(arrayList, getResources().getString(R.string.oman));
            AddItem(arrayList, getResources().getString(R.string.palestine));
            AddItem(arrayList, getResources().getString(R.string.qatar));
            AddItem(arrayList, getResources().getString(R.string.lebanon));
            AddItem(arrayList, getResources().getString(R.string.libya));
            AddItem(arrayList, getResources().getString(R.string.egypt));
            AddItem(arrayList, getResources().getString(R.string.mauritania));


        } else if (i == 5) {

            constraintLayout.setBackgroundResource(R.drawable.familys);

            AddItem(arrayList, getResources().getString(R.string.father));
            AddItem(arrayList, getResources().getString(R.string.mother));
            AddItem(arrayList, getResources().getString(R.string.brother));
            AddItem(arrayList, getResources().getString(R.string.sister));
            AddItem(arrayList, getResources().getString(R.string.grandfather));
            AddItem(arrayList, getResources().getString(R.string.grandmother));
            AddItem(arrayList, getResources().getString(R.string.son));
            AddItem(arrayList, getResources().getString(R.string.daughter));
            AddItem(arrayList, getResources().getString(R.string.uncle));
            AddItem(arrayList, getResources().getString(R.string.aunt));
            AddItem(arrayList, getResources().getString(R.string.husband));
            AddItem(arrayList, getResources().getString(R.string.wife));
            AddItem(arrayList, getResources().getString(R.string.cousin));

        } else if (i == 6) {

            constraintLayout.setBackgroundResource(R.drawable.job);
            AddItem(arrayList, getResources().getString(R.string.accountant));
            AddItem(arrayList, getResources().getString(R.string.actor));
            AddItem(arrayList, getResources().getString(R.string.ambassador));
            AddItem(arrayList, getResources().getString(R.string.artist));
            AddItem(arrayList, getResources().getString(R.string.baker));
            AddItem(arrayList, getResources().getString(R.string.barber));
            AddItem(arrayList, getResources().getString(R.string.carpenter));
            AddItem(arrayList, getResources().getString(R.string.chef));
            AddItem(arrayList, getResources().getString(R.string.doctor));
            AddItem(arrayList, getResources().getString(R.string.driver));
            AddItem(arrayList, getResources().getString(R.string.electrician));
            AddItem(arrayList, getResources().getString(R.string.engineer));
            AddItem(arrayList, getResources().getString(R.string.jewellery));
            AddItem(arrayList, getResources().getString(R.string.journalist));
            AddItem(arrayList, getResources().getString(R.string.judge));
            AddItem(arrayList, getResources().getString(R.string.lawyer));
            AddItem(arrayList, getResources().getString(R.string.mason));
            AddItem(arrayList, getResources().getString(R.string.mechanical));
            AddItem(arrayList, getResources().getString(R.string.merchant));
            AddItem(arrayList, getResources().getString(R.string.nurse));
            AddItem(arrayList, getResources().getString(R.string.painter));
            AddItem(arrayList, getResources().getString(R.string.photographer));
            AddItem(arrayList, getResources().getString(R.string.pilot));
            AddItem(arrayList, getResources().getString(R.string.poet));
            AddItem(arrayList, getResources().getString(R.string.policeman));
            AddItem(arrayList, getResources().getString(R.string.salesman));
            AddItem(arrayList, getResources().getString(R.string.scientist));
            AddItem(arrayList, getResources().getString(R.string.secretary));
            AddItem(arrayList, getResources().getString(R.string.smith));
            AddItem(arrayList, getResources().getString(R.string.surgeon));
            AddItem(arrayList, getResources().getString(R.string.teacher));
            AddItem(arrayList, getResources().getString(R.string.weaver));
            AddItem(arrayList, getResources().getString(R.string.writer));


        } else if (i == 7) {

            constraintLayout.setBackgroundResource(R.drawable.garden);
            AddItem(arrayList, getResources().getString(R.string.ant));
            AddItem(arrayList, getResources().getString(R.string.bear));
            AddItem(arrayList, getResources().getString(R.string.bee));
            AddItem(arrayList, getResources().getString(R.string.camel));
            AddItem(arrayList, getResources().getString(R.string.cat));
            AddItem(arrayList, getResources().getString(R.string.chicken));
            AddItem(arrayList, getResources().getString(R.string.cow));
            AddItem(arrayList, getResources().getString(R.string.crocodile));
            AddItem(arrayList, getResources().getString(R.string.deer));
            AddItem(arrayList, getResources().getString(R.string.dinosaur));
            AddItem(arrayList, getResources().getString(R.string.dog));
            AddItem(arrayList, getResources().getString(R.string.donkey));
            AddItem(arrayList, getResources().getString(R.string.dove));
            AddItem(arrayList, getResources().getString(R.string.eagle));
            AddItem(arrayList, getResources().getString(R.string.elephant));
            AddItem(arrayList, getResources().getString(R.string.falcon));
            AddItem(arrayList, getResources().getString(R.string.fish));
            AddItem(arrayList, getResources().getString(R.string.fox));
            AddItem(arrayList, getResources().getString(R.string.horse));
            AddItem(arrayList, getResources().getString(R.string.kangaroo));
            AddItem(arrayList, getResources().getString(R.string.leopard));
            AddItem(arrayList, getResources().getString(R.string.lion));
            AddItem(arrayList, getResources().getString(R.string.monkey));
            AddItem(arrayList, getResources().getString(R.string.mouse));
            AddItem(arrayList, getResources().getString(R.string.ostrich));
            AddItem(arrayList, getResources().getString(R.string.owl));
            AddItem(arrayList, getResources().getString(R.string.rabbit));
            AddItem(arrayList, getResources().getString(R.string.shark));
            AddItem(arrayList, getResources().getString(R.string.sheep));
            AddItem(arrayList, getResources().getString(R.string.snake));
            AddItem(arrayList, getResources().getString(R.string.sparrow));
            AddItem(arrayList, getResources().getString(R.string.spider));
            AddItem(arrayList, getResources().getString(R.string.squirrel));
            AddItem(arrayList, getResources().getString(R.string.wolf));
            AddItem(arrayList,getResources().getString(R.string.bat));
            AddItem(arrayList,getResources().getString(R.string.giraffe));
            AddItem(arrayList,getResources().getString(R.string.penguin));
            AddItem(arrayList,getResources().getString(R.string.seal));
            AddItem(arrayList,getResources().getString(R.string.tortoise));


        } else if (i == 8) {

            constraintLayout.setBackgroundResource(R.drawable.transportations);
            AddItem(arrayList, getResources().getString(R.string.bicycle));
            AddItem(arrayList, getResources().getString(R.string.bus));
            AddItem(arrayList, getResources().getString(R.string.car));
            AddItem(arrayList, getResources().getString(R.string.motorcycle));
            AddItem(arrayList, getResources().getString(R.string.plane));
            AddItem(arrayList, getResources().getString(R.string.ship));
            AddItem(arrayList, getResources().getString(R.string.spaceship));
            AddItem(arrayList, getResources().getString(R.string.steamship));
            AddItem(arrayList, getResources().getString(R.string.submarine));
            AddItem(arrayList, getResources().getString(R.string.subway));
            AddItem(arrayList, getResources().getString(R.string.train));
        } else if (i == 9) {

            constraintLayout.setBackgroundResource(R.drawable.week);
            AddItem(arrayList, getResources().getString(R.string.sunday));
            AddItem(arrayList, getResources().getString(R.string.monday));
            AddItem(arrayList, getResources().getString(R.string.tuesday));
            AddItem(arrayList, getResources().getString(R.string.wednesday));
            AddItem(arrayList, getResources().getString(R.string.thursday));
            AddItem(arrayList, getResources().getString(R.string.friday));
            AddItem(arrayList, getResources().getString(R.string.saturday));


        } else if (i == 10) {

            constraintLayout.setBackgroundResource(R.drawable.calendars);
            AddItem(arrayList, getResources().getString(R.string.january));
            AddItem(arrayList, getResources().getString(R.string.february));
            AddItem(arrayList, getResources().getString(R.string.march));
            AddItem(arrayList, getResources().getString(R.string.april));
            AddItem(arrayList, getResources().getString(R.string.may));
            AddItem(arrayList, getResources().getString(R.string.june));
            AddItem(arrayList, getResources().getString(R.string.july));
            AddItem(arrayList, getResources().getString(R.string.august));
            AddItem(arrayList, getResources().getString(R.string.september));
            AddItem(arrayList, getResources().getString(R.string.october));
            AddItem(arrayList, getResources().getString(R.string.november));
            AddItem(arrayList, getResources().getString(R.string.december));


        } else if (i == 11) {

            constraintLayout.setBackgroundResource(R.drawable.cartoontree);
            AddItem(arrayList, getResources().getString(R.string.apple));
            AddItem(arrayList, getResources().getString(R.string.apricot));
            AddItem(arrayList, getResources().getString(R.string.avocado));
            AddItem(arrayList, getResources().getString(R.string.banana));
            AddItem(arrayList, getResources().getString(R.string.blueberry));
            AddItem(arrayList, getResources().getString(R.string.carrots));
            AddItem(arrayList, getResources().getString(R.string.cherries));
            AddItem(arrayList, getResources().getString(R.string.coconut));
            AddItem(arrayList, getResources().getString(R.string.dates));
            AddItem(arrayList, getResources().getString(R.string.fig));
            AddItem(arrayList, getResources().getString(R.string.grape));
            AddItem(arrayList, getResources().getString(R.string.kiwi));
            AddItem(arrayList, getResources().getString(R.string.lemon));
            AddItem(arrayList, getResources().getString(R.string.melon));
            AddItem(arrayList, getResources().getString(R.string.olive));
            AddItem(arrayList, getResources().getString(R.string.orangee));
            AddItem(arrayList, getResources().getString(R.string.peach));
            AddItem(arrayList, getResources().getString(R.string.pear));
            AddItem(arrayList, getResources().getString(R.string.pineapple));
            AddItem(arrayList, getResources().getString(R.string.plum));
            AddItem(arrayList, getResources().getString(R.string.pomegranate));
            AddItem(arrayList, getResources().getString(R.string.quince));
            AddItem(arrayList, getResources().getString(R.string.strawberries));
            AddItem(arrayList, getResources().getString(R.string.watermelon));


        } else if (i == 12) {
            constraintLayout.setBackgroundResource(R.drawable.cartoontree);
            AddItem(arrayList, getResources().getString(R.string.aubergine));
            AddItem(arrayList, getResources().getString(R.string.basil));
            AddItem(arrayList, getResources().getString(R.string.beans));
            AddItem(arrayList, getResources().getString(R.string.cauliflower));
            AddItem(arrayList, getResources().getString(R.string.celery));
            AddItem(arrayList, getResources().getString(R.string.cucumber));
            AddItem(arrayList, getResources().getString(R.string.garlic));
            AddItem(arrayList, getResources().getString(R.string.lettuce));
            AddItem(arrayList, getResources().getString(R.string.okra));
            AddItem(arrayList, getResources().getString(R.string.onions));
            AddItem(arrayList, getResources().getString(R.string.pepper));
            AddItem(arrayList, getResources().getString(R.string.potato));
            AddItem(arrayList, getResources().getString(R.string.pumpkin));
            AddItem(arrayList, getResources().getString(R.string.spinach));
            AddItem(arrayList, getResources().getString(R.string.tomatoes));
            AddItem(arrayList, getResources().getString(R.string.zucchini));


        } else if (i == 13) {

            constraintLayout.setBackgroundResource(R.drawable.seasonss);
            AddItem(arrayList, getResources().getString(R.string.autumn));
            AddItem(arrayList, getResources().getString(R.string.spring));
            AddItem(arrayList, getResources().getString(R.string.summer));
            AddItem(arrayList, getResources().getString(R.string.winter));


        } else if (i == 14) {

            constraintLayout.setBackgroundResource(R.drawable.electric);
            AddItem(arrayList, getResources().getString(R.string.camera));
            AddItem(arrayList, getResources().getString(R.string.computer));
            AddItem(arrayList, getResources().getString(R.string.conditioner));
            AddItem(arrayList, getResources().getString(R.string.dryer));
            AddItem(arrayList, getResources().getString(R.string.fan));
            AddItem(arrayList, getResources().getString(R.string.fridge));
            AddItem(arrayList, getResources().getString(R.string.heater));
            AddItem(arrayList, getResources().getString(R.string.lamp));
            AddItem(arrayList, getResources().getString(R.string.tv));
            AddItem(arrayList, getResources().getString(R.string.vacuum));
            AddItem(arrayList, getResources().getString(R.string.washing));
        }


    }

    private void AddItem(final ArrayList<Item> arrayListl, String name) {
        arrayList.add(new Item(name));
        adapterClass = new AdapterClass(arrayListl, context, new Conection() {
            @Override
            public void Onclick(String n) {
                /*
                if (mInterstitialAd.isLoaded() && n==R.drawable.e||mParam1==R.drawable.h||mParam1==R.drawable.l||mParam1==R.drawable.o||mParam1==R.drawable.x||
                        mParam1==R.drawable.three||mParam1==R.drawable.seven||mParam1==R.drawable.eleven||mParam1==R.drawable.fifteen||mParam1==R.drawable.eighteen||
                        mParam1==R.drawable.bahrain||mParam1==R.drawable.saudi||mParam1==R.drawable.iraq||mParam1==R.drawable.yemen||mParam1==R.drawable.syria||
                        mParam1==R.drawable.lebanon||mParam1==R.drawable.white||mParam1==R.drawable.grey||mParam1==R.drawable.yellow||mParam1==R.drawable.braown||mParam1==R.drawable.brother
                        ||mParam1==R.drawable.grandmother||mParam1==R.drawable.uncle||mParam1==R.drawable.husband||mParam1==R.drawable.cousin||mParam1==
                        R.drawable.ambassador||mParam1==R.drawable.barber||mParam1==R.drawable.doctor||mParam1==R.drawable.jewellery||mParam1==R.drawable.lawyer||
                        mParam1==R.drawable.merchant||mParam1==R.drawable.photographer||mParam1==R.drawable.secretary||mParam1==R.drawable.writer||mParam1==R.drawable.motorcycle
                        ||mParam1==R.drawable.steamship||mParam1==R.drawable.subway||mParam1==R.drawable.camel||mParam1==R.drawable.crocodile||mParam1==R.drawable.donkey||
                        mParam1==R.drawable.falcon||mParam1==R.drawable.fox||mParam1==R.drawable.lion||mParam1==R.drawable.rabbit||mParam1==R.drawable.squirrel||mParam1==R.drawable.tortoise||
                        mParam1==R.drawable.may||mParam1==R.drawable.september||mParam1==R.drawable.november||mParam1==R.drawable.wednesday||mParam1==R.drawable.saturday
                        ||mParam1==R.drawable.beans||mParam1==R.drawable.cucumber||mParam1==R.drawable.okra||mParam1==R.drawable.spinach
                        ||mParam1==R.drawable.banana||mParam1==R.drawable.dates||mParam1==R.drawable.lemon||mParam1==R.drawable.orange||mParam1==R.drawable.watermelon||
                        mParam1==R.drawable.dryer||mParam1==R.drawable.lamp||mParam1==R.drawable.washing||mParam1==R.drawable.summer) {
                    mInterstitialAd.show();
                }

                 */

                LoadedAds(n,getResources().getString(R.string.c),getResources().getString(R.string.f));
                LoadedAds(n,getResources().getString(R.string.l),getResources().getString(R.string.i));
                LoadedAds(n,getResources().getString(R.string.o),getResources().getString(R.string.s));
                LoadedAds(n,getResources().getString(R.string.w),getResources().getString(R.string.z));
                LoadedAds(n,getResources().getString(R.string.three),getResources().getString(R.string.seven));
                LoadedAds(n,getResources().getString(R.string.eleven),getResources().getString(R.string.fifteen));
                LoadedAds(n,getResources().getString(R.string.eighteen),getResources().getString(R.string.bahrain));
                LoadedAds(n,getResources().getString(R.string.saudi),getResources().getString(R.string.iraq));
                LoadedAds(n,getResources().getString(R.string.tunisia),getResources().getString(R.string.lebanon));
                LoadedAds(n,getResources().getString(R.string.green),getResources().getString(R.string.orange));
                LoadedAds(n,getResources().getString(R.string.artist),getResources().getString(R.string.chef));
                LoadedAds(n,getResources().getString(R.string.engineer),getResources().getString(R.string.mason));
                LoadedAds(n,getResources().getString(R.string.photographer),getResources().getString(R.string.scientist));
                LoadedAds(n,getResources().getString(R.string.sister),getResources().getString(R.string.husband));
                LoadedAds(n,getResources().getString(R.string.motorcycle),getResources().getString(R.string.train));
                LoadedAds(n,getResources().getString(R.string.cat),getResources().getString(R.string.donkey));
                LoadedAds(n,getResources().getString(R.string.fox),getResources().getString(R.string.ostrich));
                LoadedAds(n,getResources().getString(R.string.wolf),getResources().getString(R.string.tortoise));
                LoadedAds(n,getResources().getString(R.string.may),getResources().getString(R.string.october));
                LoadedAds(n,getResources().getString(R.string.wednesday),getResources().getString(R.string.cauliflower));
                LoadedAds(n,getResources().getString(R.string.okra),getResources().getString(R.string.spinach));
                LoadedAds(n,getResources().getString(R.string.blueberry),getResources().getString(R.string.grape));
                LoadedAds(n,getResources().getString(R.string.olive),getResources().getString(R.string.strawberries));
                LoadedAds(n,getResources().getString(R.string.fan),getResources().getString(R.string.washing));
                LoadedAds(n,getResources().getString(R.string.summer),getResources().getString(R.string.autumn));











                Select(R.drawable.a, getResources().getString(R.string.a), n, getResources().getString(R.string.A));
                Select(R.drawable.b, getResources().getString(R.string.b), n, getResources().getString(R.string.B));
                Select(R.drawable.c, getResources().getString(R.string.c), n, getResources().getString(R.string.C));
                Select(R.drawable.d, getResources().getString(R.string.d), n, getResources().getString(R.string.D));
                Select(R.drawable.e, getResources().getString(R.string.e), n, getResources().getString(R.string.E));
                Select(R.drawable.f, getResources().getString(R.string.f), n, getResources().getString(R.string.F));
                Select(R.drawable.g, getResources().getString(R.string.g), n, getResources().getString(R.string.G));
                Select(R.drawable.h, getResources().getString(R.string.h), n, getResources().getString(R.string.H));
                Select(R.drawable.i, getResources().getString(R.string.i), n, getResources().getString(R.string.I));
                Select(R.drawable.j, getResources().getString(R.string.j), n, getResources().getString(R.string.J));
                Select(R.drawable.k, getResources().getString(R.string.k), n, getResources().getString(R.string.K));
                Select(R.drawable.l, getResources().getString(R.string.l), n, getResources().getString(R.string.L));
                Select(R.drawable.m, getResources().getString(R.string.m), n, getResources().getString(R.string.M));
                Select(R.drawable.n, getResources().getString(R.string.n), n, getResources().getString(R.string.N));
                Select(R.drawable.o, getResources().getString(R.string.o), n, getResources().getString(R.string.O));
                Select(R.drawable.p, getResources().getString(R.string.p), n, getResources().getString(R.string.P));
                Select(R.drawable.q, getResources().getString(R.string.q), n, getResources().getString(R.string.Q));
                Select(R.drawable.r, getResources().getString(R.string.r), n, getResources().getString(R.string.R));
                Select(R.drawable.s, getResources().getString(R.string.s), n, getResources().getString(R.string.S));
                Select(R.drawable.t, getResources().getString(R.string.t), n, getResources().getString(R.string.T));
                Select(R.drawable.u, getResources().getString(R.string.u), n, getResources().getString(R.string.U));
                Select(R.drawable.v, getResources().getString(R.string.v), n, getResources().getString(R.string.V));
                Select(R.drawable.w, getResources().getString(R.string.w), n, getResources().getString(R.string.W));
                Select(R.drawable.x, getResources().getString(R.string.x), n, getResources().getString(R.string.X));
                Select(R.drawable.y, getResources().getString(R.string.y), n, getResources().getString(R.string.Y));
                Select(R.drawable.z, getResources().getString(R.string.z), n, getResources().getString(R.string.Z));
                //numbers
                Select(R.drawable.zero, getResources().getString(R.string.ZERO), n, getResources().getString(R.string.zero));
                Select(R.drawable.one, getResources().getString(R.string.ONE), n, getResources().getString(R.string.one));
                Select(R.drawable.tow, getResources().getString(R.string.TOW), n, getResources().getString(R.string.tow));
                Select(R.drawable.three, getResources().getString(R.string.THREE), n, getResources().getString(R.string.three));
                Select(R.drawable.four, getResources().getString(R.string.FOUR), n, getResources().getString(R.string.four));
                Select(R.drawable.five, getResources().getString(R.string.FIVE), n, getResources().getString(R.string.five));
                Select(R.drawable.six, getResources().getString(R.string.SIX), n, getResources().getString(R.string.six));
                Select(R.drawable.seven, getResources().getString(R.string.SEVEN), n, getResources().getString(R.string.seven));
                Select(R.drawable.eight, getResources().getString(R.string.EIGHT), n, getResources().getString(R.string.eight));
                Select(R.drawable.nine, getResources().getString(R.string.NINE), n, getResources().getString(R.string.nine));
                Select(R.drawable.ten, getResources().getString(R.string.TEN), n, getResources().getString(R.string.ten));
                Select(R.drawable.eleven, getResources().getString(R.string.ELEVEN), n, getResources().getString(R.string.eleven));
                Select(R.drawable.twelve, getResources().getString(R.string.TWELVE), n, getResources().getString(R.string.twelve));
                Select(R.drawable.thirteen, getResources().getString(R.string.THIRTEEN), n, getResources().getString(R.string.thirteen));
                Select(R.drawable.fourteen, getResources().getString(R.string.FOURTEEN), n, getResources().getString(R.string.fourteen));
                Select(R.drawable.fifteen, getResources().getString(R.string.FIFTEEN), n, getResources().getString(R.string.fifteen));
                Select(R.drawable.sixteen, getResources().getString(R.string.SIXTEEN), n, getResources().getString(R.string.sixteen));
                Select(R.drawable.seventeen, getResources().getString(R.string.SEVENTEEN), n, getResources().getString(R.string.seventeen));
                Select(R.drawable.eighteen, getResources().getString(R.string.EIGHTEEN), n, getResources().getString(R.string.eighteen));
                Select(R.drawable.nineteen, getResources().getString(R.string.NINETEEN), n, getResources().getString(R.string.nineteen));
                Select(R.drawable.twenty, getResources().getString(R.string.TWENTY), n, getResources().getString(R.string.twenty));
                //countries

                Select(R.drawable.jordan, getResources().getString(R.string.JORDAN), n, getResources().getString(R.string.jordan));
                Select(R.drawable.emirates, getResources().getString(R.string.EMIRATES), n, getResources().getString(R.string.emirates));
                Select(R.drawable.eritrea, getResources().getString(R.string.ERITREA), n, getResources().getString(R.string.eritrea));
                Select(R.drawable.bahrain, getResources().getString(R.string.BAHRAIN), n, getResources().getString(R.string.bahrain));
                Select(R.drawable.algeria, getResources().getString(R.string.ALGERIA), n, getResources().getString(R.string.algeria));
                Select(R.drawable.saudi, getResources().getString(R.string.SAUDI), n, getResources().getString(R.string.saudi));
                Select(R.drawable.sudan, getResources().getString(R.string.SUDAN), n, getResources().getString(R.string.sudan));
                Select(R.drawable.somalia, getResources().getString(R.string.SOMALIA), n, getResources().getString(R.string.somalia));
                Select(R.drawable.iraq, getResources().getString(R.string.IRAQ), n, getResources().getString(R.string.iraq));
                Select(R.drawable.kuwait, getResources().getString(R.string.KUWAIT), n, getResources().getString(R.string.kuwait));
                Select(R.drawable.morocco, getResources().getString(R.string.MOROCCO), n, getResources().getString(R.string.morocco));
                Select(R.drawable.yemen, getResources().getString(R.string.YEMEN), n, getResources().getString(R.string.yemen));
                Select(R.drawable.tunisia, getResources().getString(R.string.TUNISIA), n, getResources().getString(R.string.tunisia));
                Select(R.drawable.djibouti, getResources().getString(R.string.DJIBOUTI), n, getResources().getString(R.string.djibouti));
                Select(R.drawable.syria, getResources().getString(R.string.SYRIA), n, getResources().getString(R.string.syria));
                Select(R.drawable.oman, getResources().getString(R.string.OMAN), n, getResources().getString(R.string.oman));
                Select(R.drawable.palestine, getResources().getString(R.string.PALESTINE), n, getResources().getString(R.string.palestine));
                Select(R.drawable.qatar, getResources().getString(R.string.QATAR), n, getResources().getString(R.string.qatar));
                Select(R.drawable.lebanon, getResources().getString(R.string.LEBANON), n, getResources().getString(R.string.lebanon));
                Select(R.drawable.libya, getResources().getString(R.string.LIBYA), n, getResources().getString(R.string.libya));
                Select(R.drawable.egypt, getResources().getString(R.string.EGYPT), n, getResources().getString(R.string.egypt));
                Select(R.drawable.mauritania, getResources().getString(R.string.MAURITANIA), n, getResources().getString(R.string.mauritania));


                //color

                Select(R.drawable.black, getResources().getString(R.string.BLACK), n, getResources().getString(R.string.black));
                Select(R.drawable.red, getResources().getString(R.string.RED), n, getResources().getString(R.string.red));
                Select(R.drawable.white, getResources().getString(R.string.WHITE), n, getResources().getString(R.string.white));
                Select(R.drawable.green, getResources().getString(R.string.GREEN), n, getResources().getString(R.string.green));
                Select(R.drawable.yellow, getResources().getString(R.string.YELLOW), n, getResources().getString(R.string.yellow));
                Select(R.drawable.grey, getResources().getString(R.string.GREY), n, getResources().getString(R.string.grey));
                Select(R.drawable.orange, getResources().getString(R.string.ORANGE), n, getResources().getString(R.string.orange));
                Select(R.drawable.purple, getResources().getString(R.string.PURPLE), n, getResources().getString(R.string.purple));
                Select(R.drawable.pink, getResources().getString(R.string.PINK), n, getResources().getString(R.string.pink));
                Select(R.drawable.blue, getResources().getString(R.string.BLUE), n, getResources().getString(R.string.blue));
                Select(R.drawable.braown, getResources().getString(R.string.BROUWN), n, getResources().getString(R.string.brouwn));


                //family

                Select(R.drawable.father, getResources().getString(R.string.FATHER), n, getResources().getString(R.string.father));
                Select(R.drawable.mother, getResources().getString(R.string.MOTHER), n, getResources().getString(R.string.mother));
                Select(R.drawable.brother, getResources().getString(R.string.BROTHER), n, getResources().getString(R.string.brother));
                Select(R.drawable.sister, getResources().getString(R.string.SISTER), n, getResources().getString(R.string.sister));
                Select(R.drawable.grandfather, getResources().getString(R.string.GRANDFATHER), n, getResources().getString(R.string.grandfather));
                Select(R.drawable.grandmother, getResources().getString(R.string.GRANDMOTHER), n, getResources().getString(R.string.grandmother));
                Select(R.drawable.son, getResources().getString(R.string.SON), n, getResources().getString(R.string.son));
                Select(R.drawable.daughter, getResources().getString(R.string.DAUGHTER), n, getResources().getString(R.string.daughter));
                Select(R.drawable.uncle, getResources().getString(R.string.UNCLE), n, getResources().getString(R.string.uncle));
                Select(R.drawable.aunt, getResources().getString(R.string.AUNT), n, getResources().getString(R.string.aunt));
                Select(R.drawable.husband, getResources().getString(R.string.HUSBAND), n, getResources().getString(R.string.husband));
                Select(R.drawable.wife, getResources().getString(R.string.WIFE), n, getResources().getString(R.string.wife));
                Select(R.drawable.cousin, getResources().getString(R.string.COUSIN), n, getResources().getString(R.string.cousin));


                //occupations

                Select(R.drawable.accountant, getResources().getString(R.string.ACCOUNTANT), n, getResources().getString(R.string.accountant));
                Select(R.drawable.actor, getResources().getString(R.string.ACTOR), n, getResources().getString(R.string.actor));
                Select(R.drawable.ambassador, getResources().getString(R.string.AMBASSADOR), n, getResources().getString(R.string.ambassador));
                Select(R.drawable.artist, getResources().getString(R.string.ARTIST), n, getResources().getString(R.string.artist));
                Select(R.drawable.baker, getResources().getString(R.string.BAKER), n, getResources().getString(R.string.baker));
                Select(R.drawable.barber, getResources().getString(R.string.BARBER), n, getResources().getString(R.string.barber));
                Select(R.drawable.carpenter, getResources().getString(R.string.CARPENTER), n, getResources().getString(R.string.carpenter));
                Select(R.drawable.chef, getResources().getString(R.string.CHEF), n, getResources().getString(R.string.chef));
                Select(R.drawable.doctor, getResources().getString(R.string.DOCTOR), n, getResources().getString(R.string.doctor));
                Select(R.drawable.driver, getResources().getString(R.string.DRIVER), n, getResources().getString(R.string.driver));
                Select(R.drawable.electrician, getResources().getString(R.string.ELECTRICIAN), n, getResources().getString(R.string.electrician));
                Select(R.drawable.engineer, getResources().getString(R.string.ENGINEER), n, getResources().getString(R.string.engineer));
                Select(R.drawable.jewellery, getResources().getString(R.string.JEWELLERY), n, getResources().getString(R.string.jewellery));
                Select(R.drawable.journalist, getResources().getString(R.string.JOURNALIST), n, getResources().getString(R.string.journalist));
                Select(R.drawable.judge, getResources().getString(R.string.JUDGE), n, getResources().getString(R.string.judge));
                Select(R.drawable.lawyer, getResources().getString(R.string.LAWYER), n, getResources().getString(R.string.lawyer));
                Select(R.drawable.mason, getResources().getString(R.string.MASON), n, getResources().getString(R.string.mason));
                Select(R.drawable.mechanical, getResources().getString(R.string.MECHANICAL), n, getResources().getString(R.string.mechanical));
                Select(R.drawable.merchant, getResources().getString(R.string.MERCHANT), n, getResources().getString(R.string.merchant));
                Select(R.drawable.nurse, getResources().getString(R.string.NURSE), n, getResources().getString(R.string.nurse));
                Select(R.drawable.painter, getResources().getString(R.string.PAINTER), n, getResources().getString(R.string.painter));
                Select(R.drawable.photographer, getResources().getString(R.string.PHOTOGRAPHER), n, getResources().getString(R.string.photographer));
                Select(R.drawable.pilot, getResources().getString(R.string.PILOT), n, getResources().getString(R.string.pilot));
                Select(R.drawable.poet, getResources().getString(R.string.POET), n, getResources().getString(R.string.poet));
                Select(R.drawable.policeman, getResources().getString(R.string.POLICEMAN), n, getResources().getString(R.string.policeman));
                Select(R.drawable.salesman, getResources().getString(R.string.SALESMAN), n, getResources().getString(R.string.salesman));
                Select(R.drawable.scientist, getResources().getString(R.string.SCIENTIST), n, getResources().getString(R.string.scientist));
                Select(R.drawable.secretary, getResources().getString(R.string.SECRETARY), n, getResources().getString(R.string.secretary));
                Select(R.drawable.smith, getResources().getString(R.string.SMITH), n, getResources().getString(R.string.smith));
                Select(R.drawable.surgeon, getResources().getString(R.string.SURGEON), n, getResources().getString(R.string.surgeon));
                Select(R.drawable.teacher, getResources().getString(R.string.TEACHER), n, getResources().getString(R.string.teacher));
                Select(R.drawable.weaver, getResources().getString(R.string.WEAVER), n, getResources().getString(R.string.weaver));
                Select(R.drawable.writer, getResources().getString(R.string.WRITER), n, getResources().getString(R.string.writer));


                //animals
                Select(R.drawable.ant, getResources().getString(R.string.ANT), n, getResources().getString(R.string.ant));
                Select(R.drawable.bear, getResources().getString(R.string.BEAR), n, getResources().getString(R.string.bear));
                Select(R.drawable.bee, getResources().getString(R.string.BEE), n, getResources().getString(R.string.bee));
                Select(R.drawable.camel, getResources().getString(R.string.CAMEL), n, getResources().getString(R.string.camel));
                Select(R.drawable.cat, getResources().getString(R.string.CAT), n, getResources().getString(R.string.cat));
                Select(R.drawable.chicken, getResources().getString(R.string.CHICKEN), n, getResources().getString(R.string.chicken));
                Select(R.drawable.cow, getResources().getString(R.string.COW), n, getResources().getString(R.string.cow));
                Select(R.drawable.crocodile, getResources().getString(R.string.CROCODILE), n, getResources().getString(R.string.crocodile));
                Select(R.drawable.deer, getResources().getString(R.string.DEER), n, getResources().getString(R.string.deer));
                Select(R.drawable.dinosaur, getResources().getString(R.string.DINOSAUR), n, getResources().getString(R.string.dinosaur));
                Select(R.drawable.dog, getResources().getString(R.string.DOG), n, getResources().getString(R.string.dog));
                Select(R.drawable.donkey, getResources().getString(R.string.DONKEY), n, getResources().getString(R.string.donkey));
                Select(R.drawable.dove, getResources().getString(R.string.DOVE), n, getResources().getString(R.string.dove));
                Select(R.drawable.eagle, getResources().getString(R.string.EAGLE), n, getResources().getString(R.string.eagle));
                Select(R.drawable.elephant, getResources().getString(R.string.ELEPHANT), n, getResources().getString(R.string.elephant));
                Select(R.drawable.falcon, getResources().getString(R.string.FALCON), n, getResources().getString(R.string.falcon));
                Select(R.drawable.fish, getResources().getString(R.string.FISH), n, getResources().getString(R.string.fish));
                Select(R.drawable.fox, getResources().getString(R.string.FOX), n, getResources().getString(R.string.fox));
                Select(R.drawable.horse, getResources().getString(R.string.HORSE), n, getResources().getString(R.string.horse));
                Select(R.drawable.kangaroo, getResources().getString(R.string.KANGAROO), n, getResources().getString(R.string.kangaroo));
                Select(R.drawable.leopard, getResources().getString(R.string.LEOPARD), n, getResources().getString(R.string.leopard));
                Select(R.drawable.lion, getResources().getString(R.string.LION), n, getResources().getString(R.string.lion));
                Select(R.drawable.monkey, getResources().getString(R.string.MONKEY), n, getResources().getString(R.string.monkey));
                Select(R.drawable.mouse, getResources().getString(R.string.MOUSE), n, getResources().getString(R.string.mouse));
                Select(R.drawable.ostrich, getResources().getString(R.string.OSTRICH), n, getResources().getString(R.string.ostrich));
                Select(R.drawable.owl, getResources().getString(R.string.OWL), n, getResources().getString(R.string.owl));
                Select(R.drawable.rabbit, getResources().getString(R.string.RABBIT), n, getResources().getString(R.string.rabbit));
                Select(R.drawable.shark, getResources().getString(R.string.SHARK), n, getResources().getString(R.string.shark));
                Select(R.drawable.sheep, getResources().getString(R.string.SHEEP), n, getResources().getString(R.string.sheep));
                Select(R.drawable.snake, getResources().getString(R.string.SNAKE), n, getResources().getString(R.string.snake));
                Select(R.drawable.sparrow, getResources().getString(R.string.SPARROW), n, getResources().getString(R.string.sparrow));
                Select(R.drawable.spider, getResources().getString(R.string.SPIDER), n, getResources().getString(R.string.spider));
                Select(R.drawable.squirrel, getResources().getString(R.string.SQUIRREL), n, getResources().getString(R.string.squirrel));
                Select(R.drawable.tiger, getResources().getString(R.string.TIGER), n, getResources().getString(R.string.tiger));
                Select(R.drawable.wolf, getResources().getString(R.string.WOLF), n, getResources().getString(R.string.wolf));
                Select(R.drawable.bat,getResources().getString(R.string.BAT),n,getResources().getString(R.string.bat));
                Select(R.drawable.giraffe,getResources().getString(R.string.GIRAFFE),n,getResources().getString(R.string.giraffe));
                Select(R.drawable.penguin,getResources().getString(R.string.PENGUIN),n,getResources().getString(R.string.penguin));
                Select(R.drawable.seal,getResources().getString(R.string.SEAL),n,getResources().getString(R.string.seal));
                Select(R.drawable.tortoise,getResources().getString(R.string.TORTOISE),n,getResources().getString(R.string.tortoise));


                //transportation


                Select(R.drawable.bicycle, getResources().getString(R.string.BICYCLE), n, getResources().getString(R.string.bicycle));
                Select(R.drawable.bus, getResources().getString(R.string.BUS), n, getResources().getString(R.string.bus));
                Select(R.drawable.car, getResources().getString(R.string.CAR), n, getResources().getString(R.string.car));
                Select(R.drawable.motorcycle, getResources().getString(R.string.MOTORCYCLE), n, getResources().getString(R.string.motorcycle));
                Select(R.drawable.plane, getResources().getString(R.string.PLANE), n, getResources().getString(R.string.plane));
                Select(R.drawable.ship, getResources().getString(R.string.SHIP), n, getResources().getString(R.string.ship));
                Select(R.drawable.spaceship, getResources().getString(R.string.SPACESHIP), n, getResources().getString(R.string.spaceship));
                Select(R.drawable.steamship, getResources().getString(R.string.STEAMSHIP), n, getResources().getString(R.string.steamship));
                Select(R.drawable.submarine, getResources().getString(R.string.SUBMARINE), n, getResources().getString(R.string.submarine));
                Select(R.drawable.subway, getResources().getString(R.string.SUBWAY), n, getResources().getString(R.string.subway));
                Select(R.drawable.train, getResources().getString(R.string.TRAIN), n, getResources().getString(R.string.train));


                //days

                Select(R.drawable.sunday, getResources().getString(R.string.SUNDAY), n, getResources().getString(R.string.sunday));
                Select(R.drawable.monday, getResources().getString(R.string.MONDAY), n, getResources().getString(R.string.monday));
                Select(R.drawable.tuesday, getResources().getString(R.string.TUESDAY), n, getResources().getString(R.string.tuesday));
                Select(R.drawable.wednesday, getResources().getString(R.string.WEDNESDAY), n, getResources().getString(R.string.wednesday));
                Select(R.drawable.thursday, getResources().getString(R.string.THURSDAY), n, getResources().getString(R.string.thursday));
                Select(R.drawable.friday, getResources().getString(R.string.FRIDAY), n, getResources().getString(R.string.friday));
                Select(R.drawable.saturday, getResources().getString(R.string.SATURDAY), n, getResources().getString(R.string.saturday));


                //months

                Select(R.drawable.january, getResources().getString(R.string.JANUARY), n, getResources().getString(R.string.january));
                Select(R.drawable.february, getResources().getString(R.string.FEBRUARY), n, getResources().getString(R.string.february));
                Select(R.drawable.march, getResources().getString(R.string.MARCH), n, getResources().getString(R.string.march));
                Select(R.drawable.april, getResources().getString(R.string.APRIL), n, getResources().getString(R.string.april));
                Select(R.drawable.may, getResources().getString(R.string.MAY), n, getResources().getString(R.string.may));
                Select(R.drawable.june, getResources().getString(R.string.JUNE), n, getResources().getString(R.string.june));
                Select(R.drawable.july, getResources().getString(R.string.JULY), n, getResources().getString(R.string.july));
                Select(R.drawable.august, getResources().getString(R.string.AUGUST), n, getResources().getString(R.string.august));
                Select(R.drawable.september, getResources().getString(R.string.SEPTEMBER), n, getResources().getString(R.string.september));
                Select(R.drawable.october, getResources().getString(R.string.OCTOBER), n, getResources().getString(R.string.october));
                Select(R.drawable.november, getResources().getString(R.string.NOVEMBER), n, getResources().getString(R.string.november));
                Select(R.drawable.december, getResources().getString(R.string.DECEMBER), n, getResources().getString(R.string.december));


                //////fruits

                Select(R.drawable.apple, getResources().getString(R.string.APPLE), n, getResources().getString(R.string.apple));
                Select(R.drawable.apricot, getResources().getString(R.string.APRICOT), n, getResources().getString(R.string.apricot));
                Select(R.drawable.avocado, getResources().getString(R.string.AVOCADO), n, getResources().getString(R.string.avocado));
                Select(R.drawable.banana, getResources().getString(R.string.BANANA), n, getResources().getString(R.string.banana));
                Select(R.drawable.blueberry, getResources().getString(R.string.BLUEBERRY), n, getResources().getString(R.string.blueberry));
                Select(R.drawable.carrots, getResources().getString(R.string.CARROTS), n, getResources().getString(R.string.carrots));
                Select(R.drawable.cherries, getResources().getString(R.string.CHERRIES), n, getResources().getString(R.string.cherries));
                Select(R.drawable.coconut, getResources().getString(R.string.COCONUT), n, getResources().getString(R.string.coconut));
                Select(R.drawable.dates, getResources().getString(R.string.DATES), n, getResources().getString(R.string.dates));
                Select(R.drawable.figs, getResources().getString(R.string.FIG), n, getResources().getString(R.string.fig));
                Select(R.drawable.grabes, getResources().getString(R.string.GRAPE), n, getResources().getString(R.string.grape));
                Select(R.drawable.kiwi, getResources().getString(R.string.KIWI), n, getResources().getString(R.string.kiwi));
                Select(R.drawable.lemon, getResources().getString(R.string.LEMON), n, getResources().getString(R.string.lemon));
                Select(R.drawable.melon, getResources().getString(R.string.MELON), n, getResources().getString(R.string.melon));
                Select(R.drawable.olives, getResources().getString(R.string.OLIVE), n, getResources().getString(R.string.olive));
                Select(R.drawable.orangee, getResources().getString(R.string.ORANGEE), n, getResources().getString(R.string.orangee));
                Select(R.drawable.peache, getResources().getString(R.string.PEACH), n, getResources().getString(R.string.peach));
                Select(R.drawable.pear, getResources().getString(R.string.PEAR), n, getResources().getString(R.string.pear));
                Select(R.drawable.ananas, getResources().getString(R.string.PINEAPPLE), n, getResources().getString(R.string.pineapple));
                Select(R.drawable.plum, getResources().getString(R.string.PLUM), n, getResources().getString(R.string.plum));
                Select(R.drawable.rman, getResources().getString(R.string.POMEGRANATE), n, getResources().getString(R.string.pomegranate));
                Select(R.drawable.quince, getResources().getString(R.string.QUINCE), n, getResources().getString(R.string.quince));
                Select(R.drawable.strawberries, getResources().getString(R.string.STRAWBERRIES), n, getResources().getString(R.string.strawberries));
                Select(R.drawable.watermelon, getResources().getString(R.string.WATERMELON), n, getResources().getString(R.string.watermelon));


                //vigit
                Select(R.drawable.aubergine, getResources().getString(R.string.AUBERGINE), n, getResources().getString(R.string.aubergine));
                Select(R.drawable.basil, getResources().getString(R.string.BASIL), n, getResources().getString(R.string.basil));
                Select(R.drawable.beans, getResources().getString(R.string.BEANS), n, getResources().getString(R.string.beans));
                Select(R.drawable.cauliflower, getResources().getString(R.string.CAULIFLOWER), n, getResources().getString(R.string.cauliflower));
                Select(R.drawable.celery, getResources().getString(R.string.CELERY), n, getResources().getString(R.string.celery));
                Select(R.drawable.cucumber, getResources().getString(R.string.CUCUMBER), n, getResources().getString(R.string.cucumber));
                Select(R.drawable.garlic, getResources().getString(R.string.GARLIC), n, getResources().getString(R.string.garlic));
                Select(R.drawable.lettuce, getResources().getString(R.string.LETTUCE), n, getResources().getString(R.string.lettuce));
                Select(R.drawable.okra, getResources().getString(R.string.OKRA), n, getResources().getString(R.string.okra));
                Select(R.drawable.onions, getResources().getString(R.string.ONIONS), n, getResources().getString(R.string.onions));
                Select(R.drawable.pepper, getResources().getString(R.string.PEPPER), n, getResources().getString(R.string.pepper));
                Select(R.drawable.ptato, getResources().getString(R.string.POTATO), n, getResources().getString(R.string.potato));
                Select(R.drawable.pumpkin, getResources().getString(R.string.PUMPKIN), n, getResources().getString(R.string.pumpkin));
                Select(R.drawable.spinach, getResources().getString(R.string.SPINACH), n, getResources().getString(R.string.spinach));
                Select(R.drawable.tmato, getResources().getString(R.string.TOMATOES), n, getResources().getString(R.string.tomatoes));
                Select(R.drawable.zucchini, getResources().getString(R.string.ZUCCHINI), n, getResources().getString(R.string.zucchini));

                //seasons
                Select(R.drawable.autumn, getResources().getString(R.string.AUTUMN), n, getResources().getString(R.string.autumn));
                Select(R.drawable.spring, getResources().getString(R.string.SPRING), n, getResources().getString(R.string.spring));
                Select(R.drawable.summer, getResources().getString(R.string.SUMMER), n, getResources().getString(R.string.summer));
                Select(R.drawable.winter, getResources().getString(R.string.WINTER), n, getResources().getString(R.string.winter));


                //Electrical

                Select(R.drawable.camera, getResources().getString(R.string.CAMERA), n, getResources().getString(R.string.camera));
                Select(R.drawable.computer, getResources().getString(R.string.COMPUTER), n, getResources().getString(R.string.computer));
                Select(R.drawable.conditioner, getResources().getString(R.string.CONDITIONER), n, getResources().getString(R.string.conditioner));
                Select(R.drawable.dryer, getResources().getString(R.string.DRYER), n, getResources().getString(R.string.dryer));
                Select(R.drawable.fan, getResources().getString(R.string.FAN), n, getResources().getString(R.string.fan));
                Select(R.drawable.fridge, getResources().getString(R.string.FRIDGE), n, getResources().getString(R.string.fridge));
                Select(R.drawable.heater, getResources().getString(R.string.HEATER), n, getResources().getString(R.string.heater));
                Select(R.drawable.lamp, getResources().getString(R.string.LAMP), n, getResources().getString(R.string.lamp));
                Select(R.drawable.tv, getResources().getString(R.string.TV), n, getResources().getString(R.string.tv));
                Select(R.drawable.vacuum, getResources().getString(R.string.VACUUM), n, getResources().getString(R.string.vacuum));
                Select(R.drawable.washing, getResources().getString(R.string.WASHING), n, getResources().getString(R.string.washing));
            }
        });
        listView.setAdapter(adapterClass);


    }

    private void Select(int ini, String mom, String g, String b) {

        if (g.equals(b)) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            MainFragment mainFragment = MainFragment.newInstance(ini, mom);
            fragmentTransaction.replace(R.id.cons, mainFragment);
            fragmentTransaction.commit();

        }


    }

    private void LoadedAds(String name,String sg,String bb){
        if (mInterstitialAd.isLoaded() && name==sg||name==bb){
            mInterstitialAd.show();
        }
    }
}


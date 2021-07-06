package com.haydertran.tranapps;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private MediaPlayer md = null;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private int mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }


    public static MainFragment newInstance(int param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        Button b = v.findViewById(R.id.but_back);
        TextView t = v.findViewById(R.id.tex_name);
        b.setBackgroundResource(mParam1);
        t.setText(mParam2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                StartMedia(R.raw.a, mParam1, R.drawable.a);
                StartMedia(R.raw.b, mParam1, R.drawable.b);
                StartMedia(R.raw.c, mParam1, R.drawable.c);
                StartMedia(R.raw.d, mParam1, R.drawable.d);
                StartMedia(R.raw.e, mParam1, R.drawable.e);
                StartMedia(R.raw.f, mParam1, R.drawable.f);
                StartMedia(R.raw.g, mParam1, R.drawable.g);
                StartMedia(R.raw.h, mParam1, R.drawable.h);
                StartMedia(R.raw.i, mParam1, R.drawable.i);
                StartMedia(R.raw.j, mParam1, R.drawable.j);
                StartMedia(R.raw.k, mParam1, R.drawable.k);
                StartMedia(R.raw.l, mParam1, R.drawable.l);
                StartMedia(R.raw.m, mParam1, R.drawable.m);
                StartMedia(R.raw.n, mParam1, R.drawable.n);
                StartMedia(R.raw.o, mParam1, R.drawable.o);
                StartMedia(R.raw.p, mParam1, R.drawable.p);
                StartMedia(R.raw.q, mParam1, R.drawable.q);
                StartMedia(R.raw.r, mParam1, R.drawable.r);
                StartMedia(R.raw.s, mParam1, R.drawable.s);
                StartMedia(R.raw.t, mParam1, R.drawable.t);
                StartMedia(R.raw.u, mParam1, R.drawable.u);
                StartMedia(R.raw.v, mParam1, R.drawable.v);
                StartMedia(R.raw.w, mParam1, R.drawable.w);
                StartMedia(R.raw.x, mParam1, R.drawable.x);
                StartMedia(R.raw.y, mParam1, R.drawable.y);
                StartMedia(R.raw.z, mParam1, R.drawable.z);
                //numbers
                StartMedia(R.raw.zero, mParam1, R.drawable.zero);
                StartMedia(R.raw.one, mParam1, R.drawable.one);
                StartMedia(R.raw.tow, mParam1, R.drawable.tow);
                StartMedia(R.raw.three, mParam1, R.drawable.three);
                StartMedia(R.raw.four, mParam1, R.drawable.four);
                StartMedia(R.raw.five, mParam1, R.drawable.five);
                StartMedia(R.raw.six, mParam1, R.drawable.six);
                StartMedia(R.raw.seven, mParam1, R.drawable.seven);
                StartMedia(R.raw.eight, mParam1, R.drawable.eight);
                StartMedia(R.raw.nine, mParam1, R.drawable.nine);
                StartMedia(R.raw.ten, mParam1, R.drawable.ten);
                StartMedia(R.raw.eleven, mParam1, R.drawable.eleven);
                StartMedia(R.raw.twelve, mParam1, R.drawable.twelve);
                StartMedia(R.raw.thirteen, mParam1, R.drawable.thirteen);
                StartMedia(R.raw.fourteen, mParam1, R.drawable.fourteen);
                StartMedia(R.raw.fifteen, mParam1, R.drawable.fifteen);
                StartMedia(R.raw.sixteen, mParam1, R.drawable.sixteen);
                StartMedia(R.raw.seventeen, mParam1, R.drawable.seventeen);
                StartMedia(R.raw.eighteen, mParam1, R.drawable.eighteen);
                StartMedia(R.raw.ninteen, mParam1, R.drawable.nineteen);
                StartMedia(R.raw.twenty, mParam1, R.drawable.twenty);


                //countries


                StartMedia(R.raw.jordan, mParam1, R.drawable.jordan);
                StartMedia(R.raw.emirates, mParam1, R.drawable.emirates);
                StartMedia(R.raw.eritrea, mParam1, R.drawable.eritrea);
                StartMedia(R.raw.bahrain, mParam1, R.drawable.bahrain);
                StartMedia(R.raw.algeria, mParam1, R.drawable.algeria);
                StartMedia(R.raw.the_kingdom_of_saudi_arabia, mParam1, R.drawable.saudi);
                StartMedia(R.raw.sudan, mParam1, R.drawable.sudan);
                StartMedia(R.raw.somalia, mParam1, R.drawable.somalia);
                StartMedia(R.raw.iraq, mParam1, R.drawable.iraq);
                StartMedia(R.raw.kuwait, mParam1, R.drawable.kuwait);
                StartMedia(R.raw.morocco, mParam1, R.drawable.morocco);
                StartMedia(R.raw.yemen, mParam1, R.drawable.yemen);
                StartMedia(R.raw.tunisia, mParam1, R.drawable.tunisia);
                StartMedia(R.raw.djibouti, mParam1, R.drawable.djibouti);
                StartMedia(R.raw.syria, mParam1, R.drawable.syria);
                StartMedia(R.raw.oman, mParam1, R.drawable.oman);
                StartMedia(R.raw.palestine, mParam1, R.drawable.palestine);
                StartMedia(R.raw.qatar, mParam1, R.drawable.qatar);
                StartMedia(R.raw.lebanon, mParam1, R.drawable.lebanon);
                StartMedia(R.raw.libya, mParam1, R.drawable.libya);
                StartMedia(R.raw.egypt, mParam1, R.drawable.egypt);
                StartMedia(R.raw.mauritania, mParam1, R.drawable.mauritania);


                //color

                StartMedia(R.raw.black, mParam1, R.drawable.black);
                StartMedia(R.raw.red, mParam1, R.drawable.red);
                StartMedia(R.raw.white, mParam1, R.drawable.white);
                StartMedia(R.raw.blue, mParam1, R.drawable.blue);
                StartMedia(R.raw.pink, mParam1, R.drawable.pink);
                StartMedia(R.raw.green, mParam1, R.drawable.green);
                StartMedia(R.raw.grey, mParam1, R.drawable.grey);
                StartMedia(R.raw.yellow, mParam1, R.drawable.yellow);
                StartMedia(R.raw.brouwn, mParam1, R.drawable.braown);
                StartMedia(R.raw.purple, mParam1, R.drawable.purple);
                StartMedia(R.raw.orange, mParam1, R.drawable.orange);


                //family

                StartMedia(R.raw.father, mParam1, R.drawable.father);
                StartMedia(R.raw.mother, mParam1, R.drawable.mother);
                StartMedia(R.raw.brother, mParam1, R.drawable.brother);
                StartMedia(R.raw.sister, mParam1, R.drawable.sister);
                StartMedia(R.raw.grandfather, mParam1, R.drawable.grandfather);
                StartMedia(R.raw.grandmother, mParam1, R.drawable.grandmother);
                StartMedia(R.raw.son, mParam1, R.drawable.son);
                StartMedia(R.raw.daughter, mParam1, R.drawable.daughter);
                StartMedia(R.raw.uncle, mParam1, R.drawable.uncle);
                StartMedia(R.raw.aunt, mParam1, R.drawable.aunt);
                StartMedia(R.raw.husband, mParam1, R.drawable.husband);
                StartMedia(R.raw.wife, mParam1, R.drawable.wife);
                StartMedia(R.raw.cousin, mParam1, R.drawable.cousin);


                //occupations

                StartMedia(R.raw.accountant, mParam1, R.drawable.accountant);
                StartMedia(R.raw.actor, mParam1, R.drawable.actor);
                StartMedia(R.raw.ambassador, mParam1, R.drawable.ambassador);
                StartMedia(R.raw.artist, mParam1, R.drawable.artist);
                StartMedia(R.raw.baker, mParam1, R.drawable.baker);
                StartMedia(R.raw.barber, mParam1, R.drawable.barber);
                StartMedia(R.raw.carpenter, mParam1, R.drawable.carpenter);
                StartMedia(R.raw.chef, mParam1, R.drawable.chef);
                StartMedia(R.raw.doctor, mParam1, R.drawable.doctor);
                StartMedia(R.raw.driver, mParam1, R.drawable.driver);
                StartMedia(R.raw.electrician, mParam1, R.drawable.electrician);
                StartMedia(R.raw.engineer, mParam1, R.drawable.engineer);
                StartMedia(R.raw.jeweler, mParam1, R.drawable.jewellery);
                StartMedia(R.raw.journalist, mParam1, R.drawable.journalist);
                StartMedia(R.raw.judge, mParam1, R.drawable.judge);
                StartMedia(R.raw.lawyer, mParam1, R.drawable.lawyer);
                StartMedia(R.raw.mason, mParam1, R.drawable.mason);
                StartMedia(R.raw.mechanistic, mParam1, R.drawable.mechanical);
                StartMedia(R.raw.merchant, mParam1, R.drawable.merchant);
                StartMedia(R.raw.nurse, mParam1, R.drawable.nurse);
                StartMedia(R.raw.painter, mParam1, R.drawable.painter);
                StartMedia(R.raw.photographer, mParam1, R.drawable.photographer);
                StartMedia(R.raw.pilot, mParam1, R.drawable.pilot);
                StartMedia(R.raw.poet, mParam1, R.drawable.poet);
                StartMedia(R.raw.policeman, mParam1, R.drawable.policeman);
                StartMedia(R.raw.salesman, mParam1, R.drawable.salesman);
                StartMedia(R.raw.scientist, mParam1, R.drawable.scientist);
                StartMedia(R.raw.secretary, mParam1, R.drawable.secretary);
                StartMedia(R.raw.smith, mParam1, R.drawable.smith);
                StartMedia(R.raw.surgeon, mParam1, R.drawable.surgeon);
                StartMedia(R.raw.teacher, mParam1, R.drawable.teacher);
                StartMedia(R.raw.weaver, mParam1, R.drawable.weaver);
                StartMedia(R.raw.writer, mParam1, R.drawable.writer);


                //animals

                StartMedia(R.raw.ant, mParam1, R.drawable.ant);
                StartMedia(R.raw.bear, mParam1, R.drawable.bear);
                StartMedia(R.raw.bee, mParam1, R.drawable.bee);
                StartMedia(R.raw.camel, mParam1, R.drawable.camel);
                StartMedia(R.raw.cat, mParam1, R.drawable.cat);
                StartMedia(R.raw.chicken, mParam1, R.drawable.chicken);
                StartMedia(R.raw.cow, mParam1, R.drawable.cow);
                StartMedia(R.raw.crocodile, mParam1, R.drawable.crocodile);
                StartMedia(R.raw.deer, mParam1, R.drawable.deer);
                StartMedia(R.raw.dinosaur, mParam1, R.drawable.dinosaur);
                StartMedia(R.raw.dog, mParam1, R.drawable.dog);
                StartMedia(R.raw.donkey, mParam1, R.drawable.donkey);
                StartMedia(R.raw.dove, mParam1, R.drawable.dove);
                StartMedia(R.raw.eagle, mParam1, R.drawable.eagle);
                StartMedia(R.raw.elephant, mParam1, R.drawable.elephant);
                StartMedia(R.raw.falcon, mParam1, R.drawable.falcon);
                StartMedia(R.raw.fish, mParam1, R.drawable.fish);
                StartMedia(R.raw.fox, mParam1, R.drawable.fox);
                StartMedia(R.raw.hourse, mParam1, R.drawable.horse);
                StartMedia(R.raw.kangaroo, mParam1, R.drawable.kangaroo);
                StartMedia(R.raw.leopard, mParam1, R.drawable.leopard);
                StartMedia(R.raw.lion, mParam1, R.drawable.lion);
                StartMedia(R.raw.monkey, mParam1, R.drawable.monkey);
                StartMedia(R.raw.mouse, mParam1, R.drawable.mouse);
                StartMedia(R.raw.ostrich, mParam1, R.drawable.ostrich);
                StartMedia(R.raw.owl, mParam1, R.drawable.owl);
                StartMedia(R.raw.rabbit, mParam1, R.drawable.rabbit);
                StartMedia(R.raw.shark, mParam1, R.drawable.shark);
                StartMedia(R.raw.sheep, mParam1, R.drawable.sheep);
                StartMedia(R.raw.snake, mParam1, R.drawable.snake);
                StartMedia(R.raw.sparrow, mParam1, R.drawable.sparrow);
                StartMedia(R.raw.spider, mParam1, R.drawable.spider);
                StartMedia(R.raw.squirrel, mParam1, R.drawable.squirrel);
                StartMedia(R.raw.tiger, mParam1, R.drawable.tiger);
                StartMedia(R.raw.wolf, mParam1, R.drawable.wolf);
                StartMedia(R.raw.bat,mParam1,R.drawable.bat);
                StartMedia(R.raw.giraffe,mParam1,R.drawable.giraffe);
                StartMedia(R.raw.penguin,mParam1,R.drawable.penguin);
                StartMedia(R.raw.seal,mParam1,R.drawable.seal);
                StartMedia(R.raw.tortoise,mParam1,R.drawable.tortoise);


                //transportation
                StartMedia(R.raw.bicycle, mParam1, R.drawable.bicycle);
                StartMedia(R.raw.bus, mParam1, R.drawable.bus);
                StartMedia(R.raw.car, mParam1, R.drawable.car);
                StartMedia(R.raw.motorcycle, mParam1, R.drawable.motorcycle);
                StartMedia(R.raw.plane, mParam1, R.drawable.plane);
                StartMedia(R.raw.ship, mParam1, R.drawable.ship);
                StartMedia(R.raw.spaceship, mParam1, R.drawable.spaceship);
                StartMedia(R.raw.steamship, mParam1, R.drawable.steamship);
                StartMedia(R.raw.submarine, mParam1, R.drawable.submarine);
                StartMedia(R.raw.subway, mParam1, R.drawable.subway);
                StartMedia(R.raw.train, mParam1, R.drawable.train);


                //days


                StartMedia(R.raw.sunday, mParam1, R.drawable.sunday);
                StartMedia(R.raw.monday, mParam1, R.drawable.monday);
                StartMedia(R.raw.tuesday, mParam1, R.drawable.tuesday);
                StartMedia(R.raw.wednesday, mParam1, R.drawable.wednesday);
                StartMedia(R.raw.thursday, mParam1, R.drawable.thursday);
                StartMedia(R.raw.friday, mParam1, R.drawable.friday);
                StartMedia(R.raw.saturday, mParam1, R.drawable.saturday);


                //months

                StartMedia(R.raw.january, mParam1, R.drawable.january);
                StartMedia(R.raw.february, mParam1, R.drawable.february);
                StartMedia(R.raw.march, mParam1, R.drawable.march);
                StartMedia(R.raw.april, mParam1, R.drawable.april);
                StartMedia(R.raw.may, mParam1, R.drawable.may);
                StartMedia(R.raw.june, mParam1, R.drawable.june);
                StartMedia(R.raw.july, mParam1, R.drawable.july);
                StartMedia(R.raw.august, mParam1, R.drawable.august);
                StartMedia(R.raw.september, mParam1, R.drawable.september);
                StartMedia(R.raw.october, mParam1, R.drawable.october);
                StartMedia(R.raw.november, mParam1, R.drawable.november);
                StartMedia(R.raw.december, mParam1, R.drawable.december);


                //fruits

                StartMedia(R.raw.apple, mParam1, R.drawable.apple);
                StartMedia(R.raw.apricot, mParam1, R.drawable.apricot);
                StartMedia(R.raw.avocado, mParam1, R.drawable.avocado);
                StartMedia(R.raw.banana, mParam1, R.drawable.banana);
                StartMedia(R.raw.blueberry, mParam1, R.drawable.blueberry);
                StartMedia(R.raw.carrots, mParam1, R.drawable.carrots);
                StartMedia(R.raw.cherries, mParam1, R.drawable.cherries);
                StartMedia(R.raw.coconut, mParam1, R.drawable.coconut);
                StartMedia(R.raw.dates, mParam1, R.drawable.dates);
                StartMedia(R.raw.figs, mParam1, R.drawable.figs);
                StartMedia(R.raw.grape, mParam1, R.drawable.grabes);
                StartMedia(R.raw.kiwi, mParam1, R.drawable.kiwi);
                StartMedia(R.raw.lemon, mParam1, R.drawable.lemon);
                StartMedia(R.raw.melon, mParam1, R.drawable.melon);
                StartMedia(R.raw.olive, mParam1, R.drawable.olives);
                StartMedia(R.raw.orangee, mParam1, R.drawable.orangee);
                StartMedia(R.raw.peache, mParam1, R.drawable.peache);
                StartMedia(R.raw.pear, mParam1, R.drawable.pear);
                StartMedia(R.raw.pineapple, mParam1, R.drawable.ananas);
                StartMedia(R.raw.plum, mParam1, R.drawable.plum);
                StartMedia(R.raw.pomegranate, mParam1, R.drawable.rman);
                StartMedia(R.raw.quince, mParam1, R.drawable.quince);
                StartMedia(R.raw.strawberries, mParam1, R.drawable.strawberries);
                StartMedia(R.raw.watermelon, mParam1, R.drawable.watermelon);

                //vigit

                StartMedia(R.raw.aubergine, mParam1, R.drawable.aubergine);
                StartMedia(R.raw.basil, mParam1, R.drawable.basil);
                StartMedia(R.raw.beans, mParam1, R.drawable.beans);
                StartMedia(R.raw.cauliflower, mParam1, R.drawable.cauliflower);
                StartMedia(R.raw.celery, mParam1, R.drawable.celery);
                StartMedia(R.raw.cucumber, mParam1, R.drawable.cucumber);
                StartMedia(R.raw.garlic, mParam1, R.drawable.garlic);
                StartMedia(R.raw.lettuce, mParam1, R.drawable.lettuce);
                StartMedia(R.raw.okra, mParam1, R.drawable.okra);
                StartMedia(R.raw.onions, mParam1, R.drawable.onions);
                StartMedia(R.raw.pepper, mParam1, R.drawable.pepper);
                StartMedia(R.raw.potato, mParam1, R.drawable.ptato);
                StartMedia(R.raw.pumpkin, mParam1, R.drawable.pumpkin);
                StartMedia(R.raw.spinach, mParam1, R.drawable.spinach);
                StartMedia(R.raw.tomatoes, mParam1, R.drawable.tmato);
                StartMedia(R.raw.zucchini, mParam1, R.drawable.zucchini);


                //seasons

                StartMedia(R.raw.autumn, mParam1, R.drawable.autumn);
                StartMedia(R.raw.spring, mParam1, R.drawable.spring);
                StartMedia(R.raw.summer, mParam1, R.drawable.summer);
                StartMedia(R.raw.winter, mParam1, R.drawable.winter);


                //Electrical
                StartMedia(R.raw.camera, mParam1, R.drawable.camera);
                StartMedia(R.raw.computer, mParam1, R.drawable.computer);
                StartMedia(R.raw.conditioner, mParam1, R.drawable.conditioner);
                StartMedia(R.raw.fan, mParam1, R.drawable.fan);
                StartMedia(R.raw.fridge, mParam1, R.drawable.fridge);
                StartMedia(R.raw.hairdryer, mParam1, R.drawable.dryer);
                StartMedia(R.raw.heater, mParam1, R.drawable.heater);
                StartMedia(R.raw.lamp, mParam1, R.drawable.lamp);
                StartMedia(R.raw.television, mParam1, R.drawable.tv);
                StartMedia(R.raw.vacuumcleaner, mParam1, R.drawable.vacuum);
                StartMedia(R.raw.washer, mParam1, R.drawable.washing);


            }
        });
        return v;
    }

    private void StartMedia(int t, int sound, int s) {
        if (sound == s) {
            MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), t);
            mediaPlayer.start();
        }
    }


}
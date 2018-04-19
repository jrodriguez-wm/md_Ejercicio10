package mx.com.webmaps.md_ejercicio10;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar_id);

        setSupportActionBar(toolbar);


        viewPager = (ViewPager) findViewById(R.id.viewPager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(),"");
        adapter.addFragment(new TwoFragment(),"");
        adapter.addFragment(new ThreeFragment(),"");
        /*adapter.addFragment(new FourFragment(),"ITEM FOUR");
        adapter.addFragment(new FiveFragment(),"ITEM FIVE");
        adapter.addFragment(new SixFragment(),"ITEM SIX");
        adapter.addFragment(new SevenFragment(),"ITEM SEVEN");
        adapter.addFragment(new EightFragment(),"ITEM EIGHT");
        adapter.addFragment(new NineFragment(),"ITEM NINE");
        adapter.addFragment(new TenFragment(),"ITEM TEN");*/

        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.email);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.map);

    }
}

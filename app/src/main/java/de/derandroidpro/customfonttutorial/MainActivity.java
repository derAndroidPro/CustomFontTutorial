package de.derandroidpro.customfonttutorial;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView tvheadline, tvdescription;
    Typeface schriftart_courier_prime, schriftart_sf_arch_rival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvheadline = (TextView) findViewById(R.id.tvheadline);
        tvdescription = (TextView) findViewById(R.id.tvdescription);

        schriftart_courier_prime = Typeface.createFromAsset(getAssets(), "schriftarten/courier_prime.ttf");
        tvdescription.setTypeface(schriftart_courier_prime);
        schriftart_sf_arch_rival = Typeface.createFromAsset(getAssets(), "schriftarten/sf_arch_rival.ttf");
        tvheadline.setTypeface(schriftart_sf_arch_rival);


    }


}

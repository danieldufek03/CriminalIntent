/**
 * I like this explanation of fragments
 *
 * "Fragments are of a UI benefit in my opinion. It's convenient for the user sometimes to see two
 * different views of two different classes on the same screen. If, in your moment of creativity,
 * you decide it would be nice to display your application with, say, a listView that takes up half
 * the screen and a webView that takes up the other half - so that when you click on a list item in
 * fragment A it passes an intent to the webView in fragment B, and suddenly you see what you just
 * clicked without the app switching activities - then you could use a fragment. That's just an example
 * I came up with off the top of my head."
 *
 * -Taken from Stack Overflow
 * http://stackoverflow.com/questions/8597769/when-should-i-use-fragments-in-android-applications-why-to-use-fragments
 */
package com.example.daniel.criminalintent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
        }//end of onCreate

    }


package com.example.cookieclicker;

import static com.example.cookieclicker.MainActivity.getCookiePerClick;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class CookieFragment extends Fragment {

    public CookieFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private TextView textView3;
    private TextView textView2;
    private double clickWorth = 1;
    private TextView textViewTitle;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView3 = getView().findViewById(R.id.textView3);
        textView2 = getView().findViewById(R.id.textView2);
        textViewTitle = getView().findViewById(R.id.textViewTitle);
        updateCookieCounter();
        updateCookiePerSecond();
        ImageView imageView = getView().findViewById(R.id.imageView3);
        imageView.setOnClickListener(this::updateCookiesClick);
        textViewTitle.setOnClickListener(this::updateCookiesClickDev);
    }

    public void setClickWorth(double clickWorth) {
        this.clickWorth = clickWorth;
    }

    public double getClickWorth() {
        return clickWorth;
    }


    void updateCookieCounter() {
        textView3.setText(MainActivity.changeCookieToString((int) Math.floor(MainActivity.getCookieCounter())) +" cookies");

    }

    public void updateCookiesClick(View getview){
        MainActivity.setCookieCounter((int) (MainActivity.getCookieCounter() + getCookiePerClick()));
        MainActivity.setAllTimeCookies((int) MainActivity.getAllTimeCookies()+getCookiePerClick());
        updateCookieCounter();
    }

    public void updateCookiesClickDev(View getview){
        MainActivity.setCookieCounter((int) (MainActivity.getCookieCounter() + 1100100));
        MainActivity.setAllTimeCookies((int) MainActivity.getAllTimeCookies()+1100100);
        updateCookieCounter();
    }

    private void updateCookiePerSecond(){
        if (MainActivity.getCookiePerClick() != 0){
        textView2.setText(MainActivity.changeCookieToString(MainActivity.getCookiesPerSecond()) + "/s");
        } else {
            textView2.setText("0/s");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cookie, container, false);
    }

}
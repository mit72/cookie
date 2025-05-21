package com.example.cookieclicker;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;
import java.util.Timer;
import java.text.DecimalFormat;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    private static double cookieCounter = 0;
    private static double cookiesPerSecond = 0;
    private static double cookiePerClick = 1;
    private static double allTimeCookies = 0;
    private static int cursors = 0;
    private static int grandmas = 0;
    private static int gardens = 0;
    private static int mines = 0;
    private static int factories = 0;
    private static int banks = 0;
    private static int temples = 0;
    private static BigDecimal cursorPrice = new BigDecimal("15");
    private static BigDecimal grandmaPrice = new BigDecimal("100");
    private static BigDecimal gardenPrice = new BigDecimal("1100");
    private static BigDecimal minePrice = new BigDecimal("12000");
    private static BigDecimal factoryPrice = new BigDecimal("130000");
    private static BigDecimal bankPrice = new BigDecimal("1400000");
    private static BigDecimal templePrice = new BigDecimal("20000000");
    static Stack<BigDecimal> cursorPriceHistory = new Stack<>();
    static Stack<BigDecimal> grandmaPriceHistory = new Stack<>();
    static Stack<BigDecimal> gardenPriceHistory = new Stack<>();
    static Stack<BigDecimal> minePriceHistory = new Stack<>();
    static Stack<BigDecimal> factoryPriceHistory = new Stack<>();
    static Stack<BigDecimal> bankPriceHistory = new Stack<>();
    static Stack<BigDecimal> templePriceHistory = new Stack<>();

     Timer timer = new Timer();

    // Declare the navListener outside of onCreate
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    int id = item.getItemId();

                    if (id == R.id.cookie) {
                        selectedFragment = new CookieFragment();
                    } else if (id == R.id.store) {
                        selectedFragment = new StoreFragment();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, selectedFragment).commit();

                    return true;
                }
            };

    public static BigDecimal calculateNewBuyPrice(BigDecimal currentPrice) {
        return currentPrice.multiply(new BigDecimal("1.15"))
                .setScale(0, RoundingMode.UP);
    }

    public static BigDecimal calculateSellRefund(BigDecimal currentPrice) {
        return currentPrice.multiply(new BigDecimal("0.25"))
                .setScale(0, RoundingMode.DOWN);
    }

    public static BigDecimal updatePrice(BigDecimal currentPrice) {
        return currentPrice.multiply(new BigDecimal("1.15")); // 15% increase
    }

    public static BigDecimal returnSellGain(BigDecimal currentPrice) {
        return currentPrice.multiply(new BigDecimal("0.85")); // 85% refund
    }

    public static BigDecimal  getCursorPrice() {
        return cursorPrice;
    }
    public static void setCursorPrice(BigDecimal  cursorPrice) {
        MainActivity.cursorPrice = cursorPrice;
    }
    public static BigDecimal  getGrandmaPrice() {
        return grandmaPrice;
    }
    public static void setGrandmaPrice(BigDecimal  grandmaPrice) {
        MainActivity.grandmaPrice = grandmaPrice;
    }
    public static BigDecimal  getGardenPrice() {
        return gardenPrice;
    }
    public static void setGardenPrice(BigDecimal  gardenPrice) {
        MainActivity.gardenPrice = gardenPrice;
        }
    public static BigDecimal  getMinePrice() {
        return minePrice;
    }
    public static void setMinePrice(BigDecimal  minePrice) {
        MainActivity.minePrice = minePrice;
    }
    public static BigDecimal  getFactoryPrice() {
        return factoryPrice;
    }
    public static void setFactoryPrice(BigDecimal  factoryPrice) {
        MainActivity.factoryPrice = factoryPrice;
    }
    public static BigDecimal  getBankPrice() {
        return bankPrice;
    }
    public static void setBankPrice(BigDecimal  bankPrice) {
        MainActivity.bankPrice = bankPrice;
    }
    public static BigDecimal  getTemplePrice() {
        return templePrice;
        }
    public static void setTemplePrice(BigDecimal  templePrice) {
        MainActivity.templePrice = templePrice;
    }

    public static double getAllTimeCookies() {
        return allTimeCookies;
    }
    public static void setAllTimeCookies(double allTimeCookies) {
        MainActivity.allTimeCookies = allTimeCookies;
    }
    public static int getCursors() {
        return cursors;
    }
    public static void setCursors(int cursors) {
        MainActivity.cursors = cursors;
    }
    public static int getGrandmas() {
        return grandmas;
    }
    public static void setGrandmas(int grandmas) {
        MainActivity.grandmas = grandmas;
    }
    public static int getGardens() {
        return gardens;
    }
    public static void setGardens(int gardens) {
        MainActivity.gardens = gardens;
    }
    public static int getMines() {
        return mines;
    }
    public static void setMines(int mines) {
        MainActivity.mines = mines;
    }
    public static int getFactories() {
        return factories;
    }
    public static void setFactories(int factories) {
        MainActivity.factories = factories;
    }
    public static int getBanks() {
        return banks;
    }
    public static void setBanks(int banks) {
        MainActivity.banks = banks;
    }
    public static int getTemples() {
        return temples;
    }
    public static void setTemples(int temples) {
        MainActivity.temples = temples;
    }

    public static double getCookiesPerSecond() {
        return cookiesPerSecond;
    }

    public static void setCookiesPerSecond(double cookiesPerSecond) {
        MainActivity.cookiesPerSecond = cookiesPerSecond;
    }

    public static double getCookiePerClick() {
        return cookiePerClick;
    }

    public static void setCookiePerClick(double cookiePerClick) {
        MainActivity.cookiePerClick = cookiePerClick;
    }

    public static double getCookieCounter() {
        return cookieCounter;
    }

    public static String changeCookieToString(int cookie) {
        int point;
        if (cookie >= 1000 && cookie < 1000000) {
            point = cookie % 1000;
            point /= 10;
            return cookie/1000+ "." + point + "K";
        } else if (cookie >= 1000000) {
            point = cookie % 1000000;
            point /= 10000;
            return cookie/1000000+ "." + point + "M";
        } else {
            return cookie +"";
        }
    }

    public static String changeCookieToString(BigDecimal cookie) {
        BigDecimal thousand = new BigDecimal("1000");
        BigDecimal million = new BigDecimal("1000000");

        if (cookie.compareTo(thousand) >= 0 && cookie.compareTo(million) < 0) {
            BigDecimal divided = cookie.divide(thousand, 2, RoundingMode.HALF_UP);
            return divided + "K";
        } else if (cookie.compareTo(million) >= 0) {
            BigDecimal divided = cookie.divide(million, 2, RoundingMode.HALF_UP);
            return divided + "M";
        } else {
            return cookie.stripTrailingZeros().toPlainString();
        }
    }

    public static String changeCookieToString(double cookie) {
        double point = 0;
        DecimalFormat df = new DecimalFormat("#.#");
        DecimalFormat df2 = new DecimalFormat("#.##");
        if (cookie >= 1000 && cookie < 1000000) {
            cookie = cookie/1000;
            return df2.format(cookie)+ "K";
        } else if (cookie >= 1000000) {
            cookie = cookie/1000000;
            return df2.format(cookie)+ "M";
        } else {
            return df.format(cookie);
        }
    }


    public static BigDecimal updatePriceRounded(BigDecimal currentPrice) {
        BigDecimal increasedPrice = currentPrice.multiply(new BigDecimal("1.15"));
        return increasedPrice.setScale(0, RoundingMode.UP); 
    }

    public static BigDecimal returnSellGainRounded(BigDecimal currentPrice) {
        BigDecimal refund = currentPrice.multiply(new BigDecimal("0.25"));
        return refund.setScale(0, RoundingMode.DOWN); 
    }

    public void updateCookieCounter() {
            double cookies = MainActivity.getCookieCounter();
    }

    public static void setCookieCounter(int counter) {
        cookieCounter = counter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        allTimeCookies = allTimeCookies + cookieCounter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(
                    R.id.frameLayout, new CookieFragment()).commit();
        }

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cookieCounter += cookiesPerSecond/10;
                allTimeCookies += cookiesPerSecond/10;
                runOnUiThread(() -> {


                    Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);
                    if (fragment instanceof CookieFragment) {
                        ((CookieFragment) fragment).updateCookieCounter();
                    } else if (fragment instanceof StoreFragment) {
                        ((StoreFragment) fragment).updateCookieCounter();
                    }
                });
            }
        }, 0, 100);
    }
}

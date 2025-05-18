package com.example.cookieclicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.BreakIterator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StoreFragment newInstance(String param1, String param2) {
        StoreFragment fragment = new StoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store, container, false);
    }
    private TextView textViewCookie;
    private Button buttonCursorBuy;
    private Button buttonCursorSell;
    private Button buttonGrandmaBuy;
    private Button buttonGrandmaSell;
    private Button buttonGardenBuy;
    private Button buttonGardenSell;
    private Button buttonMineBuy;
    private Button buttonMineSell;
    private Button buttonFactoryBuy;
    private Button buttonFactorySell;
    private Button buttonBankBuy;
    private Button buttonBankSell;
    private Button buttonTempleBuy;
    private Button buttonTempleSell;
    private TextView textViewCursor;
    private TextView textViewGrandma;
    private TextView textViewGarden;
    private TextView textViewMine;
    private TextView textViewFactory;
    private TextView textViewBank;
    private TextView textViewTemple;
    private TextView textView6;
    private TextView textView2;
    private TextView textView1;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private ImageView imageViewGrandma;
    private ImageView imageViewGarden;
    private ImageView imageViewMine;
    private ImageView imageViewFactory;
    private ImageView imageViewBank;
    private ImageView imageViewTemple;

    /* debug */
    private TextView cookieText;

    private void updateAllButtonStates() {
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());

        buttonCursorBuy.setEnabled(cookies.compareTo(MainActivity.getCursorPrice()) >= 0);
        if (MainActivity.getCursors() == 0) {
            buttonCursorSell.setEnabled(false);
        }


        buttonGrandmaBuy.setEnabled(cookies.compareTo(MainActivity.getGrandmaPrice()) >= 0);
        if (MainActivity.getGrandmas() == 0) {
            buttonGrandmaSell.setEnabled(false);
        }
        buttonGardenBuy.setEnabled(cookies.compareTo(MainActivity.getGardenPrice()) >= 0);
        if (MainActivity.getGardens() == 0) {
            buttonGardenSell.setEnabled(false);
        }

        buttonMineBuy.setEnabled(cookies.compareTo(MainActivity.getMinePrice()) >= 0);
        if (MainActivity.getMines() == 0) {
            buttonMineSell.setEnabled(false);
        }
        buttonFactoryBuy.setEnabled(cookies.compareTo(MainActivity.getFactoryPrice()) >= 0);
        if (MainActivity.getFactories() == 0) {
            buttonFactorySell.setEnabled(false);
        }

        buttonBankBuy.setEnabled(cookies.compareTo(MainActivity.getBankPrice()) >= 0);
        if (MainActivity.getBanks() == 0) {
            buttonBankSell.setEnabled(false);
        }
        buttonTempleBuy.setEnabled(cookies.compareTo(MainActivity.getTemplePrice()) >= 0);
        if (MainActivity.getTemples() == 0) {
            buttonTempleSell.setEnabled(false);
        }


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView2 = getView().findViewById(R.id.textView2);
        textView1 = getView().findViewById(R.id.textView1);
        textView8 = getView().findViewById(R.id.textView8);
        textView9 = getView().findViewById(R.id.textView9);
        textView10 = getView().findViewById(R.id.textView10);
        textView11 = getView().findViewById(R.id.textView11);
        textView13 = getView().findViewById(R.id.textView13);
        textView6 = getView().findViewById(R.id.textView6);
        textViewCursor = getView().findViewById(R.id.textViewCursor);
        textViewGrandma = getView().findViewById(R.id.textViewGrandma);
        textViewGarden = getView().findViewById(R.id.textViewGarden);
        textViewMine = getView().findViewById(R.id.textViewMine);
        textViewFactory = getView().findViewById(R.id.textViewFactory);
        textViewBank = getView().findViewById(R.id.textViewBank);
        textViewTemple = getView().findViewById(R.id.textViewTemple);
        buttonCursorBuy = getView().findViewById(R.id.buttonCursorBuy);
        buttonCursorSell = getView().findViewById(R.id.buttonCursorSell);
        buttonGrandmaBuy = getView().findViewById(R.id.buttonGrandmaBuy);
        buttonGrandmaSell = getView().findViewById(R.id.buttonGrandmaSell);
        buttonGardenBuy = getView().findViewById(R.id.buttonGardenBuy);
        buttonGardenSell = getView().findViewById(R.id.buttonGardenSell);
        buttonMineBuy = getView().findViewById(R.id.buttonMineBuy);
        buttonMineSell = getView().findViewById(R.id.buttonMineSell);
        buttonFactoryBuy = getView().findViewById(R.id.buttonFactoryBuy);
        buttonFactorySell = getView().findViewById(R.id.buttonFactorySell);
        buttonBankBuy = getView().findViewById(R.id.buttonBankBuy);
        buttonBankSell = getView().findViewById(R.id.buttonBankSell);
        buttonTempleBuy = getView().findViewById(R.id.buttonTempleBuy);
        buttonTempleSell = getView().findViewById(R.id.buttonTempleSell);
        textViewCookie = getView().findViewById(R.id.textView13);
        textViewCursor.setText(MainActivity.getCursors() + " Cursors");
        buttonCursorBuy.setText(spannableStringMethod("Buy for", MainActivity.getCursorPrice()));
        imageViewGrandma = getView().findViewById(R.id.imageViewGrandma);
        imageViewGarden = getView().findViewById(R.id.imageViewGarden);
        imageViewMine = getView().findViewById(R.id.imageViewMine);
        imageViewFactory = getView().findViewById(R.id.imageViewFactory);
        imageViewBank = getView().findViewById(R.id.imageViewBank);
        imageViewTemple = getView().findViewById(R.id.imageViewTemple);
        //debug
        cookieText = getView().findViewById(R.id.allCookies);
        cookieText.setVisibility(View.INVISIBLE);

        if (MainActivity.getAllTimeCookies() > 100) {
            textViewGrandma.setText(MainActivity.getGrandmas() + " Grandmas");
            buttonGrandmaBuy.setText(spannableStringMethod("Buy for", MainActivity.getGrandmaPrice()));
        } else {
            textViewGrandma.setText("???");
            textView2.setText("???");
            buttonGrandmaBuy.setEnabled(false);
            imageViewGrandma.setImageResource(R.drawable.grandmablank);
        }

        if (MainActivity.getAllTimeCookies() > 1100) {
            textViewGarden.setText(MainActivity.getGardens() + " Gardens");
            buttonGardenBuy.setText(spannableStringMethod("Buy for", MainActivity.getGardenPrice()));
        } else {
            textViewGarden.setText("???");
            textView1.setText("???");
            buttonGardenBuy.setEnabled(false);
            imageViewGarden.setImageResource(R.drawable.gardenblank);
        }

        if (MainActivity.getAllTimeCookies() > 12000) {
            textViewMine.setText(MainActivity.getMines() + " Mines");
            buttonMineBuy.setText(spannableStringMethod("Buy for", MainActivity.getMinePrice()));
        } else {
            textViewMine.setText("???");
            textView8.setText("???");
            imageViewMine.setImageResource(R.drawable.mineblank);
            buttonMineBuy.setEnabled(false);
        }
        if (MainActivity.getAllTimeCookies() > 130000) {
            textViewFactory.setText(MainActivity.getFactories() + " Factories");
            buttonFactoryBuy.setText(spannableStringMethod("Buy for", MainActivity.getFactoryPrice()));
        } else {
            textViewFactory.setText("???");
            textView9.setText("???");
            buttonFactoryBuy.setEnabled(false);
            imageViewFactory.setImageResource(R.drawable.factoryblank);
        }
        if (MainActivity.getAllTimeCookies() > 1400000) {
            textViewBank.setText(MainActivity.getBanks() + " Banks");
            buttonBankBuy.setText(spannableStringMethod("Buy for", MainActivity.getBankPrice()));

        } else{
            textViewBank.setText("???");
            textView10.setText("???");
            buttonBankBuy.setEnabled(false);
            imageViewBank.setImageResource(R.drawable.bankblank);
        }
        if (MainActivity.getAllTimeCookies() > 20000000) {
            textViewTemple.setText(MainActivity.getTemples() + " Tempels");
            buttonTempleBuy.setText(spannableStringMethod("Buy for", MainActivity.getTemplePrice()));
        } else {
            textViewTemple.setText("???");
            textView11.setText("???");
            buttonTempleBuy.setEnabled(false);
            imageViewTemple.setImageResource(R.drawable.templeblank);
        }


        buttonCursorBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateCursorBuy();
                textViewCursor.setText(MainActivity.getCursors() + " Cursors");
            }
        });

        buttonCursorSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateCursorSell();
                textViewCursor.setText(MainActivity.getCursors() + " Cursors");
            }
        });

        buttonGrandmaBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateGrandmaBuy();
                textViewGrandma.setText(MainActivity.getGrandmas() + " Grandmas");
            }
        });

        buttonGrandmaSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateGrandmaSell();
                textViewGrandma.setText(MainActivity.getGrandmas() + " Grandmas");
            }
        });

        buttonGardenBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateGardenBuy();
                textViewGarden.setText(MainActivity.getGardens() + " Gardens");
            }
        });
        buttonGardenSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateGardenSell();
                textViewGarden.setText(MainActivity.getGardens() + " Gardens");
                }
        });

        buttonMineBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateMineBuy();
                textViewMine.setText(MainActivity.getMines() + " Mines");
            }
            });
        buttonMineSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateMineSell();
                textViewMine.setText(MainActivity.getMines() + " Mines");
            }
        });
        buttonFactoryBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFactoryBuy();
                textViewFactory.setText(MainActivity.getFactories() + " Factories");
            }
            });
        buttonFactorySell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFactorySell();
                textViewFactory.setText(MainActivity.getFactories() + " Factories");
            }
        });
        buttonBankBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBankBuy();
                textViewBank.setText(MainActivity.getBanks() + " Banks");
            }
            });
        buttonBankSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBankSell();
                textViewBank.setText(MainActivity.getBanks() + " Banks");
            }
        });

        buttonTempleBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTempleBuy();
                textViewTemple.setText(MainActivity.getTemples() + " Tempels");
            }
            });
        buttonTempleSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTempleSell();
                textViewTemple.setText(MainActivity.getTemples() + " Tempels");
            }
        });

        if (MainActivity.getCursors() == 0){
            buttonCursorSell.setEnabled(false);
        }
        if (MainActivity.getGrandmas() == 0){
            buttonGrandmaSell.setEnabled(false);
        }
        if (MainActivity.getGardens() == 0){
            buttonGardenSell.setEnabled(false);
        }
        if (MainActivity.getMines() == 0){
            buttonMineSell.setEnabled(false);
        }
        if (MainActivity.getFactories() == 0){
            buttonFactorySell.setEnabled(false);
        }
        if (MainActivity.getBanks() == 0) {
            buttonBankSell.setEnabled(false);
        }
        if (MainActivity.getTemples() == 0) {
            buttonTempleSell.setEnabled(false);
        }


        textViewCookie.setText(MainActivity.changeCookieToString(((int) MainActivity.getCookieCounter()))+ " cookies");
    }

    public SpannableString spannableStringMethod(String buy, BigDecimal price) {
        buy = buy + " " + MainActivity.changeCookieToString(price);
        SpannableString spannableString = new SpannableString(buy + " ");

        Drawable cookieMoney = ContextCompat.getDrawable(getContext(), R.drawable.minicookie);
        cookieMoney.setBounds(0, 0, 40, 40);
        ImageSpan imgSpan = new ImageSpan(cookieMoney, ImageSpan.ALIGN_BASELINE);

        spannableString.setSpan(
                imgSpan,
                buy.length(),
                buy.length() + 1,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE
        );
        return spannableString;
    }

    private BigDecimal returnSellGain(BigDecimal buyPrice) {
        return buyPrice.multiply(new BigDecimal("0.25"));
    }

    /* sell methods*/
    private void updateCursorSell() {

        if (MainActivity.getCursors() <= 0 || MainActivity.cursorPriceHistory.isEmpty()) {//
            buttonCursorSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getCursorPrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());//
        MainActivity.setCursors(MainActivity.getCursors() - 1);
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 0.1);
        BigDecimal previousPrice = MainActivity.cursorPriceHistory.pop();
        MainActivity.setCursorPrice(previousPrice);
        buttonCursorBuy.setText(spannableStringMethod("Buy for", previousPrice));
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonCursorSell.setText(spannableStringMethod("Sell for", newSellPrice));
        if (MainActivity.getCursors() == 0) {
            buttonCursorSell.setEnabled(false);
            buttonCursorSell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateGrandmaSell() {

        if (MainActivity.getGrandmas() <= 0 || MainActivity.grandmaPriceHistory.isEmpty()) {//
            buttonGrandmaSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getGrandmaPrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setGrandmas(MainActivity.getGrandmas() - 1);//
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 1);//
        BigDecimal previousPrice = MainActivity.grandmaPriceHistory.pop();//
        MainActivity.setGrandmaPrice(previousPrice);//
        buttonGrandmaBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonGrandmaSell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getGrandmas() == 0) {//
            buttonGrandmaSell.setEnabled(false);//
            buttonGrandmaSell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateGardenSell() {

        if (MainActivity.getGardens() <= 0 || MainActivity.gardenPriceHistory.isEmpty()) {//
            buttonGardenSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getGardenPrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setGardens(MainActivity.getGardens() - 1);//
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 8);//
        BigDecimal previousPrice = MainActivity.gardenPriceHistory.pop();//
        MainActivity.setGardenPrice(previousPrice);//
        buttonGardenBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonGardenSell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getGardens() == 0) {//
            buttonGardenSell.setEnabled(false);//
            buttonGardenSell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateMineSell() {

        if (MainActivity.getMines() <= 0 || MainActivity.minePriceHistory.isEmpty()) {//
            buttonMineSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getMinePrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setMines(MainActivity.getMines() - 1);//
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 47);//
        BigDecimal previousPrice = MainActivity.minePriceHistory.pop();//
        MainActivity.setMinePrice(previousPrice);//
        buttonMineBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonMineSell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getMines() == 0) {//
            buttonMineSell.setEnabled(false);//
            buttonMineSell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateFactorySell() {

        if (MainActivity.getFactories() <= 0 || MainActivity.factoryPriceHistory.isEmpty()) {//
            buttonFactorySell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getFactoryPrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setFactories(MainActivity.getFactories() - 1);////
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 260);//
        BigDecimal previousPrice = MainActivity.factoryPriceHistory.pop();//
        MainActivity.setFactoryPrice(previousPrice);//
        buttonFactoryBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonFactorySell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getFactories() == 0) {//
            buttonFactorySell.setEnabled(false);//
            buttonFactorySell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateBankSell() {

        if (MainActivity.getBanks() <= 0 || MainActivity.bankPriceHistory.isEmpty()) {//
            buttonBankSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getBankPrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setBanks(MainActivity.getBanks() - 1);////
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 1400);//
        BigDecimal previousPrice = MainActivity.bankPriceHistory.pop();//
        MainActivity.setBankPrice(previousPrice);//
        buttonBankBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonBankSell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getBanks() == 0) {//
            buttonBankSell.setEnabled(false);//
            buttonBankSell.setText("Sell");
        }
        updateAllButtonStates();
    }

    private void updateTempleSell() {

        if (MainActivity.getTemples() <= 0 || MainActivity.templePriceHistory.isEmpty()) {//
            buttonTempleSell.setEnabled(false);//
            return;
        }
        BigDecimal currentPrice = MainActivity.getTemplePrice();//
        BigDecimal refund = MainActivity.calculateSellRefund(currentPrice);
        MainActivity.setCookieCounter(new BigDecimal(MainActivity.getCookieCounter()).add(refund).intValue());
        MainActivity.setTemples(MainActivity.getTemples() - 1);////
        MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() - 7800);//
        BigDecimal previousPrice = MainActivity.templePriceHistory.pop();//
        MainActivity.setTemplePrice(previousPrice);//
        buttonTempleBuy.setText(spannableStringMethod("Buy for", previousPrice));//
        BigDecimal newSellPrice = MainActivity.calculateSellRefund(previousPrice);
        buttonTempleSell.setText(spannableStringMethod("Sell for", newSellPrice));//
        if (MainActivity.getTemples() == 0) {//
            buttonTempleSell.setEnabled(false);//
            buttonTempleSell.setText("Sell");
        }
        updateAllButtonStates();
    }



    @Override
    public void onResume() {
        super.onResume();
        refreshAllPrices();
        updateAllButtonStates();
    }

    private void refreshAllPrices() {
        // Cursor
        buttonCursorBuy.setText(spannableStringMethod("Buy for", MainActivity.getCursorPrice()));
        if (!MainActivity.cursorPriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.cursorPriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25"))
                    .setScale(0, RoundingMode.DOWN);
            buttonCursorSell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonGrandmaBuy.setText(spannableStringMethod("Buy for", MainActivity.getGrandmaPrice()));
        if (!MainActivity.grandmaPriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.grandmaPriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonGrandmaSell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonGardenBuy.setText(spannableStringMethod("Buy for", MainActivity.getGardenPrice()));
        if (!MainActivity.gardenPriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.gardenPriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonGardenSell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonMineBuy.setText(spannableStringMethod("Buy for", MainActivity.getMinePrice()));
        if (!MainActivity.minePriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.minePriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonMineSell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonFactoryBuy.setText(spannableStringMethod("Buy for", MainActivity.getFactoryPrice()));
        if (!MainActivity.factoryPriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.factoryPriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonFactorySell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonBankBuy.setText(spannableStringMethod("Buy for", MainActivity.getBankPrice()));
        if (!MainActivity.bankPriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.bankPriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonBankSell.setText(spannableStringMethod("Sell for", refund));
        }

        buttonTempleBuy.setText(spannableStringMethod("Buy for", MainActivity.getTemplePrice()));
        if (!MainActivity.templePriceHistory.isEmpty()) {
            BigDecimal lastPrice = MainActivity.templePriceHistory.peek();
            BigDecimal refund = lastPrice.multiply(new BigDecimal("0.25")).setScale(0, RoundingMode.DOWN);
            buttonTempleSell.setText(spannableStringMethod("Sell for", refund));
        }







    }


    /* buy methods */
    private void updateCursorBuy() {
        BigDecimal currentPrice = MainActivity.getCursorPrice();
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());

        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.cursorPriceHistory.push(currentPrice);
            MainActivity.setCookieCounter(
                    cookies.subtract(currentPrice).intValue()
            );
            MainActivity.setCursors(MainActivity.getCursors() + 1);
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 0.1);
            MainActivity.setCookiePerClick(MainActivity.getCookiePerClick() + 0.1);
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setCursorPrice(newPrice);
            buttonCursorBuy.setText(spannableStringMethod("Buy for", newPrice));
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonCursorSell.setText(spannableStringMethod("Sell for", sellPrice));
            buttonCursorSell.setEnabled(true);
            updateAllButtonStates();
        }
    }

    private void updateGrandmaBuy() {
        BigDecimal currentPrice = MainActivity.getGrandmaPrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());

        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.grandmaPriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(
                    cookies.subtract(currentPrice).intValue()
            );
            MainActivity.setGrandmas(MainActivity.getGrandmas() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 1);
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setGrandmaPrice(newPrice);//
            buttonGrandmaBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonGrandmaSell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonGrandmaSell.setEnabled(true);//
            updateAllButtonStates();
        }
    }

    private void updateGardenBuy() {
        BigDecimal currentPrice = MainActivity.getGardenPrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());
        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.gardenPriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(cookies.subtract(currentPrice).intValue());
            MainActivity.setGardens(MainActivity.getGardens() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 8); //
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setGardenPrice(newPrice);//
            buttonGardenBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonGardenSell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonGardenSell.setEnabled(true);//
            updateAllButtonStates();
        }
    }

    private void updateMineBuy() {
        BigDecimal currentPrice = MainActivity.getMinePrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());
        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.minePriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(cookies.subtract(currentPrice).intValue());
            MainActivity.setMines(MainActivity.getMines() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 47); //
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setMinePrice(newPrice);//
            buttonMineBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonMineSell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonMineSell.setEnabled(true);//
            updateAllButtonStates();
        }
    }

    private void updateFactoryBuy() {
        BigDecimal currentPrice = MainActivity.getFactoryPrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());
        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.factoryPriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(cookies.subtract(currentPrice).intValue());
            MainActivity.setFactories(MainActivity.getFactories() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 260); //
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setFactoryPrice(newPrice);//
            buttonFactoryBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonFactorySell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonFactorySell.setEnabled(true);//
            updateAllButtonStates();
        }
    }

    private void updateBankBuy() {
        BigDecimal currentPrice = MainActivity.getBankPrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());
        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.bankPriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(cookies.subtract(currentPrice).intValue());
            MainActivity.setBanks(MainActivity.getBanks() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 1400); //
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setBankPrice(newPrice);//
            buttonBankBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonBankSell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonBankSell.setEnabled(true);//
            updateAllButtonStates();
        }
    }


    private void updateTempleBuy() {
        BigDecimal currentPrice = MainActivity.getTemplePrice(); //
        BigDecimal cookies = new BigDecimal(MainActivity.getCookieCounter());
        if (cookies.compareTo(currentPrice) >= 0) {
            MainActivity.templePriceHistory.push(currentPrice); //
            MainActivity.setCookieCounter(cookies.subtract(currentPrice).intValue());
            MainActivity.setTemples(MainActivity.getTemples() + 1); //
            MainActivity.setCookiesPerSecond(MainActivity.getCookiesPerSecond() + 7800); //
            BigDecimal newPrice = MainActivity.calculateNewBuyPrice(currentPrice);
            MainActivity.setTemplePrice(newPrice);//
            buttonTempleBuy.setText(spannableStringMethod("Buy for", newPrice));//
            BigDecimal sellPrice = MainActivity.calculateSellRefund(newPrice);
            buttonTempleSell.setText(spannableStringMethod("Sell for", sellPrice));//
            buttonTempleSell.setEnabled(true);//
            updateAllButtonStates();
        }
    }


    private TextView textView13;
    void updateCookieCounter() {

        textView13.setText(MainActivity.changeCookieToString((int) Math.floor(MainActivity.getCookieCounter())) +" cookies");
        /* debug */
        cookieText.setText(MainActivity.getAllTimeCookies()+"");
    }
}
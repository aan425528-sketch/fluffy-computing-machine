package com.xausd.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 40, 30, 30);
        layout.setBackgroundColor(Color.rgb(15, 23, 42));

        TextView title = new TextView(this);
        title.setText("XAUUSD AI ANALYZER");
        title.setTextSize(25);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Analisis Supply & Demand H1");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        addText(layout, "STATUS MARKET: MENUNGGU DATA");
        addText(layout, "SIGNAL: BELUM TERSEDIA");
        addText(layout, "ENTRY: --");
        addText(layout, "STOP LOSS: --");
        addText(layout, "TAKE PROFIT: --");

        TextView note = new TextView(this);
        note.setText("Hubungkan sumber data harga untuk mengaktifkan analisis.");
        note.setTextColor(Color.YELLOW);
        note.setTextSize(14);
        note.setPadding(0, 40, 0, 0);
        layout.addView(note);

        setContentView(layout);
    }

    private void addText(LinearLayout layout, String value) {
        TextView text = new TextView(this);
        text.setText(value);
        text.setTextSize(18);
        text.setTextColor(Color.WHITE);
        text.setPadding(0, 25, 0, 10);
        layout.addView(text);
    }
}

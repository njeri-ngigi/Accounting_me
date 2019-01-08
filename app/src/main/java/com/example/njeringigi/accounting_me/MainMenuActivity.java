package com.example.njeringigi.accounting_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_order, btn_customers, btn_stock, btn_add_item, btn_statistics, btn_settings, btn_summaries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btn_order = findViewById(R.id.btn_make_order);
        btn_order.setOnClickListener(this);

        btn_customers = findViewById(R.id.btn_my_customers);
        btn_customers.setOnClickListener(this);

        btn_stock = findViewById(R.id.btn_my_stock);
        btn_stock.setOnClickListener(this);

        btn_add_item = findViewById(R.id.btn_add_item);
        btn_add_item.setOnClickListener(this);

        btn_statistics = findViewById(R.id.btn_statistics);
        btn_statistics.setOnClickListener(this);

        btn_settings = findViewById(R.id.btn_settings);
        btn_settings.setOnClickListener(this);

        btn_summaries = findViewById(R.id.btn_summaries);
        btn_summaries.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_make_order:
                intent = new Intent(MainMenuActivity.this, MakeOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_my_customers:
                intent = new Intent(MainMenuActivity.this, CustomersActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_my_stock:
                intent = new Intent(MainMenuActivity.this, StockActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_add_item:
                intent = new Intent(MainMenuActivity.this, AddStockActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_statistics:
                intent = new Intent(MainMenuActivity.this, StatisticsActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_settings:
                intent = new Intent(MainMenuActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_summaries:
                intent = new Intent(MainMenuActivity.this, SummariesActivity.class);
                startActivity(intent);
                break;
        }
    }
}

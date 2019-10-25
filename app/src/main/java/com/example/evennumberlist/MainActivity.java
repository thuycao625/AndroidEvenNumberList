package com.example.evennumberlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));

        final NumberAdapter numberAdapter = new NumberAdapter();
        recyclerView.setAdapter(numberAdapter);

        List<Integer> numbers = new ArrayList<Integer>();
        int i = 2;

        while (i < 202) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
            i++;
        }

        numberAdapter.numbers = numbers;
//        Log.i("TAG", "" + numbers.size());
    }
}

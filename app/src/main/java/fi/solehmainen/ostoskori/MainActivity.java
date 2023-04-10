package fi.solehmainen.ostoskori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ItemStorage storage;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ItemStorage i = ItemStorage.getInstance();
        context = MainActivity.this;
        //i.getItems();
        storage = ItemStorage.getInstance();
        recyclerView = findViewById(R.id.rvItemList);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemListAdapter(getApplicationContext(), storage.getItems()));
    }

    public void switchToAddItem(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

}
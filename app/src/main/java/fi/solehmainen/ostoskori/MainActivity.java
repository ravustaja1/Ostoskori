package fi.solehmainen.ostoskori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import kotlinx.coroutines.channels.ProduceKt;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ItemStorage storage;
    private RecyclerView recyclerView;
    private ArrayList<Item> items = new ArrayList<>();
    private Button SortByAlph, SortById;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ItemStorage i = ItemStorage.getInstance();
        context = MainActivity.this;
        //i.getItems();
        storage = ItemStorage.getInstance();

        recyclerView = findViewById(R.id.rvItemList);

        items = ItemStorage.getInstance().getItems();

        SortByAlph = findViewById(R.id.btnOrderAlph);
        SortById = findViewById(R.id.btnOrderAlph);
        ItemListAdapter adapter = new ItemListAdapter(getApplicationContext(), storage.getItems());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        SortByAlph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(items, Comparator.comparing(Item::getPurchase).thenComparing(Item::getPurchase));
                adapter.notifyDataSetChanged();
            }
        });

        SortById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(items, Comparator.comparing(Item::getId).thenComparing(Item::getId));
                adapter.notifyDataSetChanged();
            }
        });



    }

    public void switchToAddItem(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

    public ArrayList<Item> switchByAlphabetical(View view) {
        ArrayList<Item> items = new ArrayList<>();
        items = ItemStorage.getInstance().getItems();
        Collections.sort(items, Comparator.comparing(Item::getPurchase).thenComparing(Item::getPurchase));

        return items;
    }


}
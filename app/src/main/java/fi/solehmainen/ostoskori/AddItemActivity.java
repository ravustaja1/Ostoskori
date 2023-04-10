package fi.solehmainen.ostoskori;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstancecState) {
        super.onCreate(savedInstancecState);
        setContentView(R.layout.add_item_view);

        editText = findViewById(R.id.editItem);

    }

    public void addItem(View view) {
        Item item = new Item(editText.getText().toString());
        ItemStorage.getInstance().addItem(item);


    }
}

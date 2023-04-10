package fi.solehmainen.ostoskori;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context context;

    private ArrayList<Item> items = new ArrayList<Item>();

    public ItemListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.tvItem.setText(items.get(position).getPurchase());
        holder.edit.setImageResource(items.get(position).getImage2());
        holder.delete.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

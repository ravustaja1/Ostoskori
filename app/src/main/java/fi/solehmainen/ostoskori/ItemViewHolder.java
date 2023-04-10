package fi.solehmainen.ostoskori;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView delete, edit;


    TextView txtField;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        delete = itemView.findViewById(R.id.ivDelete);
        edit = itemView.findViewById(R.id.ivDelete);
        txtField = itemView.findViewById(R.id.tvItem);
    }
}

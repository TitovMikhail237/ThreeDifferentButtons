package com.example.threedifferentbuttons;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThreeDifferentButtonsAdapter extends RecyclerView.Adapter<ThreeDifferentButtonsAdapter.ViewHolder>{

    private List<String> name;

    ThreeDifferentButtonsAdapter(List<String> name){
        this.name=name;
    }


    @NonNull
    @Override
    public ThreeDifferentButtonsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThreeDifferentButtonsAdapter.ViewHolder holder, int position) {
        holder.nameItem.setText(name.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        final TextView nameItem;
        final CheckBox checkBoxItem;

        ViewHolder(View view){
            super(view);
            nameItem = view.findViewById(R.id.recyclerViewItem);
            checkBoxItem = view.findViewById(R.id.checkboxItem);
        }
    }
}

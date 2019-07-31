package com.glass.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class POListAdapter extends RecyclerView.Adapter<POListAdapter.MyViewHolder> {

    private List<POListDetail> poList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView receipt, info, scan_item;

        public MyViewHolder(View view) {
            super(view);
            receipt = (TextView) view.findViewById(R.id.receiptno);
            info = (TextView) view.findViewById(R.id.info);
            scan_item = (TextView) view.findViewById(R.id.scanitem);
        }
    }


    public POListAdapter(List<POListDetail> poList) {
        this.poList = poList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.polist_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        POListDetail polist = poList.get(position);
        holder.receipt.setText("Receipt No: " + polist.getReceipt());
        holder.info.setText("Sub Inv: " + polist.getSubInv() + " Line No: " + polist.getLine_no() + " Item: " + polist.getItem_num() + " Qty: " + polist.getQuantity());
        holder.scan_item.setText(polist.getScanItem());
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }
}
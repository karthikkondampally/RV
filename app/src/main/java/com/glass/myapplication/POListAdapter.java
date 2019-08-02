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
        public TextView line,receipt,item,qty, sub_inv, scan_item;

        public MyViewHolder(View view) {
            super(view);
            receipt = (TextView) view.findViewById(R.id.receiptno);
            line = (TextView) view.findViewById(R.id.lineno);
            item = (TextView) view.findViewById(R.id.itemno);
            qty = (TextView) view.findViewById(R.id.quantity);
            sub_inv = (TextView) view.findViewById(R.id.Subinv);
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
        holder.receipt.setText(polist.getReceipt());
        holder.line.setText(polist.getLine_no());
        holder.item.setText(polist.getItem_num());
        holder.qty.setText(polist.getQuantity());
        holder.sub_inv.setText(polist.getSubInv());

      //  holder.info.setText("Sub Inv: " + polist.getSubInv() + " Line No: " + polist.getLine_no() + " Item: " + polist.getItem_num() + " Qty: " + polist.getQuantity());
        holder.scan_item.setText(polist.getScanItem());
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }
}
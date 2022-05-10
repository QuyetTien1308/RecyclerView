package com.example.recycleview.modle.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.modle.SinhVien;

import java.util.List;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.SinhVienViewHolder> {
    private List<SinhVien> mSinhVienList;

    public SinhVienAdapter(List<SinhVien> mSinhVienList) {
        this.mSinhVienList = mSinhVienList;
    }

    @NonNull
    @Override
    public SinhVienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sinhvien,parent,false);
        return new SinhVienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SinhVienViewHolder holder, int position) {
        SinhVien sinhVien = mSinhVienList.get(position);
        if(sinhVien == null)
        {
            return;
        }
        holder.tvmaSV.setText(sinhVien.getMaSV());
        holder.tvtenSV.setText(sinhVien.getTenSV());
    }

    @Override
    public int getItemCount() {
        if(mSinhVienList != null){
            return mSinhVienList.size();
        }
        return 0;
    }

    class SinhVienViewHolder extends RecyclerView.ViewHolder {
        private TextView tvmaSV, tvtenSV;
        public SinhVienViewHolder(@NonNull View itemView) {
            super(itemView);
            tvmaSV = itemView.findViewById(R.id.tv_maSV);
            tvtenSV = itemView.findViewById(R.id.tv_tenSV);
        }
    }
}

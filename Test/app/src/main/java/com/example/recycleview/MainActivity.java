package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.modle.SinhVien;
import com.example.recycleview.modle.adapter.SinhVienAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvSinhVien;
    private List<SinhVien> mListSinhVien;
    private SinhVienAdapter sinhVienAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvSinhVien = findViewById(R.id.rcv_sv);
        mListSinhVien = new ArrayList<>();
        SinhVien sinhVien1 = new SinhVien(1,"a");
        mListSinhVien.add(sinhVien1);
        sinhVienAdapter = new SinhVienAdapter(mListSinhVien);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvSinhVien.setLayoutManager(linearLayoutManager);
        rcvSinhVien.setAdapter(sinhVienAdapter);
    }
}
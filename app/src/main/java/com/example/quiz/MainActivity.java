package com.example.quiz;


import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main);

        // Data Ahmad Dahlan
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad));
        binding.txtName1.setText("Ahmad Dahlan");
        binding.txtDescription1.setText("Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, ");
        // Data Ahmad Yani
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.yani));
        binding.txtName2.setText("Ahmad Yani");
        binding.txtDescription2.setText("Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922");
        // Data Maulana Adnan Khalid
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.patimura1));
        binding.txtName3.setText("Pattimura");
        binding.txtDescription3.setText("Pattimura (atau Thomas Matulessy) (lahir di Haria, pulau Saparua, Maluku, 8 Juni 1783 – meninggal di Ambon, Maluku, 16 Desember 1817 pada umur 34 tahun), juga dikenal dengan nama Kapitan Pattimura adalah pahlawan Maluku dan merupakan Pahlawan nasional Indonesia. Menurut buku biografi Pattimura versi pemerintah yang pertama kali terbit, M Sapija menulis, “Bahwa pahlawan Pattimura tergolong turunan bangsawan dan berasal dari Nusa Ina (Seram). Ayahnya yang bernama Antoni Mattulessy adalah anak dari Kasimiliali Pattimura Mattulessy. Yang terakhir ini adalah putra raja Sahulau. Sahulau merupakan nama orang di negeri yang terletak dalam sebuah teluk di Seram Selatan”.");
    }
}
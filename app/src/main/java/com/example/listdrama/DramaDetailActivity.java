package com.example.listdrama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DramaDetailActivity extends AppCompatActivity {

    ImageView imageUrlView, imageView, pemeran1View, pemeran2View, pemeran3View, pemeran4View;
    TextView itemName, itemRating, itemGenre, itemSinopsis;


    String imageUrl, image, name, rating, genre, sinopsis, pemeran1, pemeran2, pemeran3, pemeran4;
    AppSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        settings = new AppSettings(this);
        applyTheme(settings.getTheme());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama_detail);

        Intent intent = getIntent();
        image = intent.getStringExtra("image");
        imageUrl = intent.getStringExtra("imageUrl");
        name = intent.getStringExtra("name");
        rating = intent.getStringExtra("rating");
        genre = intent.getStringExtra("genre");
        sinopsis = intent.getStringExtra("sinopsis");
        pemeran1 = intent.getStringExtra("pemeran1");
        pemeran2 = intent.getStringExtra("pemeran2");
        pemeran3 = intent.getStringExtra("pemeran3");
        pemeran4 = intent.getStringExtra("pemeran4");

        imageView = findViewById(R.id.detail_drama_cover);
        imageUrlView = findViewById(R.id.detail_drama_url);
        itemName = findViewById(R.id.detail_drama_name);
        itemRating = findViewById(R.id.detail_drama_rating);
        itemGenre = findViewById(R.id.detail_drama_genre);
        itemSinopsis = findViewById(R.id.detail_drama_sinopsis);
        pemeran1View = findViewById(R.id.pemeran1);
        pemeran2View = findViewById(R.id.pemeran2);
        pemeran3View = findViewById(R.id.pemeran3);
        pemeran4View = findViewById(R.id.pemeran4);



        Glide.with(getApplicationContext()).load(image).into(imageView);
        Glide.with(getApplicationContext()).load(imageUrl).into(imageUrlView);
        itemName.setText(name);
        itemRating.setText(rating);
        itemGenre.setText(genre);
        itemSinopsis.setText(sinopsis);
        Glide.with(getApplicationContext()).load(pemeran1).into(pemeran1View);
        Glide.with(getApplicationContext()).load(pemeran2).into(pemeran2View);
        Glide.with(getApplicationContext()).load(pemeran3).into(pemeran3View);
        Glide.with(getApplicationContext()).load(pemeran4).into(pemeran4View);

    }

    private void applyTheme(int theme) {
        switch (theme){
            case  AppSettings.THEME_LIGHT: setTheme(R.style.AppTheme);
                break;
            case  AppSettings.THEME_DARK: setTheme(R.style.DarkTheme);
                break;
            case  AppSettings.THEME_DARK_AMOLED: setTheme(R.style.DarkTheme);
                break;
            default:
                setTheme(R.style.AppTheme);
        }
    }
}
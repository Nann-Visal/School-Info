package com.example.school_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.school_info.databinding.ActivityMain5Binding;
import com.example.school_info.databinding.ActivityMain6Binding;

public class MainActivity6 extends AppCompatActivity {
    ActivityMain6Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] school_names={"សាកលវិទ្យាល័យវេស្ទើន","សាកលវិទ្យាល័យឯកទេសនៃកម្ពុជា","សាកលវិទ្យាល័យមេគង្គកម្ពុជា","សាកលវិទ្យាល័យចម្រើនពហុបច្ចេកវិទ្យា",
                "វិទ្យាស្ថានសហប្រតិបត្តការអន្តរជាតិ កម្ពុជា","វិទ្យាស្ថានជាតិពាណិជ្ជសាស្រ្ត","សាកលវិទ្យាល័យបៀលប្រាយ","សាកលវិទ្យាល័យខ្មែរ បច្ចេកវិទ្យា និងគ្រប់គ្រង",
                "វិទ្យាស្ថាន វ៉ាន់ដា", "សាកលវិទ្យាល័យអន្តរជាតិ","វិទ្យាស្ថាន សុីតិច","សាកលវិទ្យាល័យន័រតុន"};
        int[]  school_images={R.drawable.logo_1,R.drawable.logo_2,R.drawable.logo_3,R.drawable.logo_4,R.drawable.logo_5,
                R.drawable.logo_6,R.drawable.logo_7,R.drawable.logo_8,R.drawable.logo_9,R.drawable.logo_10,R.drawable.logo_11,
                R.drawable.logo_12};
        GridAdapter gridAdapter = new GridAdapter(MainActivity6.this,school_names,school_images);
        binding.itemsOfSchool.setAdapter(gridAdapter);
    }
}
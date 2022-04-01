package com.example.school_info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.school_info.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {
    ActivityMain5Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main5);
        setContentView(binding.getRoot());

        String[] school_names={"សាកលវិទ្យាល័យភូមិន្ទភ្នំពេញ","សាកលវិទ្យាល័យស្វាយរៀង","សាកលវិទ្យាល័យវិទ្យាសាស្រ្តសុខាភិបាល","វិទ្យាស្ថានបច្ចេកវិទ្យាកម្ពុជា",
                "សាកលវិទ្យាល័យឥន្រ្តវិជ្ជា","សាកលវិទ្យាល័យភូមិន្ទនីតិសាស្ត្រនិងវិទ្យាសាស្ត្រសេដ្ឋកិច្","សាកលវិទ្យាល័យក្រចេះ","សាកលវិទ្យាល័យមានជ័យ","សាកលវិទ្យាល័យឯកទេសនៃកម្ពុជា",
                "សាកលវិទ្យាល័យជាតិបាត់ដំបង","សាកលវិទ្យាល័យជាតិគ្រប់គ្រង","ពុទ្ធិកសាកលវិទ្យាល័យសម្ដេចអគ្គមហាសេនាបតីតេជោ ហ៊ុន សែន",
                "សាកលវិទ្យាល័យកំពង់ចាម","សាកលវិទ្យាល័យកម្ពុជា", "សាកលវិទ្យាល័យធនធានមនុស្ស"};
        int[] school_images={R.drawable.logo_l,R.drawable.logo_a,R.drawable.logo_b,R.drawable.logo_c,R.drawable.logo_d
               ,R.drawable.logo_e,R.drawable.logo_f,R.drawable.logo_g,R.drawable.logo_h,R.drawable.logo_i,R.drawable.logo_j,
                R.drawable.logo_k,R.drawable.logo_o,R.drawable.logo_p,R.drawable.logo_q};

        GridAdapter gridAdapter = new GridAdapter(MainActivity5.this,school_names,school_images);
        binding.itemsOfSchool.setAdapter(gridAdapter);

    }

}
package com.tutaro.bai2usefragment.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tutaro.bai2usefragment.Fragment.StudentAddFragment;
import com.tutaro.bai2usefragment.Fragment.StudentFragment;
import com.tutaro.bai2usefragment.Object.Student;
import com.tutaro.bai2usefragment.R;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_STUDENT = "NAME_STUDENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){

        StudentAddFragment studentAddFragment = new StudentAddFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container, studentAddFragment).commit();
    }

    public void gotoStudentFragment(Student student){

        StudentFragment studentFragment = new StudentFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(NAME_STUDENT, student);
        studentFragment.setArguments(bundle);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.container, studentFragment).addToBackStack(null).commit();
    }

    public void gotoStudentInfoFragment(){

    }

}

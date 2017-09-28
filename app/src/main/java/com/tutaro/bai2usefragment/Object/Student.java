package com.tutaro.bai2usefragment.Object;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by KHOE on 28/09/2017.
 */

public class Student implements Serializable {

    private String name;
    private String hometown;
    private String birthday;
    private String maleOrFemale;
    private String classStudent;
    private String course;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String hometown, String birthday,
                   String maleOrFemale, String classStudent, String course) {
        this.name = name;
        this.hometown = hometown;
        this.birthday = birthday;
        this.maleOrFemale = maleOrFemale;
        this.classStudent = classStudent;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public String getCourse() {
        return course;
    }

}

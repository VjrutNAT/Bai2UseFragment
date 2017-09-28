package com.tutaro.bai2usefragment.Object;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by KHOE on 28/09/2017.
 */

public class Student implements Parcelable {

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

    protected Student(Parcel in) {
        name = in.readString();
        hometown = in.readString();
        birthday = in.readString();
        maleOrFemale = in.readString();
        classStudent = in.readString();
        course = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(hometown);
        parcel.writeString(birthday);
        parcel.writeString(maleOrFemale);
        parcel.writeString(classStudent);
        parcel.writeString(course);
    }
}

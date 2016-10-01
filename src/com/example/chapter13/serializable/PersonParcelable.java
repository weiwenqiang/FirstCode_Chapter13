package com.example.chapter13.serializable;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonParcelable implements Parcelable {

	private String name;
	private int age;
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);//Ð´³öname
		dest.writeInt(age);//Ð´³öage
	}
	
	public static final Parcelable.Creator<PersonParcelable> CREATOR = new Parcelable.Creator<PersonParcelable>() {

		@Override
		public PersonParcelable createFromParcel(Parcel source) {
			PersonParcelable person = new PersonParcelable();
			person.name = source.readString();
			person.age = source.readInt();
			return person;
		}

		@Override
		public PersonParcelable[] newArray(int size) {
			return new PersonParcelable[size];
		}
	
	};

}

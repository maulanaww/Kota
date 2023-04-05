package com.dicoding.picodiploma.kota

import android.os.Parcel
import android.os.Parcelable

data class Kota(val gambarSrc: Int, val titleGambar: String?, val deskripsiGambar: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambarSrc)
        parcel.writeString(titleGambar)
        parcel.writeString(deskripsiGambar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Kota> {
        override fun createFromParcel(parcel: Parcel): Kota {
            return Kota(parcel)
        }

        override fun newArray(size: Int): Array<Kota?> {
            return arrayOfNulls(size)
        }
    }
}
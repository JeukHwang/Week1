package com.madcamp.week1.contacts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ContactsInfo(val id: String, val github_url: String, val email: String, val photo: String) :
    Parcelable {
  companion object {
    val dataset =
        arrayListOf(
            ContactsInfo(
                "Song",
                "https://github.com/minjisong128",
                "email_minji",
                "https://avatars.githubusercontent.com/u/110910757?v=4"),
            ContactsInfo(
                "Hwang",
                "https://github.com/JeukHwang",
                "email_jeuk",
                "https://avatars.githubusercontent.com/u/92910273?v=4"),
            ContactsInfo(
                "Kim",
                "https://github.com/kim",
                "email_kim",
                "https://avatars.githubusercontent.com/u/6163?v=4"),
            ContactsInfo(
                "Lee",
                "https://github.com/lee",
                "email_lee",
                "https://avatars.githubusercontent.com/u/2014?v=4"),
            ContactsInfo(
                "Park",
                "https://github.com/park",
                "email_park",
                "https://avatars.githubusercontent.com/u/135650?v=4"),
            ContactsInfo(
                "Choi",
                "https://github.com/choi",
                "email_choi",
                "https://avatars.githubusercontent.com/u/10793473?v=4"),
            ContactsInfo(
                "Lim",
                "https://github.com/lim",
                "email_lim",
                "https://avatars.githubusercontent.com/u/7571747?v=4"),
            ContactsInfo(
                "Lulu",
                "https://github.com/lulu",
                "email_lulu",
                "https://avatars.githubusercontent.com/u/54672474?v=4"),
            ContactsInfo(
                "Lala",
                "https://github.com/lala",
                "email_lala",
                "https://avatars.githubusercontent.com/u/106092?v=4"),
            ContactsInfo(
                "Sookmyung",
                "https://github.com/Sookmyung",
                "email_sookmyung",
                "https://avatars.githubusercontent.com/u/18757873?v=4"),
            ContactsInfo(
                "Kaist",
                "https://github.com/kaist",
                "email_kaist",
                "https://avatars.githubusercontent.com/u/18757873?v=4"),
            ContactsInfo(
                "Univ",
                "https://github.com/Univ",
                "email_univ",
                "https://avatars.githubusercontent.com/u/33484326?v=4"))
  }
}

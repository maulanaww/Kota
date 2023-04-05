package com.dicoding.picodiploma.kota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_about, menu)
        return false
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.profile -> {val intentcoba = Intent(this, ProfileActivity::class.java)
                startActivity(intentcoba)}
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<Kota>(
            Kota(
                R.drawable.probolinggo,
                "Kota Probolinggo",
                "Probolinggo adalah sebuah kota di Provinsi Jawa Timur, Indonesia. Terletak sekitar 100 km sebelah tenggara Surabaya, Kota Probolinggo berbatasan dengan Selat Madura di sebelah utara, serta Kabupaten Probolinggo di sebelah timur, selatan, dan barat. Probolinggo merupakan kota terbesar keempat di Jawa Timur setelah Surabaya, Malang, dan Kediri menurut jumlah penduduk, dan jumlah penduduk kota ini pada tahun 2021 berjumlah 242.246 jiwa. Kota ini terletak di wilayah Tapal Kuda, Jawa Timur dan menjadi jalur utama pantai utara yang menghubungkan Pulau Jawa dengan Pulau Bali."
            ),
            Kota(
                R.drawable.kediri,
                "Kota Kediri",
                "Kediri adalah sebuah kota yang berada di provinsi Jawa Timur, Indonesia. Kota ini terletak sekitar 130 km sebelah Barat Daya Kota Surabaya dan merupakan kota terbesar ketiga di provinsi Jawa Timur setelah Kota Surabaya dan Kota Malang menurut jumlah penduduk. Kota Kediri merupakan kota tertua yang ada di Jawa Timur. Kota Kediri memiliki luas wilayah 63,40 km² . dan seluruh wilayahnya merupakan enklave dari Kabupaten Kediri. Kota Kediri terbelah oleh Sungai Brantas yang membujur dari Selatan ke Utara sepanjang 7 kilometer. Penduduk kota ini berjumlah 287.962 jiwa, berdasarkan data Badan Pusat Statistik untuk Kota Kediri tahun 2022."
            ),
            Kota(
                R.drawable.blitar,
                "Kota Blitar",
                "Blitar merupakan sebuah kota yang terletak di bagian Selatan provinsi Jawa Timur, Indonesia. Kota ini terletak sekitar 167 km sebelah barat daya Surabaya dan 80 km sebelah barat Malang. Kota ini merupakan enklave dari Kabupaten Blitar. Selain disebut sebagai Kota Proklamator dan Kota Patria, kota ini juga disebut sebagai Kota Peta (Pembela Tanah Air) karena di bawah kepemimpinan Soeprijadi, Laskar Peta melakukan perlawanan terhadap pemerintahan Jepang untuk pertama kalinya pada tanggal 14 Februari 1945 yang mengilhami timbulnya perlawanan menuju kemerdekaan di daerah lain."
            ),
            Kota(
                R.drawable.malang,
                "Kota Malang",
                "Malang adalah sebuah kota yang terletak di provinsi Jawa Timur, Indonesia, Kota terbesar kedua di Jawa Timur setelah Surabaya, dan kota terbesar ke-12 di Indonesia. Kota ini didirikan pada masa Pemerintahan Belanda pada tanggal 1 April 1914 dengan E.K Broeveldt sebagai wali kota pertama. Kota ini terletak di dataran tinggi seluas 145,28 km² yang merupakan enklave Kabupaten Malang. Bersama dengan Kota Batu dan Kabupaten Malang, Kota Malang merupakan bagian dari kesatuan wilayah yang dikenal dengan Malang Raya."
            ),
            Kota(
                R.drawable.pasuruan,
                "Kota Pasuruan",
                "Pasuruan adalah sebuah kota yang berada di provinsi Jawa Timur, Indonesia. Kota Pasuruan terletak 60 km sebelah tenggara Kota Surabaya, ibu kota provinsi Jawa Timur dan 355 km sebelah barat laut Kota Denpasar, Bali. Seluruh wilayah Kota Pasuruan berbatasan dengan Kabupaten Pasuruan."
            ),
            Kota(
                R.drawable.mojokerto,
                "Kota Mojokerto",
                "Mojokerto adalah sebuah kota di Provinsi Jawa Timur, Indonesia. Kota ini terletak 50 km barat daya Kota Surabaya. Kota Mojokerto merupakan salah satu wilayah yang masuk dalam kawasan metropolitan Surabaya, yaitu Gerbangkertosusila. Wilayah Kota Mojokerto merupakan enklave dari Kabupaten Mojokerto. Kota Mojokerto terbagi menjadi 3 kecamatan yaitu Magersari , Kranggan , Prajurit Kulon .Berpenduduk Mayoritas Suku Jawa dialek Arek'an.Pada Masa akhir Majapahit sekitar tahun 1527,Wilayah ini termasuk dalam wilayah Kadipaten Djapan."
            ),
            Kota(
                R.drawable.madiun,
                "Kota Madiun",
                "Madiun adalah sebuah kota di Provinsi Jawa Timur, Indonesia. Kota terbesar ke-4 di Jawa Timur setelah Surabaya, Malang dan Kediri ini terletak 160 km sebelah barat Surabaya, 111 km sebelah timur Surakarta, Jawa Tengah dan 38 km sebelah tenggara Ngawi. Di kota ini terdapat Industri Kereta Api (INKA) yang merupakan pabrik pembuatan kereta api terbesar se-Asia Tenggara dan memiliki sekolah tinggi perkeretaapian, yakni salah satunya Politeknik Perkeretaapian Indonesia. Kota Madiun mendapat julukan sebagai \"Kota Gadis\", \"Kota Brem\", \"Kota Pecel\", \"Kota Sastra\", \"Kota Pelajar\", \"Kota Kereta\", \"Kota Budaya\", \"Kota Industri\", \"Kota Karismatik\", dan \"Kota Pendekar\". Banyak umkm yang terdapat di Kota Madiun seperti bumi semendung, simpang lima bunderan, alun-alun kota Madiun, warung gurami bakar afifah, remul, dll."
            ),
            Kota(
                R.drawable.surabaya,
                "Kota Surabaya",
                "Surabaya adalah ibu kota Provinsi Jawa Timur yang menjadi pusat pemerintahan dan perekonomian dari Provinsi Jawa Timur sekaligus kota terbesar di provinsi tersebut. Surabaya juga merupakan sebuah kota yang terletak di Provinsi Jawa Timur, Indonesia. Surabaya merupakan kota terbesar kedua di Indonesia setelah Kota Jakarta. Kota ini terletak 800 km sebelah timur Jakarta, atau 435 km sebelah barat laut Denpasar, Bali. Letak kota ini berada di pantai utara Pulau Jawa bagian timur yang berhadapan dengan Selat Madura serta Laut Jawa."
            ),
            Kota(
                R.drawable.batu,
                "Kota Batu",
                "Batu adalah sebuah kota di Provinsi Jawa Timur, Indonesia. Kota ini terletak 90 km sebelah barat daya Surabaya atau 15 km sebelah barat laut Malang. Kota Batu berada di jalur yang menghubungkan Malang-Kediri dan Jombang. Kota Batu berbatasan dengan Kabupaten Mojokerto dan Kabupaten Pasuruan di sebelah utara serta dengan Kabupaten Malang di sebelah timur, selatan, dan barat. Wilayah kota ini berada di ketinggian 800-2.000 meter dan ketinggian rata-rata yaitu 980 meter di atas permukaan laut dengan suhu udara rata-rata mencapai 11-19 derajat Celsius."
            ),
            Kota(
                R.drawable.jember,
                "Kabupaten Jember",
                "Jember adalah sebuah kabupaten di provinsi Jawa Timur, Indonesia. Ibu kota Kabupaten Jember adalah Kota Jember yang terletak di tengah-tengah wilayah Tapal Kuda, Provinsi Jawa Timur. Secara administratif, wilayah Kabupaten Jember terbagi menjadi 31 kecamatan terdiri atas 28 kecamatan dengan 226 desa dan 3 kecamatan dengan 22 kelurahan. Wilayah Kabupaten Jember juga meliputi Kepulauan Nusa Barung, yang berada di Selatan Laut Jawa. Jember sempat memiliki kota administratif, tetapi sejak tahun 2001 istilah kota administratif dihapus, sehingga Kota Administratif Jember kembali menjadi bagian dari Kabupaten Jember. Hari jadi Kabupaten Jember diperingati setiap tanggal 1 Januari."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KotaAdapter(this, imageList){
            val intent = Intent(this, ActivityDetailKota::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}
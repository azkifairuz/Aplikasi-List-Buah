package com.javfairuz.aplikasilistbuah

object FruitData {
    private val fruitName = arrayOf(
        "Anggur",
        "Apel",
        "Durian",
        "Jeruk",
        "Labu",
        "Leci",
        "Mangga",
        "Pepaya",
        "Rambutan",
        "Strawberry"
    )

    private val fruitDetails = arrayOf(
        "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.",
        "Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji di dalamnya.",
        "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit).",
        "Jeruk adalah buah dari berbagai spesies citrus dalam famili Rutaceae (lihat daftar tanaman yang dikenal sebagai jeruk); terutama mengacu pada Citrus × sinensis, yang juga disebut jeruk manis, untuk membedakannya dari Citrus × aurantium terkait, yang disebut jeruk pahit.",
        "Labu merupakan buah yang dihasilkan oleh sejumlah anggota suku labu-labuan (Cucurbitaceae), terutama yang berukuran cukup besar dan berbentuk bulat atau memanjang. Tidak ada kriteria yang jelas mengenai pemanfaatannya, sehingga labu dapat dimakan segar atau diolah terlebih dahulu. Namun, labu biasanya tidak dimakan sebagai lalapan.",
        "Lici atau Leci adalah buah-buahan dari genus Litchi yang tergolong familia lerak-lerakan Sapindaceae. Pohon lici tumbuh di iklim tropis. Buah ini umumnya ditemukan di Tiongkok, India, Madagaskar, Nepal, Bangladesh, Pakistan, Taiwan bagian selatan dan tengah, Vietnam utara, Indonesia, Thailand, Filipina, Afrika Selatan dan Meksiko. Buah ini berbau wangi dan manis.",
        "Buah mangga termasuk kelompok buah batu (drupa) yang berdaging, dengan ukuran dan bentuk yang sangat berubah-ubah bergantung pada macamnya, mulai dari bulat (misalnya mangga gedong), bulat telur (gadung, indramayu, arumanis) hingga lonjong memanjang (mangga golek). Panjang buah kira-kira 2,5–30 cm. Pada bagian ujung buah, ada bagian yang runcing yang disebut paruh.",
        "Pepaya (Carica papaya L.), atau battek adalah tumbuhan yang diperkirakan berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan.[1] Pepaya kini telah menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. C. papaya adalah satu-satunya jenis dalam genus Carica.",
        "Buah rambutan terbungkus oleh kulit yang memiliki \"rambut\" di bagian luarnya (eksokarp). Warnanya hijau ketika masih muda, lalu berangsur kuning hingga merah ketika masak/ranum. Endokarp berwarna putih, menutupi \"daging\". Bagian buah yang dimakan, \"daging buah\", sebenarnya adalah salut biji atau aril, yang bisa melekat kuat pada kulit terluar biji atau lepas (\"rambutan ace\"/ngelotok).",
        "stroberi adalah spesies hibrida yang tumbuh luas dari genus Fragaria, yang secara kolektif dikenal sebagai stroberi, yang dibudidayakan di seluruh dunia untuk diambil buahnya. Buah ini banyak disukai karena aromanya yang khas, warna merah cerah, tekstur berair, dan rasa manis. Ini dikonsumsi dalam jumlah besar, baik segar atau dalam makanan siap saji seperti selai, jus, pai, es krim, milkshake, dan cokelat. Perasa dan aroma buatan strawberry juga banyak digunakan dalam produk-produk seperti permen, sabun, lip gloss, parfum, dan banyak lainnya."
    )
    private  val fruitImages = intArrayOf(
        R.drawable.anggur,
        R.drawable.apel,
        R.drawable.durian,
        R.drawable.jeruk,
        R.drawable.labu,
        R.drawable.leci,
        R.drawable.mangga,
        R.drawable.pepaya,
        R.drawable.rambutan,
        R.drawable.strawberry
    )

    val listData:ArrayList<Fruit>
            get(){
                val list = arrayListOf<Fruit>()
                for (position in fruitName.indices){
                    val fruit =  Fruit()
                    fruit.name = fruitName[position]
                    fruit.detail = fruitDetails[position]
                    fruit.image = fruitImages[position]
                    list.add(fruit)
                }
                return list
            }
}
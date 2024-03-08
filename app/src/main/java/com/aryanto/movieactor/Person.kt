package com.aryanto.movieactor

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var name: String,
    var desc: String,
    var photo: Int
) : Parcelable

val personList = listOf(
    Person(
        "Robert Downey Jr",
        "Tentang\n" +
                "Robert John Downey Jr. adalah seorang aktor, produser, dan penyanyi Amerika. Karirnya ditandai dengan kesuksesan kritis dan populer di masa mudanya, diikuti oleh periode Penyalahgunaan zat dan masalah hukum, \n" +
                "sebelum kebangkitan kesuksesan komersial di usia paruh baya. Wikipedia\n" +
                "Kelahiran: 4 April 1965 (usia 58 tahun), Manhattan, Kota New York, New York, Amerika\n" +
                "Anak: Indio Falconer Downey\n" +
                "Pasangan: Susan Downey (m. 2005), Deborah Falconer (m. 1992–2004)\n" +
                "Tinggi: 1,74 m\n" +
                "Orang tua: Robert Downey Sr., Elsie Ford\n" +
                "Saudara kandung: Allyson Downey\n" +
                "\n" +
                "sebelum kebangkitan kesuksesan komersial di usia paruh baya. \n" +
                "Pada tahun 2008, Downey dinamai oleh Time majalah di antara 100 orang paling berpengaruh di dunia, dan dari 2013 hingga 2015, dia terdaftar oleh Forbes sebagai aktor dengan bayaran tertinggi di Hollywood. \n" +
                "Filmnya telah meraup lebih dari \$ 14,4 miliar di seluruh dunia.\n" +
                "\n" +
                "Awalnya, perusahaan penyelesaian obligasi tidak akan mengasuransikan Downey, sampai Mel Gibson membayar jaminan asuransi untuk film tahun 2003 The Singing Detective.\n" +
                "Dia kemudian melanjutkan untuk membintangi komedi hitam Kiss Kiss Bang Bang (2005), film thriller Zodiac (2007), Dia kemudian melanjutkan untuk membintangi komedi hitam Tropic Thunder (2008); \n" +
                "untuk yang terakhir dia dinominasikan untuk sebuah Academy Award for Best Supporting Actor. \n" +
                "Downey mendapat pengakuan global karena membintangi sebagai Tony Stark / Iron Man dalam sepuluh film dalam Marvel Cinematic Universe, beginning with Iron Man (2008). \n" +
                "Dia juga memainkan Judul Karakter di Guy Ritchie Sherlock Holmes (2009), yang membuatnya mendapatkan Golden Globe keduanya, dan sekuelnya (2011).",
        R.drawable.robert_downey_jr
    ),

    Person(
        "Christopher Robert",
        "Tentang\n" +
                "Christopher Robert \"Chris\" Evans adalah seorang aktor Amerika. \n" +
                "Dikenal karena perannya sebagai Captain America dalam Marvel Cinematic Universe, Evans memulai karirnya dengan peran dalam serial televisi, seperti di Opposite Sex pada tahun 2000. Wikipedia\n" +
                "Kelahiran: 13 Juni 1981 (usia 42 tahun), Boston, Massachusetts, Amerika\n" +
                "Pasangan: Alba Baptista (m. 2023)\n" +
                "Tinggi: 1,83 m\n" +
                "Saudara kandung: Scott Evans, Shanna Evans, Carly Evans\n" +
                "Orang tua: G. Robert Evans III, Lisa Capuano\n" +
                "\n" +
                "Mengikuti penampilan di beberapa film remaja termasuk tahun 2001-an Not Another Teen Movie, dia mendapat perhatian karena perannya sebagai Marvel Comics character Human Torch di tahun 2005-an Fantastic Four,\n" +
                "dan sekuelnya Fantastic Four: Rise of the Silver Surfer (2007). \n" +
                "Evans membuat penampilan lebih lanjut dalam film adaptasi dari Comic books dan Novel grafik: TMNT (2007), Scott Pilgrim vs. the World (2010), dan Snowpiercer (2013).\n" +
                "\n" +
                "Dia memerankan Steve Rogers / Captain Amerika dalam beberapa film MCU, yaitu \n" +
                "Captain America: The First Avenger (2011), \n" +
                "Captain America: Civil War (2016), \n" +
                "dan film ansambel The Avengers (2012), \n" +
                "Captain America: The Winter Soldier (2014), \n" +
                "Avengers: Age of Ultron (2015), \n" +
                "Avengers: Infinity War (2018), \n" +
                "dan Avengers: Endgame (2019). \n" +
                "Karyanya di serial Marvel membuatnya menjadi salah satu aktor dengan bayaran tertinggi di dunia.[2]",
        R.drawable.chris_evans
    ),

    Person(
        "Scarlett Ingrid Johansson",
        "Tentang\n" +
                "Scarlett Ingrid Johansson adalah aktris dan penyanyi Amerika Serikat. Dia adalah salah satu aktris dengan bayaran tertinggi di dunia dari 2014 sampai 2016 yang namanya telah banyak muncul dalam Forbes Celebrity 100. Wikipedia\n" +
                "Kelahiran: 22 November 1984 (usia 38 tahun), Manhattan, Kota New York, New York, Amerika\n" +
                "Pasangan: Colin Jost (m. 2020), Romain Dauriac (m. 2014–2017), Ryan Reynolds (m. 2008–2011)\n" +
                "Saudara kandung: Vanessa Johansson, Hunter Johansson, Christian Johansson, Fenan Sloan, Adrian Johansson\n" +
                "Tinggi: 1,6 m\n" +
                "Orang tua: Karsten Johansson, Melanie Sloan\n" +
                "Anak: Rose Dorothy Dauriac\n" +
                "\n" +
                "Sejak belia ia sudah bercita-cita menjadi aktris, dan pertama kali tampil di atas panggung dalam sebuah pertunjukan drama Off-Broadway saat masih kecil. \n" +
                "Johansson memulai debut filmnya dalam film komedi fantasi North (1994) dan dinominasikan untuk penghargaan Independent Spirit atas perannya dalam film Manny & Lo (1996). \n" +
                "Dia juga mendapatkan pengakuan atas karyanya dalam The Horse Whisperer (1998) dan Ghost World (2001).\n" +
                "\n" +
                "Dalam peran debutannya pada tahun 2010 di panggung Broadway dalam pementasan kembali dari A View from the Bridge, yang akhirnya memberikannya penghargaan Tony Award for Best Featured Actress in a Play. \n" +
                "Pada tahun yang sama, ia mulai berperan sebagai Black Widow dalam Marvel Cinematic Universe. \n" +
                "Dalam sebuah film komedi drama tahun 2013, Her, ia menjadi pengisi suara operating sistem komputer yang sangat pintar, \n" +
                "bermain sebagai makhluk luar angkasa di film fiksi ilmiah Under the Skin (2013) dan sebagai seorang wanita dengan kemampuan psikokinetis buatan tahun 2014, Lucy. \n" +
                "Ia adalah aktris berpenghasilan terbesar pada tahun 2016, serta aktris berpenghasilan kotor terbesar sepanjang masa di area Amerika Utara, dalam satuan mata uang Dolar Amerika Serikat.",
        R.drawable.scarlett_johansson
    ),

    Person(
        "Chris Hemsworth",
        "Tentang\n" +
                "Christopher \"Chris\" Hemsworth AM adalah seorang aktor Australia. \n" +
                "Dia menjadi terkenal bermain Kim Hyde dalam serial televisi Australia Home and Away sebelum memulai karir film di Hollywood. Wikipedia\n" +
                "Kelahiran: 11 Agustus 1983 (usia 40 tahun), Melbourne, Australia\n" +
                "Pasangan: Elsa Pataky (m. 2010)\n" +
                "Film mendatang: Furiosa, Avengers: Secret Wars, Avengers: The Kang Dynasty\n" +
                "Tinggi: 1,9 m\n" +
                "Lokasi pernikahan: Pulau Sumba\n" +
                "Saudara kandung: Liam Hemsworth, Luke Hemsworth\n" +
                "\n" +
                "Christopher \"Chris\" Hemsworth\n" +
                "Dalam Marvel Cinematic Universe (MCU), Hemsworth mulai bermain Thor dengan Film 2011 dengan judul yang sama dan yang terbaru mengulang peran dalam What If.? (2021), yang membuatnya menjadi salah satu aktor dengan bayaran tertinggi di dunia.\n" +
                "\n" +
                "Peran filmnya yang lain termasuk aksi films Star Trek (2009), \n" +
                "Snow White and the Huntsman (2012), Red Dawn (2012), \n" +
                "Blackhat (2015), Men in Black: International (2019), \n" +
                "Extraction (2020), film thriller A Perfect Getaway (2009) dan komedi Ghostbusters (2016). \n" +
                "Film-film Hemsworth yang paling diakui secara kritis termasuk komedi horor The Cabin in the Woods (2012) dan film olahraga biografi Rush (2013) di mana dia menggambarkan James Hunt.",
        R.drawable.chris_hemsworth
    ),

    Person(
        "Mark Ruffalo",
        "Tentang\n" +
                "Mark Alan Ruffalo' adalah aktor dan produser Amerika. Dia mulai berakting pada awal 1990-an dan pertama kali mendapat pengakuan atas karyanya di Kenneth Lonergan's bermain This Is Our Youth dan film drama You Can Count on Me. Wikipedia\n" +
                "Kelahiran: 22 November 1967 (usia 55 tahun), Kenosha, Wisconsin, Amerika\n" +
                "Tinggi: 1,73 m\n" +
                "Pasangan: Sunrise Coigney (m. 2000)\n" +
                "Anak: Keen Ruffalo, Bella Noche Ruffalo\n" +
                "Orang tua: Frank Lawrence Ruffalo, Marie Rose Hebert\n" +
                "  \n" +
                "Dia kemudian membintangi film komedi romantis 13 Going on 30 (2004), Just like Heaven (2005) dan thriller In the Cut (2003), Zodiac (2007), dan Shutter Island (2010). Dia menerima sebuah Tony Award nominasi untuk peran pendukungnya di Broadway kebangkitan dari Awake and Sing! Pada tahun 2006. \n" +
                "Ruffalo mendapat pengakuan internasional untuk bermain Bruce Banner / Hulk sejak 2012 di franchise superhero dari Marvel Cinematic Universe.\n" +
                "\n" +
                "Ruffalo membintangi: \n" +
                "The Avengers (2012), angsuran keenam dari Marvel Cinematic Universe, mengganti Edward Norton sebagai Dr. Bruce Banner / Hulk.\n" +
                "Dia mengulangi peran itu lagi Avengers: Age of Ultron (2015), Thor: Ragnarok (2017), Avengers: Infinity War (2018), dan Avengers: Endgame (2019). \n" +
                "Dia terkenal karena merusak akhir cerita Avengers: Infinity War setahun sebelum rilis teater,[20][21] sebaik Avengers: Endgame beberapa minggu sebelum rilis.\n" +
                "Ruffalo juga dibuat kameo sebagai Spanduk di Iron Man 3, Captain Marvel, dan Shang-Chi and the Legend of the Ten Rings, dan dia mengulangi peran itu She-Hulk: Attorney at Law.",
        R.drawable.mark_ruffalo
    ),

    Person(
        "Chadwick Boseman",
        "Tentang\n" +
                "Chadwick Aaron Boseman adalah aktor dan dramawan Amerika Serikat. Setelah menuntut ilmu penyutradaraan di Universitas Howard, ia terkenal di kancah teater dengan memenangi Drama League Directing Fellowship dan akting AUDELCO, dan dinominasikan untuk Jeff Award sebagai penulis naskah lewat Deep Azure. Wikipedia\n" +
                "Kelahiran: 29 November 1976, Anderson, Carolina Selatan, Amerika\n" +
                "Meninggal: 28 Agustus 2020, Los Angeles, California, Amerika\n" +
                "Tinggi: 1,83 m\n" +
                "Tanggal pemakaman: 3 September 2020\n" +
                "Orang tua: Leroy Boseman, Carolyn Boseman\n" +
                "Lahir: Chadwick Aaron Boseman; 29 November 1976; Anderson, Carolina Selatan, Amerika Serikat\n" +
                "\n" +
                "Chadwick Aaron Boseman \n" +
                "Ketika ia berpindah ke kancah perfilman, ia mendapatkan peran utama pertamanya di serial reguler Persons Unknown pada tahun 2010, dan ia pertama kali dikenal lewat perannya sebagai pemain bisbol Jackie Robinson dalam film biografi tahun 2013 42. \n" +
                "Ia terus memerankan tokoh-tokoh bersejarah, yakni membintangi Get on Up (2014) sebagai penyanyi James Brown dan Marshall (2017) sebagai Hakim Agung Thurgood Marshall.\n" +
                "\n" +
                "Ia mulai dikenal di seluruh dunia lewat perannya sebagai adiwira Black Panther dalam Marvel Cinematic Universe (MCU) sejak 2016 hingga 2019. Ia muncul di empat film MCU,\n" +
                "termasuk film tahun 2018 yang membuatnya mendapatkan Outstanding Actor in a Motion Picture NAACP Image Award dan a Screen Actors Guild Award for Outstanding Performance by a Cast in a Motion Picture. \n" +
                "Sebagai aktor kulit hitam pertama yang menjadi headline film MCU, ia juga masuk dalam nominasi 2018 Time 100.\n" +
                "\n" +
                "Pada tahun 2016, Chadwick didiagnosis menderita kanker usus besar. \n" +
                "Chadwick merahasiakan kondisinya, terus bertindak sementara juga secara ekstensif mendukung amal kanker sampai kematiannya pada tahun 2020 karena penyakit tersebut. \n" +
                "Film terakhirnya, Ma Rainey's Black Bottom, ditayangkan selepas kematiannya pada tahun yang sama mendapat ulasan positif, sehingga menjadikannya mendapat nominasi Aktor Terbaik Academy Award dan Aktor Terbaik Film Drama Penghargaan Golden Globe. \n" +
                "Chadwick juga menerima empat nominasi di Screen Actors Guild Awards ke-27 lewat karyanya Da 5 Bloods dan Ma Rainey's Black Bottom, yang terbanyak untuk penampil di satu upacara.",
        R.drawable.chadwick_boseman
    ),

    Person(
        "Tom Holland",
        "Tentang\n" +
                "Thomas Stanley Holland adalah seorang aktor asal Inggris. Lulusan BRIT School di London, ia memulai karir aktingnya di atas panggung teater dalam peran judul Billy Elliot the Musical di West End dari tahun 2008 hingga 2010. Wikipedia\n" +
                "Kelahiran: 1 Juni 1996 (usia 27 tahun), Kingston upon Thames, Britania Raya\n" +
                "Tinggi: 1,69 m\n" +
                "Penghargaan: British Academy Film Award untuk Rising Star Award, LAINNYA\n" +
                "Saudara kandung: Harry Holland, Paddy Holland, Sam Holland\n" +
                "Orang tua: Dominic Holland, Nikki Holland\n" +
                "\n" +
                " \n" +
                "Ia mendapatkan pengakuan untuk perannya dalam film bencana The Impossible (2012), menerima Penghargaan London Film Critics Circle kategori Young British Performer of the Year.\n" +
                "\n" +
                "Holland mulai semakin terkenal karena memerankan Spider-Man dalam film superhero Marvel Cinematic Universe,\n" +
                "Captain America: Civil War (2016), Spider-Man: Homecoming (2017),\n" +
                "Avengers: Infinity War (2018), Avengers: Endgame (2019), Spider-Man: Far From Home (2019) dan Spider-Man: No Way Home (2021). \n" +
                "Pada tahun 2017, Holland yang berusia dua puluh tahun menjadi penerima Penghargaan BAFTA Rising Star termuda kedua.\n" +
                "\n" +
                "Pada Juli 2017, Spider-Man: Homecoming dirilis, di mana Holland mengulangi perannya dari Captain America: Civil War. \n" +
                "Homecoming menerima ulasan positif dan banyak pujian bagi Holland, dengan penampilannya disebut \"pertunjukan bintang yang diberikan oleh aktor yang baru terlahir\". \n" +
                "Film ini meraih keuntungan lebih dari \$800 juta di seluruh dunia. \n" +
                "Penampilan ini membuat Holland mendapatkan gelar Guinness World Records sebagai aktor termuda yang memainkan peran utama di MCU.",
        R.drawable.tom_holand
    ),

    Person(
        "Brie Larson",
        "Tentang\n" +
                "Brie Larson adalah aktris dan penyanyi asal Sacramento, California. Ia ikut peran dalam menulis lagu dan bermain gitar di debut albumnya yang sukses lewat single \"She Said\". Awalnya Ia memutuskan untuk menjadi seorang aktris ketika berumur 7 tahun dan Iapun pindah ke Los Angeles. Wikipedia\n" +
                "Kelahiran: 1 Oktober 1989 (usia 34 tahun), Sacramento, California, Amerika\n" +
                "Tinggi: 1,7 m\n" +
                "Orang tua: Sylvain Desaulniers, Heather Desaulniers\n" +
                "Saudara kandung: Milaine Desaulniers\n" +
                "\n" +
                "Pada tahun 2003 ia menciptakan lagu yang berjudul \"Go\" yang akhirnya dinamai \"Go Goodbye\" dan \"Invisible Girl\". \n" +
                "Ia mengadakan kontrak dengan Universal Music dan Casablanca Records. Pada tahun itu juga, ia mulai mempromosikan single pertamanya yang berjudul \"She Said\". \n" +
                "Yang pertama kali diperdengarkan di Radio KOL. \n" +
                "Single ini ada pada album Finally Out of P.E.. Single keduanya berjudul \"Life After You\". Ia juga menyanyikan lagu soundtrack dari film \"Barbie and the Magic of Pegasus\" yang berjudul \"Hope Has Wings\". \n" +
                "Video dari lagu ini tersedia di DVD film tersebut",
        R.drawable.brie_larson
    ),

    Person(
        "Tom Hiddleston",
        "Tentang\n" +
                "Thomas William \"Tom\" Hiddleston adalah seorang aktor asal Inggris. Ia lahir di Westminster, London dan menghabiskan masa kecilnya di Wimbledon dan Oxford. Ia bersekolah di sekolah asrama, Dragon School di Oxford dan saat usia 13 tahun, ia belajar di Eton College. Wikipedia\n" +
                "Kelahiran: 9 Februari 1981 (usia 42 tahun), Westminster, London, Britania Raya\n" +
                "Partner: Zawe Ashton (2020–)\n" +
                "Tinggi: 1,87 m\n" +
                "Orang tua: James Norman Hiddleston, Diana Patricia Hiddleston\n" +
                "Saudara kandung: Emma Hiddleston, Sarah Hiddleston\n" +
                "Lahir: Thomas William Hiddleston; 9 Februari 1981 (umur 42); Westminster, London, Britania Raya\n" +
                "\n" +
                "Hiddleston melanjutkan kuliah di Pembroke College, Cambridge University, di mana ia lulus dengan predikat double first.\n" +
                "Saat kuliah di Cambridge, Lorraine Hamilton, seorang agen pencari bakat dari Hamilton Hodell melihatnya di sebuah produksi berjudul A Streetcar Named Desire.\n" +
                "Hiddleston kemudian memutuskan untuk belajar akting di Royal Academy of Dramatic Art (RADA) dan lulus pada tahun 2005. \n" +
                "Ia mulai tenar setelah terlibat dalam beberapa acara televisi dan film. Ia memerankan Loki di film Thor (2011) karya Marvel Studios, Kapten Nicholls di War Horse (2011) karya Steven Spielberg, dan Freddie Page di drama Britania Raya The Deep Blue Sea bersama Rachel Weisz. \n" +
                "Ia memerankan penulis F. Scott Fitzgerald dalam film Midnight in Paris (2011) karya Woody Allen. \n" +
                "Ia kembali berperan sebagai Loki di The Avengers (2012) dan Thor: The Dark World (2013).\n" +
                "\n" +
                "Hiddleston memenangkan penghargaan sebagai pendatang baru terbaik di Laurence Olivier Award untuk perannya di Cymbeline dan sekaligus dinominasikan untuk penghargaan yang sama untuk perannya sebagai Cassio di Othello. \n" +
                "Pada tahun 2011 ia memenangkan Empire Award untuk Aktor pendatang baru terbaik dan dinominasikan untuk BAFTA Rising Star Award dalam perannya di film Thor. \n" +
                "Pada tahun 2013 ia memenangkan MTV Movie Award untuk Best Fight dan Best Villain di film The Avengers. \n" +
                "Dan berkat perannya di teater sebagai Coriolanus, ia memenangkan Evening Standard Theatre Award untuk Aktor terbaik.\n" +
                "\n" +
                "Di luar film, Hiddleston juga aktif sebagai pendukung kegiatan kemanusiaan yang tergabung dalam UNICEF. \n" +
                "Di awal tahun 2013, ia mengunjungi Guinea bersama UNICEF untuk membantu menumbuhkan kesadaran tentang kelaparan dan kekurangan gizi terhadap wanita dan anak-anak yang ada di negara tersebut.",
        R.drawable.tom_hiddleston
    ),

    Person(
        "Chris Pratt",
        "Tentang\n" +
                "Christopher Michael Pratt adalah seorang aktor asal Amerika Serikat. Dia menjadi terkenal karena memerankan Andy Dwyer di sitkom NBC, Parks and Recreation. Dia juga tampil dalam serial drama The WB, Everwood dan memiliki peran pendukung dalam film Wanted, Jennifer's Body, Moneyball, Zero Dark Thirty dan Her. Wikipedia\n" +
                "Kelahiran: 21 Juni 1979 (usia 44 tahun), Virginia, Minnesota, Amerika\n" +
                "Pasangan: Katherine Schwarzenegger (m. 2019), Anna Faris (m. 2009–2018)\n" +
                "Anak: Eloise Christina Schwarzenegger Pratt\n" +
                "Tinggi: 1,88 m\n" +
                "Film mendatang: Garfield, The Electric State\n" +
                "\n" +
                "Pratt kemudian berperan sebagai Star-Lord dalam berbagai film superhero Marvel Cinematic Universe, termasuk Guardians of the Galaxy (2014), Guardians of the Galaxy Vol. 2 (2017), \n" +
                "Avengers: Infinity War (2018), Avengers: Endgame (2019) dan Thor: Love and Thunder (2022).\n" +
                "Ia juga berperan sebagai Owen Grady dalam film aksi petualangan Jurassic World (2015), dan sekuelnya Jurassic World: Fallen Kingdom (2018) dan Jurassic World Dominion (2022).\n" +
                "\n" +
                "Peran utama Pratt lainnya adalah dalam film The Magnificent Seven (2016), Passengers (2016) dan The Tomorrow War (2021). \n" +
                "Pada tahun 2015, majalah Time menobatkannya sebagai salah satu dari 100 orang paling berpengaruh di dunia.\n" +
                "\n" +
                "Pratt keluar dari community college pada pertengahan semester pertama, setelah bekerja sebagai penjual tiket dan penari telanjang pada siang hari, dia akhirnya menjadi tunawisma di Maui, Hawaii, tidur di sebuah van dan tenda di pantai. \n" +
                "Dia memberi tahu The Independent, \"Ini tempat yang sangat luar biasa untuk menjadi tunawisma. Kami hanya minum dan merokok gulma dan bekerja dengan jam kerja minimal, cukup untuk membayar gas, makanan, dan persediaan ikan.\" \n" +
                "Dia ingat mendengarkan album Dr. Dre, 2001 setiap hari, sampai pada titik di mana dia tahu setiap lirik; bertahun-tahun kemudian, dia nge-rap lirik Eminem dari lagu \"Forgot About Dre\".\n" +
                "Saat di Maui, dia bekerja untuk organisasi misionaris Jews for Jesus.",
        R.drawable.chris_pratt
    )
)

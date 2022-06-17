# week-4-assignment4-pelinhangisi

Konu : 

1- PostgreSQL DB Baglantısı

2- Create user ve create advertisement servisi yazilacak

3- Servislerde veri olusturmak icin 50ser tane queue mesaji olusturulacak

4- Queue”dan mesajlar consume edilip 1dk bekledikten sonra random veriler olusturulup veritabaninda kayitlar olusturulacak.

        -User kayitlarini random isim soyisimle olustur

                “Ahmet”, “Mehmet” gibi iki liste yapip birinden isim birinden soyisim sec

                isim.soyisim@mail.com diye mailini olustur.

Advertisement olusturmak icin once veritabanindan random user id sec (bunu vt sorgusuyla direkt idyi alacak sekilde yapabilirsiniz)
Title alanini iki liste icinden random olustur
1.liste “satilik” “kiralik” “temiz” “doktordan” “ihtiyactan” gibi kelimeler icersin
2.liste “ev” “araba” “villa” “arsa” gibi degerler icersin
Description alani cumlelerin bulundugu bir listeden iki uc cumle secilerek olusturulabilir.
“Ihtiyactan satilik”
“Asansorlu”
“Kombili”
“fiber altyapisi var”
“Guven emlak”
“aktas emlak”
“Kalite guven bizim isimiz” gibi cumleler olabilir. :D
Created_at alani veritabaninda olusturulacak kayit atildigi anda.

1- Ilan Filtreleme icin servis

Tarihe gore
Title veya descriptionda gecen kelimeye gore
Fiyat araligina gore
(Bunlar parametre olarak aliinip hangisi doluysa ona gore sorgu olusturulabilir.
Ayri ayri servis halinde de yazabilirsiniz.Kendi seviyenize gore kendiniz secebilirsiniz )

2- Her userin sadece son ilanini secip, iclerinden son 10 tanesini getiren servis


## Kullanılan Teknolojiler 


* Spring Boot
* Postman
* Rabbitmq
* PostgreSQL
* Docker
* https://www.mockaroo.com/

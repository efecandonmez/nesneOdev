# nesneOdev
 Buton Odevi

PROJE HAKKINDA GENEL BİLGİ
Kod, JAVA dilini kullanarak 4x4 butonlardan oluşan bir matrisi arayüzde oluşturmaktadır. Arayüze toplamda 16 tane buton çıktı alınacak ve butonların üstünde durumlarını gösteren simgeler olacak. Butonların iki durumu olacak; Aktif halleri ve pasif halleri. Butonların default olarak ilk durumları pasif haldir. Yani projeyi çalıştırığımızda butonlar pasif halde oluşacaklardır. Butonların üstlerinde bu hallerine uygun olan imgeler ve pasif hallerini temsil eden arkaplan rengi bulunacaktır. Ve bu butonların üstüne tıklayarak onları aktif hale getirebileceğiz. Aktif hale getirdiğimizde ise aktif hale gelenlerin her biri sistemdeki aktif butonlar bölmesine kaydolacaktır. Ve aktif haldeki butonlarda da pasif haldeki gibi bu durumlarını temsil eden imge ve arkaplan renkleri gözükecektir. Yani projedeki asıl özet butonlar dizisine iki durum ekleyip onlar arasında gidiş geliş sağlayıp butonun durumlarını değiştirmektir.

PROJENİN ÇALIŞMA PRENSİBİ
Kod öncelikle her öğesi buton olan 4x4 bir matris oluşturmaktadır. Bunun için de tek tek oluşturmaktansa buton öğesi oluşturan bir for döngüsüyle bu işlemi hallediyoruz. Ve butonların iki halden oluşmasını istediğimiz için bu kısmı da arrayList kullanarak hallediyoruz. Yani butonlar durumlarına göre bellekte yer değiştirecekler. Başlangıçta hepsi pasif durumda kalacak ve aktif hale getirildikçe aktif butonların Array'ine taşınacak. Mantık bundan ibaret. Ve bunu yapmak için tek tık yeterli oluyor. Her pasif butona tıklandığında onu aktif hale getiriyor ta ki aktif bir butona tıklanana kadar. Aktif butona tıklandığında döngü kırılıyor ve aktif butonların hepsi eski haline dönüyor. Ve bu farkı görsel olarak da anlamak için iki duruma da renk ve imge endeks edildi.

GÖRSELLER
![imageGraphQL](https://github.com/efecandonmez/nesneOdev/assets/126791265/cde33882-f236-4b47-8d2b-dc679edf9f05)
![image](https://github.com/efecandonmez/nesneOdev/assets/126791265/4fa7bb78-2ab2-4e89-b86c-ce74c1a33442)
![result](https://github.com/efecandonmez/nesneOdev/assets/126791265/7452b8bd-b2b0-4615-b933-ab75bac249e6)







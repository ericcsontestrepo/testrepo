# testrepo
Repoda 2 tane uygulama mevcut, 

1. MessageService
QNB için yazdığım kullanıcıların şikayetleri ilettiği, bu şikayetlerin xlsx dosyasına kaydedildiği basit bir uygulama. 

Çalıştırmak için öncelikle rapoyu local bilgisayarınaz clone layın. herhangi bir klasör içerisinde cmd.exe ya da bash ile aşağıdaki komutu çalıştırın.

git clone https://github.com/ericcsontestrepo/testrepo.git

bulunduğunuz dizine 2 adet projenin source codu ve benim build ettiğim çalışır olan jar dosyaları indirilecektir.

projects.rar dosyasını bir klasöre çıkartın.

QNB projesi herhangi bir bağımlılığı olmayan, standalone çalışan bir uygulamadır, bulunduğunuz klasörde qnb.xlsx dosyası olması yeterlidir. 

uygulamayı çalıştırmak için, dosyaları açtığınız dizinde cmd komut satırından ya da bash ile, 

java -jar qnbMessage-0.0.1-SNAPSHOT.jar


komutunu çalıştırın, console da spring boot projesinin ayağa kalktığını göreceksiniz, uygulama ayağa kalktıktan sonra 

http://localhost:8080
adresini açın. burada kullanıcıların problemleri yazdığı bir sayfa açılacaktır, kayıt ekleyebilir, kayıtları görüntüleyebilirsiniz, uygulama tüm kayıtları qnb.xlsx dosyasına kaydedecektir. spring boot 2.0.4, thymeleaf ve xlsx dosya okuma yazma için apache poi kullanıldı.


2. nekadar
Bu uygulama hibernate ile postgresql üzerinden, kullanıcı oluşturup, sayfalama, görüntüleme, update etme gibi özellikler içermektedir. 

uygulamanın postgresql bağımlılığı vardır, 
https://www.enterprisedb.com/downloads/postgres-postgresql-downloads

adresinden installer yardımı ile kurulum yapın. (testler version 10.11 üzerinden yapıldı)
kurulam yapılırken pgadminin de yüklendiğinden emin olun. kurulum yapılırken postgres kullanıısı için şifre istenecektir, 1234 seçin.

uygulamada resources altında aplication.properties dosyası içerisinde bu şifre istenildiği gibi ayarlanabilir. 

uygulama yüklendikten sonra, kurulumun yapıldığı dizine gidin, pgadmin klasöründe, bin altında, pgadmin4.exe yi çalıştırın. 

postgresql admin sayfası açılınca, sol tarafta servers yazdığnı görüceksiniz.
servers a sağ tıklayıp, create - > server yaptıktan sonra, açılan pencerede, general sekmesinde name olarak myserver yazıp, connection sekmesine de hostnameAdress kısmına localhost yazın.

save ettikten sonra, localhost serverimiz oluşturulacak. sol tarafta myserver altında databases seçeneğine sağ tıklayın ve create databases seçin. açılan pencerede general sekmesinde dadabase kısmına büyük harflerle MAINDB yazın, owner ın postgres olduğundan emin olun. save edin.

projects.rar dosyasını açtığınız dizine gidin ve cmd ile ya da bash ile aşağıdaki komutu çalıştırın.

java -jar nekadar-0.0.1-SNAPSHOT.jar

uygulama ayağa kalkarken, MAINDB altına gerekli tabloları oluşturacak ve dummy kayıtlar atacaktır, console dan takip edeblirsiniz.

http://localhost:8080/

adresinden uygulamayı kullanabilirsiniz. uygulamada, spring boot, tyhmeleaf, jquery, hibernate, bootstrap 4 ve postgresql kullanıldı.

Not. iki uygulamayı aynı anda çalıştırmayın. cmd consolu uygulama çalışırken açık olmalı, logları oradan takip edebilirsiniz. 












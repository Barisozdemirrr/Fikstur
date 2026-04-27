# Fikstür Oluşturucu (Fixture Generator)

Verilen takım sayısına göre tek devreli ve çift devreli (rövanşlı) lig fikstürünü otomatik olarak oluşturan konsol tabanlı bir Java uygulamasıdır.

## Proje Hakkında

Kullanıcıdan takım sayısı ve takım isimleri alınır; ardından tüm takımların birbirleri ile karşılaşacağı bir fikstür oluşturulur. Tek sayıda takım girilmesi durumunda otomatik olarak "BAY" takımı eklenir; "BAY" ile eşleşen takımlar ilgili haftada maç yapmamış sayılır. Algoritma, sabit takım yöntemine (round-robin) göre çalışır.

### Kurallar

- Çift devreli lig usulü uygulanır; her takım diğer takımlarla biri kendi sahasında, diğeri deplasmanda olmak üzere iki maç yapar
- Listenin sol tarafı ev sahibini, sağ tarafı deplasman takımını gösterir
- Tek sayıda takım girilirse çift sayıya tamamlanacak şekilde "BAY" takımı eklenir
- Başlangıçta takımların sıralaması rastgeledir

## Kullanılan Java Özellikleri

- **Collections Framework**:
  - `ArrayList<String>` ile dinamik takım listesi
  - `LinkedHashMap<String, ArrayList<ArrayList<String>>>` ile haftalara göre sıralı maç saklama
  - `List` arayüzü ile soyutlama
- **Scanner**: Kullanıcıdan komut satırı üzerinden veri okuma
- **Math API**: `Math.random()` ile rastgele indeks üretimi
- **Kontrol Yapıları**: `for`, `while`, `if-else`
- **Algoritma Tasarımı**: Sabit takım metoduyla round-robin kombinasyonu

## Proje Yapısı

```
Fikstur/
├── src/
│   └── Main.java
├── out/
└── Fikstur.iml
```

## Örnek Çalıştırma

```
Lutfen takım sayisini giriniz : 4
Lutfen takım isimlerini giriniz :
Galatasaray
Lutfen takım isimlerini giriniz :
Fenerbahce
Lutfen takım isimlerini giriniz :
Besiktas
Lutfen takım isimlerini giriniz :
Trabzonspor

1. Hafta
Galatasaray vs Fenerbahce
Trabzonspor vs Besiktas
...
```

## Gereksinimler

- Java JDK 8 veya üzeri

## Nasıl Çalıştırılır?

### Komut Satırı ile

```bash
cd Fikstur/src
javac Main.java
java Main
```

### IntelliJ IDEA / Eclipse ile

1. Projeyi IDE üzerinde açın
2. `src/Main.java` dosyasını çalıştırın
3. Konsola takım sayısı ve takım isimlerini girerek fikstürü görüntüleyin

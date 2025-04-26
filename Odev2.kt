package com.example.kotlinweek1.ödevler

fun main() {
    val soru1 = fahrenhiet(30.0)

    val soru2 = cevreHesapla(6,8)

    val soru3 = faktoriyel(5)

    val soru4 = harfbulma("Ahmet")

    val soru5 = icacilartop(5)

    var soru6 = maashesap(20)
}

fun fahrenhiet(sayi1:Double): Double{
    var sonuc1 = (sayi1*1.8) + 32
    println(sonuc1)
    return sonuc1
}

fun cevreHesapla(sayi1:Int,sayi2:Int): Int{
    var sonuc = (sayi1+sayi2) * 2
    return sonuc
}

fun faktoriyel(sayi1: Int): Int {
    var sonuc = 1
    for(i in 1..sayi1){
        sonuc*=i
    }
    println(sonuc)
    return sonuc
}

fun harfbulma(kelime:String):Int{

    val kucukKelime = kelime.lowercase()
    var sayac=0
    kucukKelime.forEach { harf ->
        if(harf == 'a'){
            sayac+=1
        }
    }
    println(sayac)
    return sayac
}

fun icacilartop(sayi:Int):Int{
    var icacitoplam = (sayi - 2) * 180
    if (sayi<=2)
        println("en az 3 kenar giriniz")
    else
        println(icacitoplam)
    return icacitoplam
}

fun maashesap(gün:Int):Int{
    var maas = 0
    var saat = gün*8
    if(saat>=160){
        maas+=(saat-160)*20
        maas+=1600
    }
    else
        maas+=saat*10
    println(maas)
    return maas
}
using System;

namespace ClassMetotDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            MusteriYoneticisi musteriManager = new MusteriYoneticisi();
            musteriManager.Ekle(11122, "Erdem Duman", "Erkek", 27);
            musteriManager.Ekle(11133, "Sude Sesigüzel", "Kadın", 28);
            musteriManager.Ekle(11144, "Ümit Toprak", "Erkek", 54);
            musteriManager.Ekle(11155, "Hasan Can", "Erkek", 35);
            musteriManager.Ekle(11166, "Tülin Öztürk", "Kadın", 42);

            musteriManager.Sil(11155);
            musteriManager.Listele();
            
        }
    }
}

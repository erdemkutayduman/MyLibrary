using System;
using System.Collections.Generic;
using System.Text;


namespace MyDictionary
{
    class Gun4Odev5
    {
        public static void Main(string[] args)
        {

            // String anahtarına sahip string değerler tutan dictionary oluşturma.
            MyDictionary<string, string> dictionary = new MyDictionary<string, string>();

            // Anahtar-Değer verilerini Dictionary'e ekleme. 
            dictionary.Add("1", "C");
            dictionary.Add("2", "C++");
            dictionary.Add("3", "Java");
            dictionary.Add("4", "Python");
            dictionary.Add("5", "C#");
            dictionary.Add("6", "HTML");

            // Dicitonary elemanlarını yazdırma.
            dictionary.WriteKeyValuePair();

        }
    }

    class MyDictionary<TKey, TValue>
    {
        public List<TKey> keys { get; set; }
        public List<TValue> values { get; set; }

        public MyDictionary()
        {
            this.keys = new List<TKey>();
            this.values = new List<TValue>();
        }

        public void Add(TKey key, TValue value)
        {
            // Value ne olursa olsun , key unique olmalı. 
            if (!this.keys.Contains(key))
            {
                keys.Add(key);
                values.Add(value);
            }
            else if (this.keys.Contains(key))
            {
                Console.WriteLine("This key data '{0}' already exists.", key);
            }
        }

        public void WriteKeyValuePair()
        {
            Console.WriteLine();
            for (int i = 0; i < keys.Count; i++)
            {
                Console.WriteLine("Key: {0} - Value: {1}", this.keys[i], this.values[i]);
            }
            Console.WriteLine();
        }
    }
}





   


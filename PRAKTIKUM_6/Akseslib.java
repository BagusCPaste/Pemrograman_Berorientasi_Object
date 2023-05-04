package PRAKTIKUM_6;

import PRAKTIKUM_6.id.ac.dinus.lib.Mylib;
import PRAKTIKUM_6.id.ac.dinus.lib.YourLib;
import PRAKTIKUM_6.id.ac.dinus.test.HisLib;

public class Akseslib {
       public static void main(String[] args) {
              Mylib mylib= new Mylib();
              mylib.cetak();

              YourLib yourLib = new YourLib();
              yourLib.cetak2();

              HisLib hisLib = new HisLib();
              hisLib.cetak3();
       }
}
package Project6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Inventory2{
    Scanner run = new Scanner(System.in);

    int semua;
    int[] kodebarang = new int[10];
    int[] hargaBarang = new int[10];
    int[] stokBarang = new int[10];
    int[] nilaiBarang = new int[10];
    String[] nama = new String[10];

    public void menu(){
        do{
            System.out.println("Jumlah Barang Yang Diinput : ");
            semua = run.nextInt();

            if (semua < 1){
                System.out.println("Inputan Yang Anda Masukkan Tidak Valid");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }

    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Barang"+(i+1));
                System.out.println("Nama Barang: ");
                run.nextLine();
                kodebarang[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("Harga Barang (satuan) : ");
                hargaBarang[i]= run.nextInt();
                System.out.println("Stok Barang           : ");
                stokBarang[i]= run.nextInt();
                nilaiBarang[i]=stokBarang[i]*hargaBarang[i];
            }
        }catch (InputMismatchException e){
            System.out.println("Inputan anda tidak valid");
            run.nextLine();
            menu();
        }
    }

    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("Kode Barang          : "+kodebarang[i]);
            System.out.println("Nama Barang          : "+ nama[i]);
            System.out.println("Jumlah Stok Barang   : "+stokBarang[i]);
            System.out.println("Harga Satuan         : "+hargaBarang[i]);
            System.out.println("Total Harga          : "+nilaiBarang[i]);
        }
    }
}
package Stack_Tumpukan;
public class Stack_App {
public static void main (String [] args){
    Stack tumpukan=new Stack(10);
    //memasukkan nilai 50
    tumpukan.push(50);
    tumpukan.baca();
    //memasukkan nilai 100
    tumpukan.push(100);
    tumpukan.baca();
    //mengeluarkan nilai 100 dan memasukkan nilai 50 kembali
    tumpukan.pop();
    tumpukan.baca();
    System.out.println(" ");
    //memasukkan nilai 60
    tumpukan.push(60);
    tumpukan.baca();
    //memasukkan nilai 80
    tumpukan.push(80);
    tumpukan.baca();
    //mengeluarkan kembali nilai 80
    tumpukan.pop();
    tumpukan.baca();
    System.out.println(" ");
    long nilaitop = tumpukan.peek(); //melihat data yang berada pada posisi paling atas
    System.out.println("nilai top = "+ nilaitop);
}   
}